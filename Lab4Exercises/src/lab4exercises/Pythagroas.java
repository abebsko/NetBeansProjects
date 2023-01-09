/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4exercises;

//import javax.swing.JOptionPane;
/**
 *
 * @author seyib
 */
public class Pythagroas {

    public static void main(String[] args) {
 
        for (int x = 1; x < 100; x++) { //x < y < z 
            for (int y = x; y < 100; y++) {
                for (double z = y; z < 100; z++) {
                    if (z == Math.sqrt(x*x+y*y) && z == (int)z ){
                    System.out.println(x + " " + y + "  " + z);    
                }
                }
            }
        }
       
        
        /*
        for (int x = 1; x < 100; x++) {
            for (int y = x; y < 100; y++) {
                for (int z = y; z < 100; z++) {
                    if ((x * x) + (y * y) == (z * z)) {
                        System.out.println(x + " " + y + "  " + z);
                    }
                }
            }
        }
*/
    }
}
