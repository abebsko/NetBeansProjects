/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5orderingmodel;

import java.util.ArrayList;

/**
 *
 * @author seyib
 */
public class Order {

    private final Contact customer;
    private ArrayList<Item> items;

    //Constructor 1 
    public Order(Contact customer) {
        this.customer = customer;
        this.items = new ArrayList();
    }

    //Constructor 2 
    public Order(String name, String number) {
        customer = new Contact(name, number);
        items = new ArrayList();
    }

    public Contact getCustomer() {
        return this.customer;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void addItem(Product product, int numberUnits) {
        Item item = new Item(numberUnits, product);
        items.add(item);
    }

    public double getTotalCost() {
        //initializing variable cost
        double totalCost = 0.0;
        if (!items.isEmpty()) {
            for (Item item : items) {
            totalCost += item.getCost(); 
            }
        }
        return totalCost;
    }

    public String toString() {
        String st = "";

        st += "Customer Name: " + this.customer.getName() + "\n";
        if (!items.isEmpty()) {
            st += "Number Items: " + this.items.size() + "\n"; //size() is an arraylist function 
        } else {
            st += "No Items" + "\n";
        }
        
        
         st+= "Total Cost: " + this.getTotalCost()+ "\n"; 
        for (Item item : items) {
            st += "\t Item: " + item.getProduct().getName() + 
                    " - Unit Cost: " + item.getProduct().getUnitCost() +
                     " - Units: " + item.getNumberUnits() + 
                    " - Cost: " + item.getCost();
            st += "\n";
        }
        return st;
    }
public static void main(String[] args) {
       //Testing Order Class
        ArrayList<Order> orders = new ArrayList();
        orders.add(new Order("David", "012248888888"));
        orders.add(new Order("JCG", "01224999999"));
        orders.get(0).addItem(new Product("iPhone 6", 50), 2); //get the first customer and add item
        orders.get(1).addItem(new Product("iPhone 11", 600), 3);
        
        for (Order order2 : orders) {
            System.out.println(order2);
        } 
    }
     
}
