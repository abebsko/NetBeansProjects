/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university;

/**
 *
 * @author seyib
 */
public class UGStudent extends Student {
    private int year; 
    
    public UGStudent(String name,  String id, Course course, int year){
    super(name,id,course);
    this.year = year;  
    }
    
    public int getYear(){
    return this.year;
    }
    
    public void setYear(int year){
    this.year = year;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Year: " + this.year; 
    // return super.getInfo() + ", Course: "+ super.getCourse() + ", Year: " + this.year; 
        }
}
