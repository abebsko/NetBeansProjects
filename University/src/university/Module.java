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
public class Module {

    private String code;
    private String subject;
    private ArrayList<Student> classList;

    public Module(String code, String subject) {
        this.code = code;
        this.subject = subject;
        this.classList = new ArrayList();
    }

    public String getCode() {
        return code;
    }
    
    public String getSubject() {
        return subject;
    }
    
    public void setCode(String code) {
    this.code = code;
    }
    
    public void setSubject(String subject) {
    this.subject = subject;
    }
    
    public String toString(){
    return "Code: " + this.code + ", Subject: " + this.subject;
    }
    
    public void addStudent(Student student){
      this.classList.add(student);
        }
    
    public String getClassList(){
    String st = "";
        int count = 0;
        if (!classList.isEmpty()) {
            for (Student student : classList) {
                count++;
                st += count + " " + student.getName() + " "+ student.getId() + 
                        "\n";      
            }
        } else {
            st += "No students taking this Module";
        }
        return "Names of Students enrolled in " + this. code + " = " + this.subject + "\n" + st ;  
    }
    
}
