/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7abstraction;

/**
 *
 * @author seyib
 */
public abstract class Shape {

    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String getName() {
        return name;
    }

    public String toString() {
        return "\n Area: " + this.getArea() + " Perimeter: " + this.getPerimeter();

    }

}
