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
public class Lab2Exercises12 {
    public static void main(String[] args){
    String result="";// making an empty string for the loop
        String answer = JOptionPane.showInputDialog(null, "What is your name?");
        for (int i=0; i<answer.length(); i++){
            char ch = answer.charAt(i); //get the character
            if(ch!='a'&& ch !='e' && ch !='i'&& ch !='o'&& ch !='u'){
            result +=ch;
            } 
    }
        System.out.println("for input= " + answer+ " the result is " + result);
    
    }
    
}
