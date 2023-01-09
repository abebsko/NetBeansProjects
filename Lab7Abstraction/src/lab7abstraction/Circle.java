/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7abstraction;


public class Circle extends Shape {
    private double radius; 
    
    public Circle(String name, double radius) {
    super (name); 
    this.radius = radius;   
    }
    
    @Override
    public double getArea(){
    return Math.PI * radius * radius; 
    }
    
    @Override
    public double getPerimeter(){
    return 2.0* Math.PI * radius;
    }
    
    @Override
   public String toString(){
       String st = "";
       st += "\n" + super.getName() + "\t radius: " + this.radius + super.toString();
   return st;        
   }
}
