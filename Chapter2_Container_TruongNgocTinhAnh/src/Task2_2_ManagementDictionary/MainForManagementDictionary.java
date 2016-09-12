package Task2_2_ManagementDictionary;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 07- 09 -2016
 * @Version: 01
 * @Class for management dictionary
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class MainForManagementDictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
        	//Default vocabulary in dictionary
        	Set<Dictionary> word = new TreeSet<Dictionary>();
        	Dictionary word1 = new Dictionary("Monday", "Thứ hai");
        	word.add(word1);
        	Dictionary word2 = new Dictionary("Tuesday", "Thứ ba");
        	word.add(word2);
        	Dictionary word3 = new Dictionary("Wednesday", "Thứ tư");
        	word.add(word3);
        	Dictionary word4 = new Dictionary("Thursday", "Thứ năm");
        	word.add(word4);
        	Dictionary word5 = new Dictionary("Friday", "Thứ sáu");
        	word.add(word5);
        	Dictionary word6 = new Dictionary("Saturdayday", "Thứ bảy");
        	word.add(word6);
        	Dictionary word7 = new Dictionary("Thursday", "Chủ nhật");
        	word.add(word7);
        	
            String active = "y" ;
            while (active.equals("y")) {
            	System.out.println("Please choose activity !");
                System.out.println("1. View all dictionary");
                System.out.println("2. Add new word to the dictionary");
                System.out.println("3. Find word in dictionary");
                System.out.println("4. Delete a word in dictionary");
                System.out.println("Please choose 1 / 2 / 3 / 4 ");
                int choice = Integer.parseInt(input.readLine());
                if (choice < 1 || choice > 4) throw new ArithmeticException("Invalid value! Please choose again!");
                switch(choice) {
                case 1:
                	//Display information of word
                    System.out.println("------------------------------------------");
                    int i = 1;
                    for (Dictionary dic : word) {
                    	System.out.print(i + " ");
                        dic.displayInfoWord(); 
                        i++;
                    }
                	break;
                case 2:
                	//Add new word to the dictionary
                	String reply = "y" ;
                	while (reply.equals("y")) {                    	
                        System.out.print("Enter English word: ");
                        String english = input.readLine();
                        System.out.print("Translated into Vietnamese: ");
                        String vietnam = input.readLine();
                        word.add(new Dictionary(english, vietnam));
                        System.out.println("------------------------------------------");
                        System.out.println("Do you want to add new English word ? ");
                        System.out.println("Please choose y / n? ");
                        reply = input.readLine().toLowerCase();
                        if(!reply.equals("y") && !reply.equals("n")) throw new ArithmeticException("Choice value is not valid!");
                    }
                	break;
                case 3:
                	//Find word in dictionary
                	System.out.println("Enter word to search: ");
                	String wordSearch = input.readLine();
                	int check = 0;
					for(Dictionary o : word){												
						if(o.getEnglishWord().equals(wordSearch)){
							System.out.println("Meaning: " + o.getVietnamWord());
							check = 1;
							break;
						}						
					}
					if (check == 0)
				    	  System.out.println(wordSearch + " not exist in dictionary");
                	break;
                case 4:
                	//Delete a word in dictionary
                	System.out.println("Enter word to delete: ");
                	String wordDelete = input.readLine();                	
                	int check2 = 0;
					for(Dictionary o : word){						
						if(o.getEnglishWord().equals(wordDelete)){
							word.remove(o);
							check2 = 1;
							break;
						}
					}
					if (check2 == 0)
				    	  System.out.println(wordDelete + " not exist in dictionary");
					else
						System.out.println("Deleted " + wordDelete + " completed!");
                	break;
                }
                System.out.println("------------------------------------------");
                System.out.println("Do you want to continue other activity? ");
                System.out.println("Please choose y / n? ");
                active = input.readLine().toLowerCase();
                if(!active.equals("y") && !active.equals("n")) throw new ArithmeticException("Choice value is not valid!");
            }
        } catch (IOException | NumberFormatException | ArithmeticException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
	}

}
