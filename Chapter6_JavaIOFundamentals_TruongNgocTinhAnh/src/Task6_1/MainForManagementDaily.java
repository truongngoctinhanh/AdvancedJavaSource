package Task6_1;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 14- 09 -2016
 * @Version: 01
 * @Class for management diary
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainForManagementDaily {

	/**
	 * @Function for read content from file daily.txt
	 * @Input: none
	 * @Output: content
	 */
	public static void viewDiary() throws EOFException {
		String diary = "";
		String date;
		String content;

		try (DataInputStream in = new DataInputStream(new BufferedInputStream(
				new FileInputStream("src/Task6_1/daily.txt")))) {
			while (true) {
				date = in.readUTF();
				content = in.readUTF();
				diary += date + "\n" + content + "\n\n";
				System.out.println(diary);
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	/**
	 * @Function for add content to file daily.txt
	 * @Input: none
	 * @Output: updated content
	 */
	public static void writeDiary() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));

		Date today = new Date(System.currentTimeMillis());
		SimpleDateFormat timeFormat = new SimpleDateFormat(
				"dd/MM/yyyy hh:mm:ss");
		String date = timeFormat.format(today.getTime());

		System.out.println("Please write anything in the diary: ");
		String content = input.readLine();
		try (DataOutputStream out = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream(
						"src/Task6_1/daily.txt", true)))) {
			out.writeUTF(date);
			out.writeUTF(content);
			System.out.println("Your diary was recorded");
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String reply = "y";
			while (reply.equals("y")) {
				BufferedReader input = new BufferedReader(
						new InputStreamReader(System.in));
				System.out
						.println("What do you want: \nPress 1: View your diary \nPress 2: Write diary");
				int choose = Integer.parseInt(input.readLine());
				switch (choose) {
				case 1:
					viewDiary();
					break;
				case 2:
					writeDiary();
					break;

				}
				System.out
						.println("------------------------------------------");
				System.out.println("Do you want to continue other activity? ");
				System.out.println("Please choose y / n? ");
				reply = input.readLine().toLowerCase();
				if (!reply.equals("y") && !reply.equals("n"))
					throw new ArithmeticException("Choice value is not valid!");
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
