package Task8_7;

/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 16 - 09 - 2016
 * @Version: 01
 * @class for execute transaction
 */
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionController {
	Database db = new Database();

	// Transaction 1
	public void executeTransaction1() throws ClassNotFoundException, SQLException {
		Connection conn = db.connect();
		try {
			conn.setAutoCommit(false);
			Statement statement = conn.createStatement();
			String insert = "INSERT INTO product(name, price, amount, image, categoryId, createDate, onSell) "
					+ "VALUES ('Strawberry Cookies', 45000, 50, " + "'strawberrycookies.jpg', 4, '2016-07-07', 1)";
			String update = "UPDATE product SET price = 6000, amount = 55 WHERE id = 1";
			String delete = "DELETE FROM product where id = 19";
			statement.executeUpdate(insert);

			statement.executeUpdate(update);
			statement.executeUpdate(delete);

			conn.commit();
			conn.close();
			System.out.println("Transaction 1 is executed successful");
		} catch (SQLException ex) {
			System.out.println("ERROR: " + ex.getMessage());
			conn.rollback();
		}
	}

	// Transaction 2
	public void executeTransaction2() throws ClassNotFoundException, SQLException {
		Connection conn = db.connect();
		try {
			conn.setAutoCommit(false);
			String name = "Strawberry CookiesStrawberry CookiesStrawberry CookiesStrawberry CookiesStrawberry CookiesStrawberry CookiesStrawberry CookiesStrawberry CookiesStrawberry CookiesStrawberry Cookies";
			Statement statement = (Statement) conn.createStatement();

			String insert = "INSERT INTO product (name, price, amount, image, categoryId, createDate, onSell) "
					+ "VALUES ('" + name + "', 45000, 50, 'strawberrycookies.jpg', 4, '2016-9-17', 1)";
			String update = "UPDATE product SET price = 12500, amount = 45 WHERE id = 13";
			String delete = "DELETE FROM product where id = 23";

			statement.executeUpdate(insert);
			statement.executeUpdate(update);
			statement.executeUpdate(delete);

			conn.commit();
			conn.close();
			System.out.println("Transaction 2 is executed successful");
		} catch (SQLException ex) {
			System.out.println("ERROR: " + ex.getMessage());
			conn.rollback();
		}
	}

	// Transaction 3
	public void executeTransaction3() throws ClassNotFoundException, SQLException {
		Connection conn = db.connect();
		try {
			conn.setAutoCommit(false);
			Statement statement = (Statement) conn.createStatement();
			String insert = "INSERT INTO product (name, price, amount, image, categoryId, createDate, onSell) "
					+ "VALUES('Strawberry Cookies', 45000, 50, 'strawberrycookies.jpg', 4, '2016-9-10', 1)";
			String update = "DELETE FROM product where id = 10";
			String delete = "UPDATE product SET price = 50000, amount = 10 WHERE id = 10";

			statement.executeUpdate(insert);
			statement.executeUpdate(update);
			statement.executeUpdate(delete);

			conn.commit();
			conn.close();
			System.out.println("Transaction 3 is executed successful");
		} catch (SQLException ex) {
			System.out.println("ERROR: " + ex.getMessage());
			conn.rollback();
		}
	}
}
