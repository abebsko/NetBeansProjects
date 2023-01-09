/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7abstraction;

import java.util.ArrayList;

/**
 *
 * @author seyib
 */
public class Lab7Abstraction {

    public static void Testing(){
    ArrayList <Shape> shapeList =  new ArrayList();
Circle c1 = new Circle("C1", 10);
Rectangle r1 = new Rectangle ("R1",10.0, 10.0); 
Triangle t1 =  new Triangle("t1", 12.0, 10);
shapeList.add(c1);
shapeList.add(r1);
shapeList.add(t1);
//creating new shape can also be 
Shape s1 = new Circle( "C2", 13);
shapeList.add(s1);
//looping over the shapeList
String output = ""; 
double total = 0; 
for(Shape shape: shapeList){ 
    output += shape.toString();
total += shape.getArea();
}
        System.out.println(output + "\n" + "Total area= " + total);
    }
    public static void main(String[] args) {
    Lab7Abstraction.Testing();
    }
    
}
