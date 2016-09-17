package Task8_7;
/**
 * @author Truong Ngoc Tinh Anh
 * @since 16 - 09 - 2016
 * @version 01
 * 
 * This is class for management transaction
 */
import java.sql.SQLException;

public class MainForManagementTransaction {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		TransactionController transaction = new TransactionController();
		transaction.executeTransaction1();
		transaction.executeTransaction2();
		transaction.executeTransaction3();
	}

}
