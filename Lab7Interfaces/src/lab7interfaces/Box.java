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
public class Box implements Solid {

    private double width;
    private double depth;
    private double height;

    public Box( double width, double depth, double height) {
        this.width = width;
        this.depth = depth;
         this.height = height;
    }

    @Override
    public double getVolume() {
        return width * depth * height;
    }

    @Override
    public double getSurfaceArea() {
        return 2.0 * (width * depth + width * height + depth * height);
    }

    @Override
    public String toString() {
        //decimal format object
        DecimalFormat df =  new DecimalFormat("0.000"); 
        return "Box: width x depth x height = " + width + " x "
                + depth + " x " + height
                + " Volume = " + df.format(getVolume())
                + " Surface Area = " + df.format(getSurfaceArea());

    }
}
