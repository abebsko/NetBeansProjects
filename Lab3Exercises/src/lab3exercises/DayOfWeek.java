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
public class DayOfWeek {
    
    public static void main (String [] args) {
    
    String str= JOptionPane.showInputDialog(null, "Please Enter a Number between 1-7");
    int value =Integer.parseInt(str);
    String daysOfWeek = "";
    
    switch (value)  {
        case 1:
            daysOfWeek = "Monday";
            break;
        case 2:
            daysOfWeek = "Tuesday";
            break;
        case 3: 
            daysOfWeek = "Wednesday";
            break;
        case 4:
            daysOfWeek = "Thursday";
            break;
        case 5:
            daysOfWeek = "Friday";
            break;
        case 6:
            daysOfWeek = "Saturday";
            break;
        case 7:
            daysOfWeek = "Sunday";
            break;
        default: 
            JOptionPane.showMessageDialog(null,"Number not in range");
    }
    
    JOptionPane.showMessageDialog(null,"Today is " + daysOfWeek);
    
    }
    
}
