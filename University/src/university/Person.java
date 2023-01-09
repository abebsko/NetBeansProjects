/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university;

/**
 *
 * @author seyib
 */
public class Person {
    private String name;
    private String id;
    
    public Person (String name, String id){
    this.name = name;
    this.id = id;        
    }
    
    public String getName() {
    return name;
    }
    
    public void setName(String name){
    this.name = name; 
    }
    
    public String getId(){
    return id; 
    }
    
    public void setId(String id){
    this.id = id; 
    }
    
    @Override
    public String toString(){
    String st = "";
    st += "Name: " + this.name + ", id: " + this.id; 
    return st;
    } 
}
