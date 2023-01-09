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
public class DayOfWeek2 {
  public static void main (String [] args) {
    
    String str= JOptionPane.showInputDialog(null, "Please Enter a Number between 1-7");
    char value = str.charAt(0);
    String daysOfWeek = "";
    
    switch (value)  {
        case 'o':
            daysOfWeek = "Monday";
            break;
        case 't':
            daysOfWeek = "Tuesday";
            break;
       // case 't': 
         //   daysOfWeek = "Wednesday";
           // break;
        case 'f':
            daysOfWeek = "Thursday";
            break;
       // case 'f':
        //    daysOfWeek = "Friday";
        //    break;
        case 's':
            daysOfWeek = "Saturday";
            break;
       // case 's':
       //     daysOfWeek = "Sunday";
         //   break;
        default: 
            JOptionPane.showMessageDialog(null,"Number not in range");
    }
    
    JOptionPane.showMessageDialog(null,"Today is " + daysOfWeek);
    
    }  
}
