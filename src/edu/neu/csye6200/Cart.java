package edu.neu.csye6200;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cart {
	private List<Item> items; // ���ﳵ�е���Ʒ�б�
    public static final String REVISION = "1.0"; // ��̬�޶��汾
    
    // ���캯��
    public Cart() {
        items = new ArrayList<>();
    }
    
    // �����Ʒ�����ﳵ
    public void addItem(Item item) {
        items.add(item);
    }
    
    // ���㹺�ﳵ�ܼ۸�
    public double getTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
    
    // ��ʾ���ﳵ���ݺͽ�����Ϣ
    public static void demo() {
        Cart cart = new Cart();
        double cash = 20.00; // �ֽ���
        
        // �����Ʒ�����ﳵ
        cart.addItem(new Item("Apple", 1.50));
        cart.addItem(new Item("Milk", 2.75));
        cart.addItem(new Item("Bread", 2.25));
        cart.addItem(new Item("Eggs", 3.50));
        
        double total = cart.getTotal(); // ��ȡ�ܼ۸�
        double change = cash - total; // ��������
        
        // ��ȡϵͳ��ǰʱ��
        Date now = new Date();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = dateFormatter.format(now);
        
        // ��ӡ�վ�
        System.out.println("----- Receipt -----");
        System.out.println("Date: " + formattedDate);
        
        for (Item item : cart.items) {
            System.out.println(item);
        }
        
        System.out.println("Total: $" + String.format("%.2f", total));
        if (change >= 0) {
            System.out.println("Cash: $20.00");
            System.out.println("Change: $" + String.format("%.2f", change));
        } else {
            System.out.println("Insufficient cash! You are short by $" + String.format("%.2f", -change));
        }
        System.out.println("-------------------");
    }
}
