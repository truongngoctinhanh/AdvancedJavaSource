package PartII_JDBC;

/** 
 * @author TruongNgocTinhAnh
 * @since: 19/09/2016
 * @version: 1.0
 * 
 * This class for controller CD
 * 
 */
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.api.jdbc.Statement;
import com.mysql.cj.jdbc.PreparedStatement;

public class CDController {

	static DatabaseConnection db = new DatabaseConnection();

	/**
	 * @Function for Get all information of CD in cdstore database
	 * @Input: cdstore database
	 * @Output: list CD
	 */
	public List<CD> getAllCD() {
		List<CD> lst = new ArrayList<>();
		try (Connection conn = db.connect()) {
			java.sql.Statement statement = conn.createStatement();
			String sql = "SELECT * FROM cd";
			ResultSet resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {
				CD cd = new CD();
				cd.setId(resultSet.getInt("id"));
				cd.setName(resultSet.getString("name"));
				cd.setSinger(resultSet.getString("singer"));
				cd.setNumbersongs(resultSet.getInt("numbersongs"));
				cd.setPrice(resultSet.getDouble("price"));
				lst.add(cd);
			}
			conn.close();
		} catch (SQLException | ClassNotFoundException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		return lst;
	}

	/**
	 * @Function for add information of new CD
	 * @Input: name, singer, number of songs, price
	 * @Output: notice results
	 */
	public void addCD(CD cd) throws ClassNotFoundException, SQLException {
		try (Connection conn = db.connect()) {
			String sql = "INSERT INTO cd VALUES(NULL, '" + cd.getName() + "', '" + cd.getSinger() + "', "
					+ cd.getNumbersongs() + " , " + cd.getPrice() + ")";
			PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
			statement.execute();
		}
	}

	/**
	 * @Function for execute addCD() method
	 * @Input: name, singer, number of songs, price and addCD() method
	 * @Output: notice results
	 */
	public void executeAdding() throws IOException, ClassNotFoundException, SQLException {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("------------------------------------------");
		System.out.println("Enter information of new CD");
		System.out.print("Name: ");
		String name = input.readLine();
		System.out.print("Singer: ");
		String singer = input.readLine();
		System.out.println("Number of songs: ");
		int num = Integer.parseInt(input.readLine());
		if (num < 0)
			throw new ArithmeticException("Age value invalid! Please enter again!");
		System.out.print("Price: ");
		Double price = Double.parseDouble(input.readLine());
		if (price < 0)
			throw new ArithmeticException("Price value invalid! Please enter again!");
		try {
			CD cd = new CD(name, singer, num, price);
			CDController controller = new CDController();
			controller.addCD(cd);
			System.out.println("Add successed!");
		} catch (SQLException | ClassNotFoundException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

	/**
	 * @Function for search information of CD by Id of CD
	 * @Input: id of CD
	 * @Output: notice results
	 */
	public List<CD> searchCDById(int id) throws ClassNotFoundException, SQLException {
		List<CD> rs;
		try (Connection conn = db.connect()) {
			rs = new ArrayList<>();
			Statement statement = (Statement) conn.createStatement();
			String sql = "SELECT * FROM cd WHERE id = " + id + "";
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				CD cd = new CD();
				cd.setId(resultSet.getInt("id"));
				cd.setName(resultSet.getString("name"));
				cd.setSinger(resultSet.getString("singer"));
				cd.setNumbersongs(resultSet.getInt("numbersongs"));
				cd.setPrice(resultSet.getDouble("price"));
				rs.add(cd);
			}
		}
		return rs;
	}

	/**
	 * @Function for search information of CD by name of CD
	 * @Input: name of CD
	 * @Output: notice results
	 */
	public List<CD> searchCDByName(String name) throws ClassNotFoundException, SQLException {
		List<CD> rs;
		try (Connection conn = db.connect()) {
			rs = new ArrayList<>();
			Statement statement = (Statement) conn.createStatement();
			String sql = "SELECT * FROM cd WHERE name like '%" + name + "%'";
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				CD cd = new CD();
				cd.setId(resultSet.getInt("id"));
				cd.setName(resultSet.getString("name"));
				cd.setSinger(resultSet.getString("singer"));
				cd.setNumbersongs(resultSet.getInt("numbersongs"));
				cd.setPrice(resultSet.getDouble("price"));
				rs.add(cd);
			}
		}
		return rs;
	}

	/**
	 * @Function for search information of CD by singer
	 * @Input: name of singer
	 * @Output: notice results
	 */
	public List<CD> searchCDBySinger(String singer) throws ClassNotFoundException, SQLException {
		List<CD> rs;
		try (Connection conn = db.connect()) {
			rs = new ArrayList<>();
			Statement statement = (Statement) conn.createStatement();
			String sql = "SELECT * FROM cd WHERE singer like '%" + singer + "%'";
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				CD cd = new CD();
				cd.setId(resultSet.getInt("id"));
				cd.setName(resultSet.getString("name"));
				cd.setSinger(resultSet.getString("singer"));
				cd.setNumbersongs(resultSet.getInt("numbersongs"));
				cd.setPrice(resultSet.getDouble("price"));
				rs.add(cd);
			}
		}
		return rs;
	}

