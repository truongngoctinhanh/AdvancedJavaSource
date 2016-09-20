package PartII_TextFile;

/** 
 * @author TruongNgocTinhAnh
 * @since: 19/09/2016
 * @version: 1.0
 * 
 * This class for controller CD
 * 
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.api.jdbc.Statement;

public class CDController {

	static DatabaseConnection db = new DatabaseConnection();

	/**
	 * @Function for get all information of CD in cdstore database
	 * @Input: cdstore database
	 * @Output: list CD
	 */
	public List<CD> getAllCD() {
		List<CD> list = new ArrayList<>();
		try (Connection conn = db.connect()) {
			Statement statement = (Statement) conn.createStatement();
			String sql = "SELECT * FROM cd";
			ResultSet resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {
				CD obj = new CD();
				obj.setId(resultSet.getInt("id"));
				obj.setName(resultSet.getString("name"));
				obj.setNumbersongs(resultSet.getInt("numbersongs"));
				obj.setSinger(resultSet.getString("singer"));
				obj.setPrice(resultSet.getDouble("price"));
				list.add(obj);
			}
			conn.close();
		} catch (SQLException | ClassNotFoundException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		return list;
	}

	/**
	 * @Function for write List CD to file cd.txt
	 * @Input: List CD
	 * @Output: none
	 */
	public void writeCDToFile(List<CD> list) throws FileNotFoundException, IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream("src/PartII_TextFile/cd.txt")))) {
			for (CD cd : list) {
				out.writeObject(cd);
			}
			out.flush();
			out.close();
		} catch (IOException e) {
		}
	}

	/**
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @Function for read list CD from file cd.txt
	 * @Input: file cd.txt
	 * @Output: list CD
	 */
	public List<CD> readCDFromFile() throws ClassNotFoundException, IOException {
		List<CD> list = new ArrayList<>();
		try (ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream("src/PartII_TextFile/cd.txt")))) {
			while (true) {
				CD cd = (CD) in.readObject();
				list.add(cd);
			}
		} catch (ClassCastException | IOException ex) {
		}
		return list;
	}
}
