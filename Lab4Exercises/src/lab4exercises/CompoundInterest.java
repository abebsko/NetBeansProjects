/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4exercises;

import java.text.DecimalFormat; //import decimal format java class
import javax.swing.JOptionPane;

/**
 *
 * @author seyib
 */
public class CompoundInterest {

    public static void main(String[] args) {

        double p = Double.parseDouble(JOptionPane.showInputDialog("What is the initial balance to be invested"));
        double r = Double.parseDouble(JOptionPane.showInputDialog("What is the % interest rate"));
        DecimalFormat df = new DecimalFormat("0.00"); //create new instance of the class 

        System.out.println("Initial balance = " + p);
        System.out.println("Interest rate = " + r);
        for (int i = 1; i <= 25; i++) {
            p *= 1 + (r/100);

            System.out.println("Year " + i + " balance = " + df.format(p)); //use the df.format() to format the variable 
        }

        //formatting number 
    }

}
