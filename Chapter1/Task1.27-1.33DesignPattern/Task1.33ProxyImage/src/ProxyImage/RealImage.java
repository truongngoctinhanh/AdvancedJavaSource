package ProxyImage;

/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 10-Sep-2016 9:27:16 PM
 * @class for declare separate field, method of RealImage class and override display()of Image interface
 */
public class RealImage implements Image {

	public String fileName;

	public RealImage(){

	}

	public RealImage(String fileName) {
		super();
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void display(){
		System.out.println("Displaying " + fileName);
	}

	public void loadFromDisk(){
		System.out.println("Loading " + fileName);
	}

}