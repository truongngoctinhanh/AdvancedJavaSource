package Task8_1_2_3;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 16 - 09 - 2016
 * @Version: 01
 * @class for controller user
 */
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.PreparedStatement;

public class UserController {
	Database db =  new Database();
	User user = new User();
	/**
	 * @Function for check username and password to allow user login
	 * @Input: username, password
	 * @Output: user
	 */
	public User loginUser(String username, String password) throws ClassNotFoundException, SQLException {
		User user = null;
		try(Connection conn = db.connect()) {
			java.sql.Statement statement = conn.createStatement();
			String sql = "SELECT * FROM user WHERE username like '"+ username +"' and password like '"+ password +"'";
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				user = new User();
				user.setUsername(resultSet.getString("username"));
				user.setPassword(resultSet.getString("password"));
				break;
			}
			conn.close();
		}catch(SQLException e){
			System.out.println("Error: " + e.getMessage());
		}
		return user;		
	}
	
	/**
	 * @Function for display all user in mySql database 
	 * @Input: none
	 * @Output: list user
	 */
	public List<User>  ShowUser()  throws ClassNotFoundException, SQLException{
		List<User> list = new ArrayList<>();
		try(Connection conn = db.connect()) {
			java.sql.Statement statement = conn.createStatement();
			String sql = "SELECT * FROM `user`";
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				user = new User();
				user.setUsername(resultSet.getString("username"));
				user.setPassword(resultSet.getString("password"));
				list.add(user);				
			}
			
			conn.close();
		}catch(SQLException e){
			System.out.println("Error: " + e.getMessage());
		}
		return list;		
	}
	
	/**
	 * @Function for add users
	 * @Input: username, password
	 * @Output: none
	 */
	public void addUser (User user) throws ClassNotFoundException, SQLException, UnsupportedEncodingException{
		try(Connection conn = db.connect()) {
			String sql = "INSERT INTO user VALUES (NULL, '" + user.getUsername() + "' , '" + user.getPassword() + "')";
			PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
			statement.execute();
		}
	}
	
	/**
	 * @Function for check process adding users
	 * @Input: addUser() method
	 * @Output: result
	 */
	public void addNewAccount(String username, String password, String confirm) {
		// Get username, password, confirm by user
		if(!password.equals(confirm)) {
			System.out.println("Password and Confirm Password are not the same!");
		}else{
			try{
				// add to the database
				User user = new User(username, password);
				UserController userController = new UserController();
				userController.addUser(user);
				System.out.println("New account is created. Now you can use it to login!");
			}catch(SQLException | ClassNotFoundException | UnsupportedEncodingException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
	}
}
