package Task8_1_2_3;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 16 - 09 - 2016
 * @Version: 01
 * @class for management users
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainForManagementUser {

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		UserController userController = new UserController();

		String check = "y";
		while (check.equals("y")) {
			System.out.println("What do you want: ");
			System.out.println("1. Login \n2. Created new account \n3. View all accounts");
			System.out.println("Please choose 1 / 2 / 3 ");
			int active = Integer.parseInt(input.readLine());
			switch (active) {
			case 1:
				//Login
				System.out.print("Enter username: ");
				String username = input.readLine();
				System.out.print("Enter password: ");
				String password = input.readLine();

				// Get username, password entered by the user
				User user = null;
				try {
					user = userController.loginUser(username, password);
					if (user == null) {
						System.out.println("Invalid UserName or Password");
					} else {
						System.out.println("Welcome to Our Store");
					}
				} catch (SQLException | ClassNotFoundException e) {
					System.out.println("Error: " + e.getMessage());
				}

				System.out.println("------------------------------------------");
				System.out.println("Do you want to continue ? ");
				System.out.println("Please choose y / n? ");
				check = input.readLine().toLowerCase();
				if (!check.equals("y") && !check.equals("n"))
					throw new ArithmeticException("Choice value is not valid!");
				break;
			case 2:
				//Created new account
				System.out.print("Enter username: ");
				String usern = input.readLine();
				System.out.print("Enter password: ");
				String passw = input.readLine();
				System.out.print("Enter confirm: ");
				String confirm = input.readLine();
				userController.addNewAccount(usern, passw, confirm);

				System.out.println("------------------------------------------");
				System.out.println("Do you want to continue ? ");
				System.out.println("Please choose y / n? ");
				check = input.readLine().toLowerCase();
				if (!check.equals("y") && !check.equals("n"))
					throw new ArithmeticException("Choice value is not valid!");
				break;
			case 3:
				//View all accounts in mySql database
				List<User> list = new ArrayList<>();				
				list = userController.ShowUser() ;
				for(int i = 0; i < list.size(); i ++){
					list.get(i).displayInfoUser();
				}
				System.out.println("------------------------------------------");
				System.out.println("Do you want to continue ? ");
				System.out.println("Please choose y / n? ");
				check = input.readLine().toLowerCase();
				if (!check.equals("y") && !check.equals("n"))
					throw new ArithmeticException("Choice value is not valid!");
				break;
			default:
				throw new ArithmeticException("Choice is not valid!");
			}
		}

	}

}
