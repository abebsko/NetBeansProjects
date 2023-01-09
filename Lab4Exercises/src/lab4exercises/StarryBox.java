/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4exercises;

import javax.swing.JOptionPane;

/**
 *
 * @author seyib
 */
public class StarryBox {

    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "This program will ask for a value of x and then a value for y. 
        // The program will then draw a box of stars of x columns and y rows");
        int x = Integer.parseInt(JOptionPane.showInputDialog("What is the Value for x "));
        int y = Integer.parseInt(JOptionPane.showInputDialog("What is the Value for y "));
        String output = "";

        for (int rows = 0; rows < x; rows++) { //external loop x = 3
            
            for (int columns = 0; columns < y; columns++) {  //internal loop y = 5
                output += "*";
            }
           output += "\n"; 
        }

        System.out.println(output);
    }

}
