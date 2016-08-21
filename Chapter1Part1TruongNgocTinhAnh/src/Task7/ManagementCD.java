package Task7;
/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 21- 08 -2016
 * Version: 01
 * Class for management CD
 */
public class ManagementCD {
	private String id;
    private String name;
    private String singer;
    private int numOfSongs;
    private double price;
	public ManagementCD() {
		super();
	}
	public ManagementCD(String id, String name, String singer, int numOfSongs, double price) {
		super();
		this.id = id;
		this.name = name;
		this.singer = singer;
		this.numOfSongs = numOfSongs;
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getNumOfSongs() {
		return numOfSongs;
	}
	public void setNumOfSong(int numOfSongs) {
		this.numOfSongs = numOfSongs;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
    //Function for show information of CD
    public void showCD(){
        System.out.println("Information of CD:");
        System.out.println("- ID: " + this.getId());
        System.out.println("- CD name:" + this.getName());
        System.out.println("- Singer: " + this.getSinger());
        System.out.println("- Number of songs: " + this.getNumOfSongs());
        System.out.println(String.format("- Price: %.0f", this.getPrice()));
    }
}
