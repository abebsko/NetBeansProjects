/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4exercises;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author seyib
 */
public class SumAverage1 {

    public static void main(String[] args) {
        // creating object df of Decimal Format class
        DecimalFormat df = new DecimalFormat("0.00");
        int count = 0;
        double sum = 0;

        double num = Double.parseDouble(JOptionPane.showInputDialog("Enter a Number(Negative to Exit )"));
            
        while (num > 0.0 && count < 10) {
            num = Double.parseDouble(JOptionPane.showInputDialog("Enter a Number(Negative Number )"));
            count++; // adds 1 to count 
            sum += num; // sum = sum + num
        }
        double average = sum / count;
        System.out.println("The total of the numbers entered is " + sum + "\n" + "There were " + count + " numbers \n"
                + "The average of the numbers entered is  " + df.format(average));

    }
}
