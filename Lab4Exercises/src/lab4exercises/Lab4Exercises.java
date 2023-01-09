/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4exercises;

//import java.util.*;
import javax.swing.*;

/**
 *
 * @author seyib
 */
public class Lab4Exercises {

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter a Number"));
        int sum = 0; //Initializing variable 
        for (int i = 1; i <= n; i++) {
            System.out.println("i = " + i + " Subtotal = " + (sum += i));

        }

    }

}
