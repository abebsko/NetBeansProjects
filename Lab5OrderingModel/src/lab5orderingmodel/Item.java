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
public class Item {

    private int numberUnits;
    private final Product product;

    //Constructor 1 
    public Item(int numberUnits, String name, double unitCost) {
        this.numberUnits = numberUnits;
        this.product = new Product(name, unitCost);
    }

    //Constructor 2
    public Item(int numberUnits, Product p) {
        this.numberUnits = numberUnits;
        this.product = p;
    }
//Constructor 3 
    public Item(Product product) {
        this.product = product;
        numberUnits = 1;
    }

    public int getNumberUnits() {
        return numberUnits;
    }

    public Product getProduct() {
        return product;
    }

    public void setNumberUnits(int numberUnits) {
        this.numberUnits = numberUnits;
    }

    public double getCost() {
        return product.getCost(numberUnits);
    }

    public String toString() {
        String st = "";
        st += "Product Name: " + this.product.getName() + " - Number Units: " + this.numberUnits + "- Cost: " + this.getCost();
        return st;
    }

    public static void main(String[] args) {
 //testing item class
        ArrayList<Item> items = new ArrayList();
//        Item i1 = new Item(2, "iphone 8", 150);
        Product p2 = new Product("iPhone XR", 999.99);
        Product p3=  new Product("Iphone 10", 400); 
//        Item i3 = new Item (3, p2);// referring to constructor 2 
//        Item i2 =  new Item (3, new Product("ipone 10", 250.99));
//        Item i4 =  new Item(p3); 

        items.add(new Item(2, "iphone 8", 150));
        items.add(new Item(3, new Product("ipone 10", 250.99)));
        items.add(new Item(new Product("Iphone 10", 400)));

        for (Item item : items) {
            System.out.println(item);
        }
        
    }
}
