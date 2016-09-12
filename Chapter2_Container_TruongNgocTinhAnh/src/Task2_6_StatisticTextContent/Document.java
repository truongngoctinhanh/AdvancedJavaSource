package Task2_6_StatisticTextContent;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 08- 09 -2016
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
	 * Function for convert word to TreeMap
	 * Input: Document
	 * Output: Return result as a tree map type
	 */
	public TreeMap<String, Integer> treeMap(){
		
		String[] arr = word.split(" ");
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
	 * Function for display all items and count the number of occurrences of the word
	 * Input: Document
	 * Output: word
	 */
	public void displayWord(){
		
		TreeMap<String, Integer> tree = treeMap();
		for(String key : tree.keySet()){	
			System.out.println(key + " : " + tree.get(key));
		}
		
	}
	
	/**
	 * Function for display the number of occurrences of the word
	 * Input: Document
	 * Output: number
	 */
	public void searchByKey(String key){
		TreeMap<String, Integer> tree = treeMap();
		System.out.println("The number of occurrences of the word is: " + tree.get(key));
	}
}
