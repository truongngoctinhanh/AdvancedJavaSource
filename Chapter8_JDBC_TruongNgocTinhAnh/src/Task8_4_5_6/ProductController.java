package Task8_4_5_6;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 16 - 09 - 2016
 * @Version: 01
 * @class for controller product object
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductController {
	Database data = new Database();
	/**
	 * @Function for insert information of new products to database
	 * @Input: information of products
	 * @Output: result
	 */
	public void insertProduct(Product product) throws ClassNotFoundException, SQLException {
		try (Connection conn = data.connect()) {
			String sql = "INSERT INTO product(name, price, amount, categoryId) VALUES ('" + product.getName() + "' ," + product.getPrice() + " ,"
					+ product.getAmount() + ", " + product.getCategoryId() + ")";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.execute();
		}
	}

	/**
	 * @Function for search information of products in database
	 * @Input: name of product
	 * @Output: result
	 */
	public List<Product> searchProduct(String name) throws SQLException, ClassNotFoundException {
		List<Product> rs;
		try (Connection conn = data.connect()) {
			rs = new ArrayList<>();
			java.sql.Statement statement = conn.createStatement();
			String sql = "SELECT * FROM product WHERE Name like '%" + name + "%'";
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				Product p = new Product();
				p.setId(resultSet.getInt("id"));
				p.setName(resultSet.getString("name"));
				p.setPrice(resultSet.getDouble("price"));
				p.setAmount(resultSet.getInt("amount"));
				p.setCategoryId(resultSet.getInt("categoryId"));
				rs.add(p);
			}
		}
		return rs;
	}

	/**
	 * @Function for update information of products in database
	 * @Input: ID, price, amount of product
	 * @Output: result
	 */
	public void updateProduct(Product p) throws SQLException, ClassNotFoundException {
		try (Connection conn = data.connect()) {
			String sql = "UPDATE PRODUCT SET price = " + p.getPrice() + ", amount = " + p.getAmount() + " WHERE id = '"
					+ p.getId() + "'";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.execute();
		}
	}

	/**
	 * @Function for delete information of products in database
	 * @Input: ID of product
	 * @Output: result
	 */
	public void deleteProduct(int id) throws SQLException, ClassNotFoundException {
		try (Connection conn = data.connect()) {
			String sql = "DELETE FROM PRODUCT WHERE id = '" + id + "'";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.execute();
		}
	}
}
