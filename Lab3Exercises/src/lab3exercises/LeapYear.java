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
public class LeapYear {
    public static void main( String[] args) {
        
        String strYear = JOptionPane.showInputDialog(null, "Please enter a Year "); 
              int year = Integer.parseInt(strYear);
              
              if (year % 4 == 0 && year % 100 != 0){
               
              JOptionPane.showMessageDialog(null, year + " is a leap year");    
              
              } else if ( year % 100 == 0 && year % 400 == 0){
              
              JOptionPane.showMessageDialog(null, year + " is a leap year");  
              }
              
              else {
              JOptionPane.showMessageDialog(null, year + " is not leap year"); 
              }
    }
}
