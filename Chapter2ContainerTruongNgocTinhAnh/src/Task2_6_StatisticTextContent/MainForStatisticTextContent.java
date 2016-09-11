package Task2_6_StatisticTextContent;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 08- 09 -2016
 * @Version: 01
 * @Class for statistic text content
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class MainForStatisticTextContent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Enter document: ");
		try {
			
			String doc  = input.readLine();
			Document document = new Document(doc);
			
			String active = "y" ;
            while (active.equals("y")) {
				System.out.println("1.Display information of document");
				System.out.println("2.Search by word");
				System.out.println("Please choose 1 / 2 ");
				int choice = Integer.parseInt(input.readLine());
				
				switch (choice) {
				
					case 1:
						document.displayWord();
						break;
					
					case 2:
						System.out.println("Enter word to search: ");
						String word = input.readLine();
						document.searchByKey(word);
						break;
						
					default:
						System.out.println("Invalid value! Please choose again!");
				}
				System.out.println("------------------------------------------");
                System.out.println("Do you want to continue other activity? ");
                System.out.println("Please choose y / n? ");
                active = input.readLine().toLowerCase();
                if(!active.equals("y") && !active.equals("n")) throw new ArithmeticException("Choice value is not valid!");
            }
			
		} catch (IOException | NumberFormatException | InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}

}
