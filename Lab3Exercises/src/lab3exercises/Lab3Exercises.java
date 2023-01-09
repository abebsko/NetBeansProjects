/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3exercises;

import java.util.*;

/**
 *
 * @author seyib
 */
public class Lab3Exercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //declare the object and initialize with predefined input system.im
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        //string input 
        String name = sc.nextLine();
        //character input 
        System.out.println("Enter Gender(M/F)");
        char gender = sc.next().charAt(0);
        //numerical input 
        System.out.println("Enter Age");
        int age = sc.nextInt();
        System.out.println("Enter Mobile Number");
        long mobileNo = sc.nextLong();
        System.out.println("Enter Weight");
        double weight = sc.nextDouble();
        
        //print value to check input 
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number:" + mobileNo);
        System.out.println("CGPA: "+ weight);
        
    }
}
