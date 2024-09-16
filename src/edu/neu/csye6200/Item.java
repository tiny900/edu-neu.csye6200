package edu.neu.csye6200;

public class Item {
	private String name; // ��Ʒ����
    private double price; // ��Ʒ�۸�
    
    // ���캯��
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    // ��ȡ��Ʒ����
    public String getName() {
        return name;
    }
    
    // ��ȡ��Ʒ�۸�
    public double getPrice() {
        return price;
    }
    
    // ��д toString �����Ա������Ʒ��Ϣ
    @Override
    public String toString() {
        return "Item: " + name + ", Price: $" + String.format("%.2f", price);
    }
}

