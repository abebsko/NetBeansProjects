/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3exercises;

import javax.swing.JOptionPane;

/**
 *
 * @author seyib
 */
public class Menu {
    
    
    public static void main(String[] args){
    String str= JOptionPane.showInputDialog(null, "A chocolate [75p]" + "\n" + "B toffee [60p]" + "\n" + "C cookie[90p]" + "\n" + "Please enter your choice of product");
    char choice = str.charAt(0);
    String itemName = "";
    int itemPrice = 0;
    
    switch (choice) {
        case 'A':
        case 'a':
            itemName= "chocolate";
            itemPrice= 75;
            break; 
        case 'B':
        case 'b':
            itemName= "toffee";
            itemPrice= 60;
            break;
        case 'C':
        case 'c':
            itemName= "cookie";
            itemPrice= 90;
            break;
        default: 
            JOptionPane.showMessageDialog(null,"Product not selected");    
    } 
    
    String str2 = JOptionPane.showInputDialog(null, "How many " + itemName + " do you require?");
    int noOfItems = Integer.parseInt(str2);
    int totalCost = noOfItems * itemPrice;
    
    JOptionPane.showMessageDialog(null,"Your order is for " + noOfItems + " " + itemName + " and will cost " + totalCost + "p.");
    
    
    }
    
}
