package edu.neu.csye6200;

import java.util.ArrayList;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Cart {
	
	public static final int REVISION = 0;
	
	public static int sum = 0;
	public static ArrayList<Item> items = new ArrayList<Item>();
	public static int cash = 20;

	@Override
	public String toString() {
		return "Cart []";
	}
	
	public static void demo() {
		Item item1 = new Item("apple", 5);
		Cart.items.add(item1);
		Item item2 = new Item("banana", 6);
		Cart.items.add(item2);
		
		for(Item i : items) {
			Cart.sum = Cart.sum + i.getPrice();
		}
		
		int Change = Cart.cash - Cart.sum;
		
		System.out.println("Receipt");
		
		LocalDateTime localdatetime = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = localdatetime.format(myFormatObj);
		System.out.println(formattedDate);
		
		System.out.println("Item\tPrice");
		for(Item i : items) {
			System.out.println(i.getName() + "\t$" + i.getPrice());
		}
		System.out.println("Sum:\t$" + Cart.sum);
		System.out.println("Paid:\t$" + Cart.cash);
		System.out.println("Change:\t$" + Change);
	}
	
}
