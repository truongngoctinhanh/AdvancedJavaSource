package Task8_4_5_6;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 16 - 09 - 2016
 * @Version: 01
 * @class for management category
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryController {
	Database db = new Database();
	Category cate = new Category();

	/**
	 * @Function for display all category in mySql database
	 * @Input: none
	 * @Output: list category
	 */
	public List<Category> ShowCategory() throws ClassNotFoundException, SQLException {
		List<Category> list = new ArrayList<>();
		try (Connection conn = db.connect()) {
			java.sql.Statement statement = conn.createStatement();
			String sql = "SELECT * FROM `category`";
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				cate = new Category();
				cate.setName(resultSet.getString("name"));
				cate.setDescription(resultSet.getString("description"));
				list.add(cate);
			}
			conn.close();
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return list;
	}
}