	/**
	 * @Function for search information of CD by number of songs
	 * @Input: number of songs
	 * @Output: notice results
	 */
	public List<CD> searchCDByNum(int numbersongs) throws ClassNotFoundException, SQLException {
		List<CD> rs;
		try (Connection conn = db.connect()) {
			rs = new ArrayList<>();
			Statement statement = (Statement) conn.createStatement();
			String sql = "SELECT * FROM cd WHERE numbersongs = " + numbersongs + "";
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				CD cd = new CD();
				cd.setId(resultSet.getInt("id"));
				cd.setName(resultSet.getString("name"));
				cd.setSinger(resultSet.getString("singer"));
				cd.setNumbersongs(resultSet.getInt("numbersongs"));
				cd.setPrice(resultSet.getDouble("price"));
				rs.add(cd);
			}
		}
		return rs;
	}

	/**
	 * @Function for search information of CD by price of songs
	 * @Input: price of singer
	 * @Output: notice results
	 */
	public List<CD> searchCDByPrice(double price) throws ClassNotFoundException, SQLException {
		List<CD> rs;
		try (Connection conn = db.connect()) {
			rs = new ArrayList<>();
			Statement statement = (Statement) conn.createStatement();
			String sql = "SELECT * FROM cd WHERE price = " + price + "";
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				CD cd = new CD();
				cd.setId(resultSet.getInt("id"));
				cd.setName(resultSet.getString("name"));
				cd.setSinger(resultSet.getString("singer"));
				cd.setNumbersongs(resultSet.getInt("numbersongs"));
				cd.setPrice(resultSet.getDouble("price"));
				rs.add(cd);
			}
		}
		return rs;
	}

	/**
	 * @Function for checking to continue other activity
	 * @Input: y or no
	 * @Output: notice result
	 */
	public String checkContinue() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("------------------------------------------");
		System.out.println("Do you want to continue search? ");
		System.out.println("Please choose y / n? ");
		String check = input.readLine().toLowerCase();
		if (!check.equals("y") && !check.equals("n"))
			throw new ArithmeticException("Choice value is not valid!");
		return check;
	}

	/**
	 * @Function for execute searchCD() method
	 * @Input: name
	 * @Output: notice results
	 */
	public void executeSearch() throws IOException, SQLException, ClassNotFoundException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String rep = "y";
		// Loop search information by condition
		while (rep.equals("y")) {
			System.out.println("Press 1: Search by id");
			System.out.println("Press 2: Search by name");
			System.out.println("Press 3: Search by singer");
			System.out.println("Press 4: Search by number of songs");
			System.out.println("Press 5: Search by price");
			System.out.println("Please choose:  1 / 2 / 3 / 4 / 5 ");
			int reply = Integer.parseInt(input.readLine());
			List<CD> list;
			switch (reply) {

			case 1:
				System.out.print("Enter id of CD to search: ");
				int id = Integer.parseInt(input.readLine());
				try {
					list = searchCDById(id);
					if (list.size() != 0) {
						for (int i = 0; i < list.size(); i++)
							list.get(i).displayInfoCD();
					} else
						System.out.println("The value not exist in database");
				} catch (HeadlessException ex) {
					System.out.println("Error: " + ex.getMessage());
				}
				rep = checkContinue();
				break;
			case 2:
				System.out.print("Enter name of CD to search: ");
				String name = input.readLine();
				try {
					list = searchCDByName(name);
					if (list.size() != 0) {
						for (int i = 0; i < list.size(); i++)
							list.get(i).displayInfoCD();
					} else
						System.out.println("The value not exist in database");
				} catch (HeadlessException ex) {
					System.out.println("Error: " + ex.getMessage());
				}
				rep = checkContinue();
				break;
			case 3:
				System.out.print("Enter name of singer to search: ");
				String singer = input.readLine();
				try {
					list = searchCDBySinger(singer);
					if (list.size() != 0) {
						for (int i = 0; i < list.size(); i++)
							list.get(i).displayInfoCD();
					} else
						System.out.println("The value not exist in database");
				} catch (HeadlessException ex) {
					System.out.println("Error: " + ex.getMessage());
				}
				rep = checkContinue();
				break;
			case 4:
				System.out.print("Enter number of songs to search: ");
				int num = Integer.parseInt(input.readLine());
				try {
					list = searchCDByNum(num);
					if (list.size() != 0) {
						for (int i = 0; i < list.size(); i++)
							list.get(i).displayInfoCD();
					} else
						System.out.println("The value not exist in database");
				} catch (HeadlessException ex) {
					System.out.println("Error: " + ex.getMessage());
				}
				rep = checkContinue();
				break;
			case 5:
				System.out.print("Enter price of CD to search: ");
				double price = Double.parseDouble(input.readLine());
				try {
					list = searchCDByPrice(price);
					if (list.size() != 0) {
						for (int i = 0; i < list.size(); i++)
							list.get(i).displayInfoCD();
					} else
						System.out.println("The value not exist in database");
				} catch (HeadlessException ex) {
					System.out.println("Error: " + ex.getMessage());
				}
				rep = checkContinue();
				break;
			}
		}
	}

	/**
	 * @Function for update information of CD by id of CD
	 * @Input: id, number of songs, price
	 * @Output: notice results
	 */
	public void updateCD(CD cd) throws ClassNotFoundException, SQLException {
		try (Connection conn = db.connect()) {
			String sql = "UPDATE cd SET numbersongs = " + cd.getNumbersongs() + ", price = " + cd.getPrice()
					+ " WHERE id = '" + cd.getId() + "'";
			PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
			statement.execute();
		}
	}

	/**
	 * @Function for get information of CD by id of CD
	 * @Input: id
	 * @Output: list information
	 */
	public CD getCD(List<CD> lst, int id) {
		for (CD cd : lst) {
			if (cd.getId() == id) {
				return cd;
			}
		}
		return null;
	}

	/**
	 * @Function for execute updateCD() method
	 * @Input: id, number of songs, price
	 * @Output: notice results
	 */
	public void executeUpdate() throws IOException, SQLException, ClassNotFoundException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("List all CD: ");
		List<CD> list = this.getAllCD();
		for (CD cd : list) {
			cd.displayInfoCD();
		}
		System.out.println("----------------------------------------------");
		System.out.print("Enter id of CD to update: ");
		int id = Integer.parseInt(input.readLine());
		System.out.print("Enter updated number songs: ");
		int num = Integer.parseInt(input.readLine());
		System.out.print("Enter updated price: ");
		double price = Double.parseDouble(input.readLine());

		if (num <= 0)
			throw new ArithmeticException("Number song is not valid!");
		if (price <= 0)
			throw new ArithmeticException("Price is not valid!");
		CD cd = this.getCD(list, id);
		cd.setNumbersongs(num);
		cd.setPrice(price);
		this.updateCD(cd);
		System.out.println("Update completed!");
	}

	/**
	 * @Function for delete information of new CD by id of CD
	 * @Input: id, number of songs, price
	 * @Output: notice results
	 */
	public void deleteCD(int id) throws ClassNotFoundException, SQLException {
		try (Connection conn = db.connect()) {
			String sql = "DELETE FROM cd WHERE id = " + id + "";
			PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
			statement.execute();
		}
	}

	/**
	 * @Function for execute deleteCD() method
	 * @Input: id
	 * @Output: notice results
	 */
	public void executeDelete() throws IOException, SQLException, ClassNotFoundException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter id of CD to delete: ");
		int id = Integer.parseInt(input.readLine());
		deleteCD(id);
		System.out.println("Deleted successful!");
	}
}
