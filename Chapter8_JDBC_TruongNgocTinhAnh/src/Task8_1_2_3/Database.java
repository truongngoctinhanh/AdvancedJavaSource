package Task8_1_2_3;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 16 - 09 - 2016
 * @Version: 01
 * @class for connect database
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	public static final String JDBC_URL = "jdbc:mysql://localhost:3306/MyStore?useUnicode=true&characterEncoding=utf8";
	public static final String JDBC_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	public static final String JDBC_USERNAME = "root";
	public static final String JDBC_PASSWORD = "";
	
	public Connection connect() throws ClassNotFoundException, SQLException {
		Class.forName(JDBC_DRIVER_CLASS);
		Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
		return conn;
	}
}
