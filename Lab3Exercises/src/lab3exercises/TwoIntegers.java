/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3exercises;

import javax.swing.*;
/**
 *
 * @author seyib
 */
public class TwoIntegers {
    
    
    public static void main( String[] args) {
        
        String str1 = JOptionPane.showInputDialog(null, "Type a Number"); 
        String str2 = JOptionPane.showInputDialog(null, "Type another number Number"); 
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        if (num1 > 0 && num2 > 0){
            JOptionPane.showMessageDialog(null, "Both Positive");
        } else if (num1 < 0 && num2 < 0){
        JOptionPane.showMessageDialog(null, "Both Negative");
        }
        else if ((num1 > 0 ^ num1 < 0) && (num2 > 0 ^ num2 < 0)) {
        JOptionPane.showMessageDialog(null, "Opposite Signs");
        }
        else if (num1 == 0 || num2 == 0 ) {
        JOptionPane.showMessageDialog(null, "One is Zero");
        }
    
    
    //else if ((num1 > 0 ^ num1 < 0) && (num2 > 0 ^ num2 < 0)){
      //  JOptionPane.showMessageDialog(null, "Opposite Signs");}
    
    
    
    }
    
}
