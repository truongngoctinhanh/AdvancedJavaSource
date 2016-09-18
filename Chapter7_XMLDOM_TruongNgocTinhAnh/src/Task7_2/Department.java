package Task7_2;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 15- 09 -2016
 * @Version: 01
 * @Class for declare department object
 */
public class Department {
	private String id;
    private String name;

    public Department(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    /**
	 * @Function for display information of department
	 * @Input: id, name of department
	 * @Output: information
	 */
    public void showInfo() {
        System.out.println("ID Department " + id);
        System.out.println("Name of department " + name);
    }
}
