/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4exercises;

import javax.swing.JOptionPane;

/**
 *
 * @author seyib
 */
public class LargestSmallestTotalAverage {

    public static void main(String[] args) {
        //declaring and initializing variables 
        int total = 0;
        double average;
        int count= 0;
        int num;
        //setting the largest to the smallest value possible 
        int largest = Integer.MIN_VALUE; 
        //setting the smallest to the largest value possible 
        int smallest= Integer.MAX_VALUE;

        for (int i = 1; i <= 5; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Enter a Number"));
            total += num; //add the num to total
            count++; //add 1 to count
            if (num > largest){
                largest = num; 
                }
            if(num < smallest) {
                smallest = num;
               } 
        }
      
        average =  total / count; 
       
        System.out.println("The Total is: " + total+ " and the average is " + average + "largest value is " + largest +
                " smallest is " + smallest);

        
    }

}
