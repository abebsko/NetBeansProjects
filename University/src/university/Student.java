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
public class Student extends Person {
    private Course course; 
    private ArrayList<Module> subjects;

    //Constructor 1
    public Student(String name, String id,Course course ) {
        super(name, id);
        this.course = course;
        this.subjects= new ArrayList();
    }
    
    //Coonstructor 2
    public Student(String name, String id,Course course, ArrayList<Module> subjects) {
        super(name, id);
        this.course = course;
        this.subjects= subjects;
    }
    
    public String getInfo(){
    return super.getName() + " [" + super.getId() + "]";
    }
    
    public void setInfo(String name, String id){
    super.setName(name);
    super.setId(id);
    
    }
          
    public void changeCourse(Course course){
    this.course = course; 
    }
    
    public void enrol(Module m){
    this.subjects.add(m);
    m.addStudent(this); //adds the current student to the module class list 
        }
    
    @Override
    public String toString(){
        //displaying the person information 
    return this.getInfo() + 
            //displaying the course information. 
           ", Course: " + course.toString() + 
            //display the module information
            ", Modules: " + subjects.toString(); //displays the content of the arraylist subjects
    
    }
}
