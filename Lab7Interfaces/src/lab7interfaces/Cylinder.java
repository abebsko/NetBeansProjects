/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7interfaces;

import java.text.DecimalFormat;

/**
 *
 * @author seyib
 */
public class Cylinder implements Solid {
     private double height;
    private double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
       this.radius = radius; 
    }

    @Override
    public double getVolume() {
        return Math.PI*radius*radius*height;
    }

    @Override
    public double getSurfaceArea() {
        return 2.0*Math.PI*radius*(radius+height);
    }

    @Override
    public String toString() {
        DecimalFormat df =  new DecimalFormat("0.000");
        return "Cylinder: radius x height = " + radius + " x " + height
                + " Volume = " + df.format(getVolume())
                + " Surface Area = " + df.format(getSurfaceArea());

    }
}
