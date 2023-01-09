/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2exercises;

import javax.swing.JOptionPane;

/**
 *
 * @author seyib
 */
public class Lab2Exercise14 {
  public static void main(String[] args){
    String reverseAnswer= "";// making an empty string for the loop
        String answer = JOptionPane.showInputDialog(null, "What is your name?");
        for (int i= answer.length()- 1; i>=0; i--){ //reverse loop starting from the last char in the string which is the length minus 1 bcs index starts at 0
            reverseAnswer += answer.charAt(i); //get the character       
    }
    if(answer.toLowerCase().equals(reverseAnswer.toLowerCase())){
            System.out.println(answer + " is a Palindrome String." );
            } else {
             System.out.println(answer + " is not a Palindrome String." );
             }
    }  
}
