package Task8_4_5_6;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 16 - 09 - 2016
 * @Version: 01
 * @class for declare category object
 */
public class Category {
	public int id;
	public String name;
	public String description;
	
	public Category(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public Category() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * @Function for display information of category in mySql database
	 * @Input: database
	 * @Output: information of category
	 */
	public void displayCategory() {		
		System.out.println(name + " | Description: " + description);
	}
	
}
