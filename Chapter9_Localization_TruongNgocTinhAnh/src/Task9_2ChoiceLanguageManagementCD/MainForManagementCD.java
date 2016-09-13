package Task9_2ChoiceLanguageManagementCD;

/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 13 - 09 -2016
 * @Version: 01
 * @Class main for handling language of management CD
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class MainForManagementCD {

	/**
	 * @Function for convert to English language
	 * @Input: none
	 * @Output: English interface
	 */
	public static void chooseEnglish() {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			String language = "en";
			String country = "US";
			Locale currentLocal = new Locale(language, country);

			ResourceBundle message;

			message = ResourceBundle.getBundle("Task9_2ChoiceLanguageManagementCD/resource_en_US", currentLocal);
			List<String> list = new ArrayList<>();

			Enumeration<String> keys = message.getKeys();
			while (keys.hasMoreElements()) {
				String key = keys.nextElement();
				String value = message.getString(key);
				list.add(value);
			}
			String reply = "y";
			List<ManagementCD> arrayCD = new ArrayList<ManagementCD>();
			while (reply.equals("y")) {
				// Enter information of CD
				System.out.println(message.getString("enterInfo"));
				System.out.print(message.getString("enterId"));
				String id = input.readLine();
				System.out.print(message.getString("enterName"));
				String name = input.readLine();
				System.out.print(message.getString("enterSinger"));
				String singer = input.readLine();
				System.out.print(message.getString("enterNum"));
				int numOfSongs = Integer.parseInt(input.readLine());
				if (numOfSongs <= 0) {
					throw new ArithmeticException(message.getString("errorNum"));
				}
				System.out.print(message.getString("enterPrice"));
				double price = Double.parseDouble(input.readLine());
				if (price <= 0) {
					throw new ArithmeticException(message.getString("errorPrice"));
				}
				arrayCD.add(new ManagementCD(id, name, singer, numOfSongs, price));
				System.out.println("------------------------------------------");
				System.out.println(message.getString("ask"));
				System.out.println(message.getString("choose"));
				reply = input.readLine().toLowerCase();
				if (!reply.equals("y") && !reply.equals("n"))
					throw new ArithmeticException(message.getString("errorChoose"));
			}

			// Show information and calculate total price of CD
			System.out.println("------------------------------------------");
			double totalPrice = 0;
			for (ManagementCD cd : arrayCD) {
				cd.showCD();
				totalPrice += cd.getPrice();

			}

			// Show total price of CD
			System.out.println("------------------------------------------");
			System.out.println(String.format(message.getString("total"), totalPrice));

			// Sort by name of CD
			System.out.println(message.getString("sort"));
			Collections.sort(arrayCD);
			System.out.println(message.getString("result")+ "\n");
			for (ManagementCD cd : arrayCD) {
				cd.showCD();
			}
		} catch (IOException | NumberFormatException | ArithmeticException ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}
	}
	
	/**
	 * @Function for convert to Vietnamese language
	 * @Input: none
	 * @Output: Vietnamese interface
	 */
	public static void chooseVietnames() {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			String language = "en";
			String country = "US";
			Locale currentLocal = new Locale(language, country);

			ResourceBundle message;

			message = ResourceBundle.getBundle("Task9_2ChoiceLanguageManagementCD/resource_vi_VN", currentLocal);
			List<String> list = new ArrayList<>();

			Enumeration<String> keys = message.getKeys();
			while (keys.hasMoreElements()) {
				String key = keys.nextElement();
				String value = message.getString(key);
				list.add(value);
			}
			String reply = "y";
			List<ManagementCD> arrayCD = new ArrayList<ManagementCD>();
			while (reply.equals("y")) {
				// Enter information of CD
				System.out.println(message.getString("enterInfo"));
				System.out.print(message.getString("enterId"));
				String id = input.readLine();
				System.out.print(message.getString("enterName"));
				String name = input.readLine();
				System.out.print(message.getString("enterSinger"));
				String singer = input.readLine();
				System.out.print(message.getString("enterNum"));
				int numOfSongs = Integer.parseInt(input.readLine());
				if (numOfSongs <= 0) {
					throw new ArithmeticException(message.getString("errorNum"));
				}
				System.out.print(message.getString("enterPrice"));
				double price = Double.parseDouble(input.readLine());
				if (price <= 0) {
					throw new ArithmeticException(message.getString("errorPrice"));
				}
				arrayCD.add(new ManagementCD(id, name, singer, numOfSongs, price));
				System.out.println("------------------------------------------");
				System.out.println(message.getString("ask"));
				System.out.println(message.getString("choose"));
				reply = input.readLine().toLowerCase();
				if (!reply.equals("y") && !reply.equals("n"))
					throw new ArithmeticException(message.getString("errorChoose"));
			}

			// Show information and calculate total price of CD
			System.out.println("------------------------------------------");
			double totalPrice = 0;
			for (ManagementCD cd : arrayCD) {
				cd.showCD();
				totalPrice += cd.getPrice();

			}

			// Show total price of CD
			System.out.println("------------------------------------------");
			System.out.println(String.format(message.getString("total"), totalPrice));

			// Sort by name of CD
			System.out.println(message.getString("sort"));
			Collections.sort(arrayCD);
			System.out.println(message.getString("result")+ "\n");
			for (ManagementCD cd : arrayCD) {
				cd.showCD();
			}
		} catch (IOException | NumberFormatException | ArithmeticException ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			String active = "y";
			while (active.equals("y")) {
				System.out
						.println("Please choose languge: \nPress 1: English \nPress 2: Vietnamese");
				int reply = Integer.parseInt(input.readLine());
				switch (reply) {
				case 1:
					chooseEnglish();
					break;
				case 2:
					chooseVietnames();
					break;
				}
				System.out.println("------------------------------------------");
				System.out
						.println("Do you want to continue other activity? ");
				System.out.println("Please choose y / n? ");
				active = input.readLine().toLowerCase();
				if (!active.equals("y") && !active.equals("n"))
					throw new ArithmeticException("Choice value is not valid!");
			}			
		} catch (IOException | NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

}
