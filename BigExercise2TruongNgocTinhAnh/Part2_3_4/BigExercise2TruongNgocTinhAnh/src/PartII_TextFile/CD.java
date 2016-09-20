package PartII_TextFile;

import java.io.Serializable;

/** 
 * @author TruongNgocTinhAnh
 * @since: 19/09/2016
 * @version: 1.0
 * 
 * This class for declare CD object
 * 
 */

@SuppressWarnings("serial")
public class CD implements Serializable{
	int id;
	String name;
	String singer;	
	int numbersongs;
	double price;
	
	public CD(int id, String name, String singer, int numbersongs, double price) {
		super();
		this.id = id;
		this.name = name;
		this.singer = singer;
		this.numbersongs = numbersongs;
		this.price = price;
	}
	
	public CD(String name, String singer, int numbersongs, double price) {
		super();
		this.name = name;
		this.singer = singer;
		this.numbersongs = numbersongs;
		this.price = price;
	}
	
	public CD(int id, int numbersongs, double price) {
		super();
		this.numbersongs = numbersongs;
		this.price = price;
	}
	
	public CD() {
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
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getNumbersongs() {
		return numbersongs;
	}
	public void setNumbersongs(int numbersongs) {
		this.numbersongs = numbersongs;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * @Function for display information of CD
	 * @Input: name, singer, number of songs, price
	 * @Output: information
	 */
	public void displayInfoCD() {
		System.out.println("----------------------------------------------");
		System.out.println("CD: id = " + id + "\nName of CD: " + name + " | Singer: " + singer);
		System.out.println("Number of songs: " + numbersongs + " | Price: " + price);
	}
}
