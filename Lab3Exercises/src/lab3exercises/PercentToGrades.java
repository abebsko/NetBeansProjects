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
public class PercentToGrades {
    
    public static void main( String[] args) {
        
        String str = JOptionPane.showInputDialog(null, "Enter a number between 0-100"); 
              int score = Integer.parseInt(str);
      
        if (score > 0 && score <= 100) {
        if (score >= 70){
            JOptionPane.showMessageDialog(null, "You scored an A");
        } else if (score >= 60 && score < 70){
        JOptionPane.showMessageDialog(null, "You scored a B");
        }
        else if (score >= 50 && score < 60) {
        JOptionPane.showMessageDialog(null, "You scored a C");
        }
        else if (score >= 40 && score < 50) {
        JOptionPane.showMessageDialog(null, "You scored a D");
        }
        else if (score >= 35 && score < 40) {
        JOptionPane.showMessageDialog(null, "You scored an E");
        }
        else {
        JOptionPane.showMessageDialog(null, "You scored an F");
        } 
        } 
        else {
              JOptionPane.showMessageDialog(null, "Number out of specified range");
              }
    
    }
}
