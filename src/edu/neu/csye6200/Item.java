package edu.neu.csye6200;

public class Item {
	private String name; // 物品名称
    private double price; // 物品价格
    
    // 构造函数
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    // 获取物品名称
    public String getName() {
        return name;
    }
    
    // 获取物品价格
    public double getPrice() {
        return price;
    }
    
    // 重写 toString 方法以便输出物品信息
    @Override
    public String toString() {
        return "Item: " + name + ", Price: $" + String.format("%.2f", price);
    }
}

