/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5orderingmodel;

import java.util.*;

/**
 *
 * @author seyib
 */
public class Product {
    //object properties 

    private final String name; //Product name can't be changed once it is created
    private double unitCost;

    public Product(String name, double unitCost) {
        this.name = name;
        this.unitCost = unitCost;
    }

    public String getName() {
        return name;//result 
    }

    public double getUnitCost() {
        return this.unitCost;
    }

    public void setUnitCost(double u) {
        unitCost = u;
    }

    public double getCost(int quantity) {
        return this.unitCost * quantity;
    }

    public String toString() {
        String st = "";
        st += "Product Name: " + this.name + "\n";
        st += "Unit Cost: " + this.unitCost + "\n";
        return st;
    }

    public static void main(String[] args) {
        //Testing Product Class
//     public Product(String name, double unitCost) {      
//      this.name = name;
//      this.unitCost = unitCost;
//    }
        
//            System.out.println(product);
//            System.out.println(p2);
       //System.out.println(product.getCost(2));
        
//        System.out.println(product.getUnitCost());
//        product.setUnitCost(499.99);//set new cost
//        System.out.println(product.getUnitCost());
//no need to call the toString method since its in the class


        //Creating an arraylist of products 
        Product product = new Product("iPhone 8", 150);
        Product p2 = new Product("iPhone XR", 999.99);
        ArrayList<Product> ps = new ArrayList();
        ps.add(new Product("iPhone 6", 50));
        ps.add(new Product("iPhone 7", 75));
        ps.add(new Product("iPhone 10", 400));
        ps.add(p2);
        ps.add(product);
        //normal for loop
        for(int i = 0; i < ps.size(); i++){ 
            System.out.println(ps.get(i).getName());      
        }
        //for each loop
        for (Product pr : ps) { //for each Product is type product2 is variable name and products is arrayname
            System.out.println(pr);
    }
}
}