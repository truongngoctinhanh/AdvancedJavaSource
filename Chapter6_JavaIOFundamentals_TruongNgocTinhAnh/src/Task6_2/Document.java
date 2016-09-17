package Task6_2;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 14- 09 -2016
 * @Version: 01
 * @Class for declare document object
 */
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileReader;
import java.io.IOException;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 14- 09 -2016
 * @Version: 01
 * @Class for declare Document object
 */
import java.util.TreeMap;

public class Document {
	private String word;

	public Document() {
		super();
	}

	public Document(String word) {
		super();
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	/**
	 * @Function for read content from file text.txt
	 * @Input: none
	 * @Output: content
	 */
	public String viewDocument() throws EOFException {
		String chuoi;
		String s = "";
		try (BufferedReader in = new BufferedReader(new FileReader("src/Task6_2/text.txt"))) {
			
			while ((chuoi = in.readLine()) != null) {
				s += chuoi;
			}
			

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return s;
	}
	
	/**
	 * @Function for convert word to TreeMap
	 * @Input: Document
	 * @Output: Return result as a tree map type
	 * @throws EOFException 
	 */
	public TreeMap<String, Integer> treeMap() throws EOFException{
		String[] arr = viewDocument().split(" ");
		TreeMap<String, Integer> tree = new TreeMap<String, Integer>();
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = arr[i].toLowerCase();
			if(tree.containsKey(arr[i])){
				int temp = tree.get(arr[i]);
				tree.replace(arr[i], temp + 1);
			}
			else
				tree.put(arr[i], 1);
		}
		return tree;
	}
	
	/**
	 * @Function for display all items and count the number of occurrences of the word
	 * @Input: Document
	 * @Output: word
	 * @throws EOFException 
	 */
	public void displayWord() throws EOFException{
		
		TreeMap<String, Integer> tree = treeMap();
		for(String key : tree.keySet()){	
			System.out.println(key + " : " + tree.get(key));
		}
		
	}
	
	/**
	 * Function for display the number of occurrences of the word
	 * Input: Document
	 * Output: number
	 * @throws EOFException 
	 */
	public void searchByKey(String key) throws EOFException{
		TreeMap<String, Integer> tree = treeMap();
		System.out.println("The number of occurrences of the word is: " + tree.get(key));
	}
	
	
}
