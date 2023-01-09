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
public class Gradesv2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        String numberA = "", numberB = "", numberC = "", numberD = "";
        int mark = 0, count = 0, sum = 0;
        

        JOptionPane.showMessageDialog(null, "This program will prompt you to enter markds. The marks haveto be between 0 and 100. The program will then sort the marks into grades. "
                + "To end the program enter -1 as the mark");

        do {
            mark = Integer.parseInt(JOptionPane.showInputDialog("Enter the Mark"));

            if (mark >= 80 && mark <= 100) {
                numberA+= "*";
            } else if (mark >= 60 && mark < 80) {
                numberB+= "*";
            } else if (mark >= 40 && mark < 60) {
                numberC+= "*";
            } else if (mark <= 39) {
                numberD+= "*";
            }
            count++;
            sum += mark;
        } while (mark != -1);
        double average = sum / count;
        System.out.println("There were " + count + " marks" + "\n" + "Grade A: " + numberA + "\n" + "Grade B: " + numberB + "\n"
                + "Grade C: " + numberC + "\n" + "Grade D: " + numberD + "\n" + "The average of the marks was " + df.format(average));

    }
}
