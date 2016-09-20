package PartII_JDBC;
/** 
 * @author TruongNgocTinhAnh
 * @since: 19/09/2016
 * @version: 1.0
 * 
 * This class for management CD
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainForControllerCD {
	/**
	 * @Function for checking to continue other activity
	 * @Input: y or no
	 * @Output: notice result
	 */
	public static String checkContinue() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("------------------------------------------");
		System.out.println("Do you want to continue other activity? ");
		System.out.println("Please choose y / n? ");
		String check = input.readLine().toLowerCase();
		if (!check.equals("y") && !check.equals("n"))
			throw new ArithmeticException("Choice value is not valid!");
		return check;
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		CDController cd = new CDController();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		List<CD> list = new ArrayList<>();
		try {
			String check = "y";
			while (check.equals("y")) {
				System.out.println("What do you want: ");
				System.out.println("Press 1: Add new CD");
				System.out.println("Press 2: Search CD by name");
				System.out.println("Press 3: Update CD by id");
				System.out.println("Press 4: Delete CD by id");
				System.out.println("Press 5: Exit and Display all List of CD");
				System.out.println("Please choose 1 / 2 / 3 / 4 / 5 ");
				int choose = Integer.parseInt(input.readLine());
				switch (choose) {
				case 1:
					// Display list of CD in cdstore database 
					list = cd.getAllCD();
					for (int i = 0; i < list.size(); i++) {
						list.get(i).displayInfoCD();
					}
					cd.getAllCD();
					String rep = "y";
					// Loop add information of new CD
					while (rep.equals("y")) {
					cd.executeAdding();
					System.out.println("------------------------------------------");
					System.out.println("Do you want to continue add other CD? ");
					System.out.println("Please choose y / n? ");
					rep = input.readLine().toLowerCase();
					if (!rep.equals("y") && !rep.equals("n"))
						throw new ArithmeticException("Choice value is not valid!");
					}

					check = checkContinue();
					break;
				case 2:
					// Search CD by name
					cd.executeSearch();
					check = checkContinue();
					break;
				case 3:	
					// Update CD by id
					cd.executeUpdate();
					check = checkContinue();
					break;
				case 4:
					// Delete CD by id
					cd.executeDelete();
					check = checkContinue();
					break;
				case 5: 
					// Exit and Display all List of CD
					list = cd.getAllCD();
					for (int i = 0; i < list.size(); i++) {
						list.get(i).displayInfoCD();
					}
					check = "n";
					break;
				default:
					throw new ArithmeticException("Invalid value!");
				}
			}
		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
