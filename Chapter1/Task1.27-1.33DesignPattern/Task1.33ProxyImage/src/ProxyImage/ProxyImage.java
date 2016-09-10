package ProxyImage;

/**
 * @author Truong Ngoc Tinh Anh
 * @version 1.0
 * @created 10-Sep-2016 9:27:18 PM
 * @class for declare separate field, method of ProxyImage class and override display()of Image interface
 */
public class ProxyImage implements Image {

	public String fileName;
	public RealImage realImage;
	
	public ProxyImage(String fileName) {
		super();
		this.fileName = fileName;
	}

	
	public ProxyImage(){
		
	}
	
	
	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}


	public RealImage getRealImage() {
		return realImage;
	}


	public void setRealImage(RealImage realImage) {
		this.realImage = realImage;
	}

	@Override
	public void display(){
		if(realImage == null){
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}
	
}