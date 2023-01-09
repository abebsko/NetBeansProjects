/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3exercises;

/**
 *
 * @author seyib
 */
public class Lab3Exercises6 {
 public static void main(String[] args){
     boolean x,y;
     //AND TRUTH TABLE
//     x=false; 
//     y= false; 
//     System.out.println(x + " AND " + y + " is "+ (x&&y));
//     x= true;
//     System.out.println(x + " AND " + y + " is "+ (x&&y));
//     x= false;
//     y= true;
//     System.out.println(x + " AND " + y + " is "+ (x&&y));
//     x= true;
//     y= true;  
//     System.out.println(x + " AND " + y + " is "+ (x&&y));
     
//     //OR TRUTH TABLE
//     x=false; 
//     y= false; 
//     System.out.println(x + " OR " + y + " is "+ (x||y));
//     x= true;
//     System.out.println(x + " OR " + y + " is "+ (x||y));
//     x= false;
//     y= true;
//     System.out.println(x + " OR " + y + " is "+ (x||y));
//     x= true;
//     y= true;  
//     System.out.println(x + " OR " + y + " is "+ (x||y));
//     
////     //NOT and TRUTH TABLE
//      x=false; 
//     y= false; 
//     System.out.println("NOT " +x + " and " + y + " is "+ !(x&&y)); //  x && y is false but opposite is true 
//     x= true;
//     System.out.println("NOT " +x + " and " + y + " is "+ !(x&&y));
//     x= false;
//     y= true;
//     System.out.println("NOT " +x + " and " + y + " is "+ !(x&&y));
//     x= true;
//     y= true;  
//     System.out.println("NOT " + x+ " and" + y + " is "+ !(x&&y));
     
     //NOT OR TRUTH TABLE
     x=false; 
     y= false; 
     System.out.println("NOT " +x + " OR NOT" + y + " is "+ ((!x)||(!y))); 
     x= true;
     System.out.println("NOT " +x + " OR NOT " + y + " is "+ ((!x)||(!y)));
     x= false;
     y= true;
     System.out.println("NOT " +x + " OR NOT" + y + " is "+ ((!x)||(!y)));
     x= true;
     y= true;  
     System.out.println("NOT " + x+ " OR NOT" + y + " is "+ ((!x)||(!y)));
 }   
}
