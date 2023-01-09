/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university;

/**
 *
 * @author seyib
 */
public class PGStudent extends Student {
    private StudyMode status;
    
    public PGStudent(String name,  String id, Course course, StudyMode mode){
    super(name,id,course);
    this.status = mode;  
    }
    public StudyMode getMode(){
    return this.status;
    }
    
    public void setMode(StudyMode mode){
    this.status = mode;
    }
    
    public String toString(){
        return super.toString() + ", Staus: " + this.status; 
    // return "Name: " + super.getName() + ", Id: " + super.getId() + ", Course: "+ super.getCourse() + ", Staus: " + this.status; 
}

}
