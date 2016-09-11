package Task9;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 22- 08 -2016
 * Version: 01
 * Class for declare Desktop object extend Computer object and override method show information of computer
 */
public class Desktop extends Computer {
	private String cpu;
	private String ram;
	public Desktop() {
		super();
	}
	public Desktop(String cpu, String ram, String id, double unitPrice, String manufacturer, double numOfImport) {
		super(id, unitPrice, manufacturer, numOfImport);
		this.cpu = cpu;
		this.ram = ram;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	
	/**
	 * Function for override showInformation method to display information of computer
	 * Input: none
	 * Output: information of desktop
	 */
	@Override
	public void showInformation(){
		System.out.println("Information of Desktop");
		System.out.println("...................................................");
		System.out.println("ID of computer: " + this.id);
		System.out.println("Unit price of computer: " + this.unitPrice);
		System.out.println("Manufacturer of computer: " + this.manufacturer);
		System.out.println("CPU of computer: " + this.cpu);
		System.out.println("RAM of computer: " + this.ram);
	}
	
}
