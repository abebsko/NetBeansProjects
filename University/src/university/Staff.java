/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university;

/**
 *
 * @author seyib
 */
public class Staff extends Person {
    private School school;
    
    //use this code to test school class
//    public Staff(String name,  String id) {
//    super(name,id);    
//    }
    
    public Staff (String name, String id, School school){
    super(name, id); //inherits from Person class
    this.school = school; 
        }
    
    public School getSchool(){
    return school; 
    }
    
    @Override
    public String toString(){
    String st = "";
    st += "staffName: " + super.getName() + ", staffid: " + super.getId() + " School: " + this.school.getName(); 
    return st;
    }
}
