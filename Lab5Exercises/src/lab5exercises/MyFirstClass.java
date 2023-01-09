/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5exercises;

/**
 *
 * @author seyib
 */
public class MyFirstClass {

    private String name;
    private String capital;
    private double populationInMillions;

    public MyFirstClass(String name, String capital, double populationInMillions) {
        this.name = name;
        this.capital = capital;
        this.populationInMillions = populationInMillions;
    }

    public String getName() {
        return this.name;
    }

    public String getCapital() {
        return this.capital;
    }

    public double getPopinMill() {
        return this.populationInMillions;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    
    public void setCapital(String newCapital){
    this.capital = newCapital; 
    }
    
    public void setPopInMill(double newPop){
    this.populationInMillions = newPop; 
    }
    
    @Override
    public String toString() {
    return "Name of Country: " + name + " Capital city of Country: " + capital + " population: " + populationInMillions;
    }
}
