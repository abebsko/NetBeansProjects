/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2exercises;
import javax.swing.*; //package for JOptionPane which makes it east to pop up a standard dialog box 

/**
 *
 * @author seyib
 */
public class Lab2Exercises10 {
public static void main(String[] args) {
       
       /* Exercise 1 
    // print the length of String s 
       String s = "abcdef";
System.out.println("Length of s = " + s.length()) ;
// print every character of s with a space between each String s = "abcdef" ;
for (int i = 0 ; i < s.length() ; i++){
    System.out.println(s.charAt(i) + " ") ;
}*/
       
/* Exercise 2
String s1 = JOptionPane.showInputDialog(null, "Please answer question 1");
String s2 = JOptionPane.showInputDialog(null, "Please answer question 2");
if (s1.equals(s2)) { //how to compare string objects 
System.out.println("s1 and s2 contain the same string values");
} else {
System.out.println("s1 and s2 contain different string values");
}*/

/* Exercise 3
System.out.println("abcdef".toUpperCase());
System.out.println("Java CMM001".toLowerCase());
System.out.println("blue".equals("black"));
System.out.println("Java CMM001".replace("007", "023"));
System.out.println("Java CMM001".replace("001", "023"));
//System.out.println("23-10-2015".split("-")); //would'nt run because - is a regex char instead do code below

String [] res = "23-10-2015".split("-"); //put result into a string array named res
for(int i = 0;i < res.length; i++){
System.out.println(res[i]+ " "); 
} //loop over the array to display each of the result 
System.out.println("123 ".equals("123"));
System.out.println("abcdefghijklmnopqrstuvwxyz".substring(4,10));
System.out.println("abcdefghijklmnopqrstuvwxyz".indexOf("c"));
System.out.println("Java is the best".startsWith("jav"));
System.out.println("Java is the best".endsWith("st"));
*/

//Exercise 4
String s1= "ba", s2="na", s3= "";
s3=s1+s1;
System.out.println("1: " + s3);
s3=s1+s2+s2;
System.out.println("2: " + s3);
s3=s1;
for(int i=0; i < 2; i++){
    s3= s3+s2;
}
System.out.println("3: " + s3);
s3 =s1+s2+s2;
s3 = s3.substring(0,3) + "d" + s3.substring(3,s3.length());
System.out.println("4: " +s3);
s3 = s1.charAt(1)+ s1.charAt(0)+ s1;
System.out.println("5: " + s3);
s3="";//initializing the string back to nothing before starting the loop
for(int i = s2.length()-1; i >=0; i-- ){
    s3=s3+s2.charAt(i);
   }
s3=s3+s2;
 System.out.println("6: " + s3);
            // TODO code application logic here
}        
}
