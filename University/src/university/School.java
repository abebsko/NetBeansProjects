/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university;

import java.util.ArrayList;

/**
 *
 * @author seyib
 */
public class School {

    private String name;
    private ArrayList<Staff> staff;

    public School(String name) {
        this.name = name;
        this.staff = new ArrayList();//empty arraylist
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name: " + this.name;
    }

    public void addStaff(Staff st) {
        this.staff.add(st);
    }

    public ArrayList<Staff> getStaff() {
        return staff;
    }

    public String staffList() {
        String st = "";
        int count = 0;
        if (!staff.isEmpty()) {
            for (Staff i : staff) {
                count++;
                st += count + " " + i.getName() + "\n";      
            }
        } else {
            st += "No staff records availaible";
        }
        return "Names of Staff in " + this.name + " School"+ "\n" + st ;
    }
}
