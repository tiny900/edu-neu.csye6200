package edu.neu.csye6200;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cart {
	private List<Item> items; // 购物车中的物品列表
    public static final String REVISION = "1.0"; // 静态修订版本
    
    // 构造函数
    public Cart() {
        items = new ArrayList<>();
    }
    
    // 添加物品到购物车
    public void addItem(Item item) {
        items.add(item);
    }
    
    // 计算购物车总价格
    public double getTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
    
    // 显示购物车内容和结算信息
    public static void demo() {
        Cart cart = new Cart();
        double cash = 20.00; // 现金金额
        
        // 添加物品到购物车
        cart.addItem(new Item("Apple", 1.50));
        cart.addItem(new Item("Milk", 2.75));
        cart.addItem(new Item("Bread", 2.25));
        cart.addItem(new Item("Eggs", 3.50));
        
        double total = cart.getTotal(); // 获取总价格
        double change = cash - total; // 计算找零
        
        // 获取系统当前时间
        Date now = new Date();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = dateFormatter.format(now);
        
        // 打印收据
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
