package Task9_1ManagementLanguages;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 13- 09 -2016
 * @Version: 01
 * @Class for management language to display
 */
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class MainForHandlingLanguage {
	/**
	 * @Function for convert to English language
	 * @Input: none
	 * @Output: English interface
	 */
	public static void chooseEnglish() {
		String language = "en";
		String country = "US";
		Locale currentLocal = new Locale(language, country);

		ResourceBundle message;

		message = ResourceBundle.getBundle(
				"Task9_1ManagementLanguages/resource_en_US", currentLocal);
		List<String> list = new ArrayList<>();

		Enumeration<String> keys = message.getKeys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			String value = message.getString(key);
			list.add(value);
		}
		for (String str : list) {
			System.out.println(str);
		}
	}

	/**
	 * @Function for convert to Vietnamese language
	 * @Input: none
	 * @Output: Vietnamese interface
	 */
	public static void chooseVietnames() {
		String language = "vi";
		String country = "VN";
		Locale currentLocal = new Locale(language, country);

		ResourceBundle message;

		message = ResourceBundle.getBundle(
				"Task9_1ManagementLanguages/resource_vi_VN", currentLocal);
		List<String> list = new ArrayList<>();

		Enumeration<String> keys = message.getKeys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			String value = message.getString(key);
			list.add(value);
		}
		for (String str : list) {
			System.out.println(str);
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
