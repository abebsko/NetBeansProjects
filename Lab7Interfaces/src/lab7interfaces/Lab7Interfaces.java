/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7interfaces;

import java.util.ArrayList;

/**
 *
 * @author seyib
 */
public class Lab7Interfaces {

    //Testing method
    public static void testing() {
        //creating box objects as a type of box
        Box s = new Box(3.0, 4.0, 7.0);
// new arraylist
        ArrayList<Solid> solids = new ArrayList();
        //creating solids as a type of Solid 
        Solid s1 = new Box(3.0, 4.0, 7.0);
        Solid s2 = new Cone(3.0, 5.0);
        Solid s3 = new Cylinder(4.0, 5.0);
        solids.add(s1);
        solids.add(s2);
        solids.add(s3);
        //looping over the Solids ArrayList 
        String output = "";
        for (Solid sd : solids) {
            output += sd.toString() + "\n";
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        Lab7Interfaces.testing();
    }

}
