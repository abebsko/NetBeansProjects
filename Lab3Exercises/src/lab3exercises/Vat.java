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
public class Vat {
    public static void main( String[] args) {
        
        String strCostOfItem = JOptionPane.showInputDialog(null, "What is the cost of the single item "); 
        double costOfItem = Double.parseDouble(strCostOfItem);
        String strnoOfItems = JOptionPane.showInputDialog(null, "How many of these items do you wish to buy?"); 
        int noOfItems= Integer.parseInt(strnoOfItems);
        String strVAT = JOptionPane.showInputDialog(null, "Is this item subject to VAT? type (y or n)");
        char vatDue = strVAT.charAt(0);
        double totalCost= 0.0;
        
        if ( vatDue == 'y' || vatDue == 'Y'){
            totalCost = costOfItem * noOfItems * 1.2;
        } 
        else {
        totalCost = costOfItem * noOfItems;
        }
        JOptionPane.showMessageDialog(null,"The total cost of " + noOfItems + " is £" + totalCost);
    }
}
