/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7abstraction;


public class Rectangle extends Shape {
    private double base;
    private double height; 
    
   public Rectangle (String name, double base, double height){
   super(name);
   this.base = base;
   this.height = height;   
   }
   
    @Override
   public String toString(){
       String st = "";
       st += "\n" + super.getName() + "\t Base: " + this.base + " Height: " + 
               this.height + super.toString();
   return st;        
   }
   
    @Override
   public double getArea(){
   return base * height;
   }
    
    @Override
   public double getPerimeter(){
   return 2.0*(base + height);
   }
}
