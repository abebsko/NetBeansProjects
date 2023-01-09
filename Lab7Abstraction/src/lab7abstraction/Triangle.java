/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7abstraction;

public class Triangle extends Shape {
    private double base;
    private double height;
    
   public Triangle (String name, double base, double height){
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
   return 0.5*base * height;
   }
    
    @Override
   public double getPerimeter(){
   return (base + height+ Math.sqrt(base*base + height* height));
   }
    
}
