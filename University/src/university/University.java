/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package university;

/**
 *
 * @author seyib
 */
public class University {
    //testing person class
    public static void testPerson(){
        Person david = new Person("David", "1234");
        System.out.println(david);
        
}

    //testing Staff class
    public static void testStaff(){
        School comp = new School("Computing"); //creeated instances of school class 
        Staff roger = new Staff("Roger", "2345",comp);
        System.out.println(roger);
    }
    
    //testing school class
     public static void testSchool(){
        School comp = new School("Computing"); //creeated instances of school class 
        School data = new School("Data"); 
        Staff seyi = new Staff("Seyi", "2120", comp); //created staff
        Staff bolaji = new Staff("Bolaji", "2130", data);
        Staff bisola = new Staff("Bisola", "2344",comp);
        comp.addStaff(seyi); //added staff to 
        data.addStaff(bolaji);
        comp.addStaff(bisola);
        System.out.println(comp.staffList()); //displaying staff list per school
        System.out.println(data.staffList());
        System.out.println(bisola); //displaying information of each staff 
        
    }
     
     public static void testStudent(){
     Student david = new Student("David", "0123456", Course.ITBI);
        Student maria =  new Student("Maria", "2120267",Course.IT );
        david.enrol(new Module("CMM123", "Maths")); //enrolling david for a new subject 
        david.enrol(new Module("CMM003", "Software Development")); 
        System.out.println(david);
         System.out.println(maria);
     }
     
     public static void testModule(){
     Student david = new Student("David", "0123456", Course.ITBI);
        Student maria =  new Student("Maria", "2120267",Course.IT );
        Module bi = new Module("CM3709", "Business Intelligence");
        david.enrol(bi); //enrolling david and maria for new module bi
        maria.enrol(bi);
        System.out.println(maria);
        System.out.println(bi); //displaying info about module 
        System.out.println(bi.getClassList()); //getting attendees
      
     }
    
     public static void testUGPGStudents(){
     
        UGStudent rose = new UGStudent("Rose","212047", Course.ITCY, 2022 );
        System.out.println(rose);
        
        //testing PG Class
        PGStudent jack = new PGStudent("Jack", "203030", Course.ITNM, StudyMode.DL);
        System.out.println(jack);
     }
     
     public static void modelTesting(){
     //Model Testing 

    School computing = new School("Computing"); //new school
    Staff david = new Staff("David", "2345", computing); //new staff
    Staff bob = new Staff("Bob", "1995", computing);
    Staff bill = new Staff("Bill", "1996", computing); 
     //   System.out.println(david);
        computing.addStaff(david); //add staff to list
        computing.addStaff(bob);
        computing.addStaff(bill);
       // System.out.println(computing.staffList());
       Module bi = new Module("CM3709", "Business Intelligence"); //new module
       Module cy = new Module("CMM003", "Cybersecurity");
       Student grace = new Student("Grace", "0123456", Course.ITBI); //new students
       Student maria =  new Student("Maria", "2120267",Course.IT);
       Student tope = new Student("Tope", "2303030", Course.ITOG);
       Student dami = new Student("Dami", "2233444", Course.ITOG);
       grace.enrol(bi); //enroll students to modules 
       maria.enrol(bi);
       tope.enrol(cy);
       dami.enrol(cy);
//        System.out.println(grace);
//        System.out.println(bi.getClassList());
       PGStudent jack = new PGStudent("Jack", "203030", Course.ITNM, StudyMode.DL); //new pg students
       PGStudent jill = new PGStudent("Jill", "203031", Course.IT, StudyMode.FT);
        //System.out.println(jack);
        UGStudent rose = new UGStudent("Rose","212047", Course.ITCY, 2022 ); //new UG students
        UGStudent lily = new UGStudent("Lily","212020", Course.ITBI, 2022 );
//         Student abebi = new UGStudent("Abebi", "2120267", Course.IT, 2022);    
//         Student freedom = new Person("Freedom", "234445");
//         Person rasaq = new Student("Rasaq", "212343", Course.ITCY);
//        System.out.println(rose);
        jack.enrol(bi); //enrol a mix of students in modules 
        rose.enrol(bi);
        jill.enrol(cy);
        lily.enrol(cy);
        
        System.out.println(bi.getClassList());
        System.out.println(cy.getClassList());
        
        System.out.println(rose);
        System.out.println(jill);
        
        //staff.enrol(bi); would not work cause object is 
        
        
    
     }
    public static void main(String[] args) {
//        University.testPerson();
//        University.testSchool();
//        University.testStaff();
////        University.testStudent();
////        University.testUGPGStudents();
        University.modelTesting();
        
    
        
        
  
        


    } 
    
}
