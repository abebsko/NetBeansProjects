/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3exercises;
import java.util.*;

/**
 *
 * @author seyib
 */
public class PosNegZero {
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
        System.out.println("Type a Number");
    int num = sc.nextInt();
    if (num > 0 ){
        System.out.println("Positive Number");
    } else if (num < 0) { 
        System.out.println("Negative Number");
    }
    else {
    System.out.println("Zero");
    }
    }
}
