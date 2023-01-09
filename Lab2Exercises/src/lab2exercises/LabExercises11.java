/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2exercises;
import javax.swing.*;

/**
 *
 * @author seyib
 */
public class LabExercises11 {
    public static void main(String[] args){
        //intitialize the counter 
        int vowels= 0;
        int consonants= 0;
        String answer = JOptionPane.showInputDialog(null, "What is your name?");
        for (int i=0; i<answer.length(); i++){
            char ch = answer.charAt(i); //get the character
            if(ch=='a'|| ch=='e'|| ch=='i' || ch== 'o' || ch== 'u'){
            vowels++;
            } else {
                consonants++;
            }
    }
        System.out.println("for input= " + answer+ " the number of vowels is " + vowels + " and number of consonants is " + consonants);
}
}