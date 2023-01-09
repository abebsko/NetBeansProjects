/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5orderingmodel;

import java.util.ArrayList;

/**
 *
 * @author seyib
 */
public class Lab5OrderingModel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //First Customer
        Contact customer = new Contact("Jean Claude", "01224555555");
        Order order = new Order(customer); //create instance of order
        System.out.println(order); //no items
        //testing product 
        //Product 1
        Product product = new Product("iPhone 13", 999.99); //create instance of product
        order.addItem(product, 2); //add product to item list
        System.out.println(order); //1phone 13 added
        //Product 2
        Product product2 = new Product("iPhone 8", 150.00); //create another product 
        order.addItem(product2, 3); //add product to item list
        System.out.println(order);// returns two products 2 items 

       //Second Customer 
        Contact customer2 = new Contact("JCG", "07567 777 333");
        Order myOrder = new Order(customer2);
        System.out.println(myOrder);
        Product product3 = new Product("iPhone 14", 1999.99);
        myOrder.addItem(product3, 2);
        System.out.println(myOrder);
//
//        //Stop Watch Exercise 
//        Stopwatch.start();
//        ArrayList<Order> orders1 = new ArrayList();
//        String st = "";
//        for (int i = 0; i < 20000; i++) {
//            st += i;
//        }
//        orders1.add(new Order(st, st));
//        //String st = "";
//        for (Order orderss : orders1) {
//            System.out.println(orderss);
//        }
//
//        Stopwatch.stop();
//
//        System.out.println(
//                "Time elapsed in second " + Stopwatch.getTimeInSeconds());
//        System.out.println(
//                "Time elapsed in H:M:S " + Stopwatch.getTimeInHMS());
    }

}
