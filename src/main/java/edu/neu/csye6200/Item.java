package edu.neu.csye6200;

public class Item {
	
	public static final int REVISION = 0;
	
	private String name;
	private int price;

	@Override
	public String toString() {
		return "Item []";
	}

	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
