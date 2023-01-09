/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3exercises;

/**
 *
 * @author seyib
 */
public class Lab3Exercises5 {
    public static void main (String [] args ){
    int num = 10; 
    double x = 40; 
    double y= 30;
    char c = 'y';
    int age = 30;
    boolean male = true; 
    
   if (num >= 1 && num <=10){
       System.out.println("Num is greater than 1 or equal to 1 and smaller than or equal to 10");
   }
   if (num % 5 == 0){
       System.out.println("");
   }
   if (x + y < 100.0){
       System.out.println("x plus y is inddeed smaller than 100");
   }
   if ( c == 'y' || c == 'Y'){
       System.out.println("the char is y or Y");
   }
   
   if (age <= 40 && male == true) {
       System.out.println("The age is smaller or equal to 40 and male is also true");
   }
   
}
}
