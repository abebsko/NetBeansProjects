/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5exercises;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 *
 * @author seyib
 */
public class Lab5Exercises {

    public static void main(String[] args) {
        //creating an array using primitive data
        int[] data = new int[5]; // an array named data that contains 5 integers
        data[0] = -10; 
        data[1] = -2;
        data[2] = 0;
        data[3] = 8;
        data[4] = 199;
        //initializing an array 
        int[] data2 = new int[]{40, -2, 12, 56, 0, 12};
        //iterating over an array with for loop 
//        for (int i = 0; i < 5; i++) {
//            System.out.println(data[i]);
//            
//        }
//      //getting the size of an array 
//        System.out.println("Array size= " + data.length);
//
////        //displaying the values of an array 
//        System.out.println("Arrays.toString(data) displays " + Arrays.toString(data));

//        //creating an arrary of object instances 
        DecimalFormat df = new DecimalFormat("0.00");
        DecimalFormat[] formaters = new DecimalFormat[3]; //created a formaters array setup to hold DecimalFormat objects 
//      //assigning values to array elements 
        formaters[0] = new DecimalFormat("0.00");
        formaters[1] = new DecimalFormat("0.000");
        formaters[2] = new DecimalFormat("0.0000");
//        
//        // N.B the data type has to be the same for all the objects 
//        // arrays cant grow 
//        
//        //using the formatters array 
        double d =3.0/0.66; 
              System.out.println(formaters[2].format(d));        
//   // Creating a new class and testing the get and set methods
//    MyFirstClass c1 = new MyFirstClass("Nigeria","Abuja", 123);
//        System.out.println("The giant of Africa is " + c1.getName());
//        c1.setName("United AE");
//        System.out.println("The new name of Nigeria is " + c1.getName());
//        System.out.println(c1.toString());

    }

}
