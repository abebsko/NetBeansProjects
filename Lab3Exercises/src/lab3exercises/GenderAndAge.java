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
public class GenderAndAge {
     public static void main( String[] args) {
        
        String str1 = JOptionPane.showInputDialog(null, "Gender: "); 
              char gender = str1.charAt(0);
        String str2 =  JOptionPane.showInputDialog(null, "Age"); 
              int age = Integer.parseInt(str2);
              
              if (age < 18){
                   if (gender == 'f' || gender == 'F') {
                     JOptionPane.showMessageDialog(null, "It's a Girl");
                  } else if (gender == 'm' || gender == 'M'){
                    JOptionPane.showMessageDialog(null, "It's a Boy");   
                  } else {
                      JOptionPane.showMessageDialog(null, "Gender not Specified");
                  }
              
              } else {
              JOptionPane.showMessageDialog(null, "Person is older than 18"); 
              }
    }
}
