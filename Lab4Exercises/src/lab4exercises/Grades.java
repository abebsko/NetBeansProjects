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
public class Grades {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        int numberA = 0, numberB = 0, numberC = 0, numberD = 0;
        int mark = 0, count = 0, sum = 0;

        JOptionPane.showMessageDialog(null, "This program will prompt you to enter marks. The marks have to be between 0 and 100. The program will then sort the marks into grades. "
                + "To end the program enter -1 as the mark");

        do {
            mark = Integer.parseInt(JOptionPane.showInputDialog("Enter the Mark"));

            if (mark >= 80 && mark <= 100) {
                numberA++;//adds 1 to A
            } else if (mark >= 60 && mark < 80) {
                numberB++; //adds 1 to B
            } else if (mark >= 40 && mark < 60) {
                numberC++; //adds 1 to C
            } else if (mark <= 39) {
                numberD++; //adds 1 to D
            }
            count++;//adds 1 to count 
            sum += mark; //adding all the marks together.  
        } while (mark != -1);
        double average = sum / count;
        System.out.println("There were " + count + " marks" + "\n" + "Grade A: " + numberA + "\n" + "Grade B: " + numberB + "\n"
                + "Grade C: " + numberC + "\n" + "Grade D: " + numberD + "\n" + "The average of the marks was " + df.format(average));

    }
}
