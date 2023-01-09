/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5exercises;

import java.util.*; //import for arraylist 

/**
 *
 * @author seyib
 */
//Array list- dynamic and can grow on the fly
public class Lab5Exercises2 {

    public static void main(String[] args) {
        //creating an array list
    ArrayList<String> str = new ArrayList();
    ArrayList<Integer> numbers = new ArrayList();
    ArrayList<Double> values = new ArrayList();

// creating new ArrayList called people 
        ArrayList<String> people = new ArrayList();
        //adding values 
        people.add("Jean");
        people.add("John");
        people.add("Catherine");
        people.add("David");

        System.out.println(people.toString()); //displaying contents
        System.out.println("Size of array is " + people.size()); //getting the size 
        people.add("Martin");
        System.out.println(people.toString());
        System.out.println("Size of array is " + people.size());
        System.out.println("name is " + people.get(0)); // returns Jean
        System.out.println("name is " + people.get(3)); // returns David
//
// Changing an existing element 
        people.set(2, "Marie"); //We are changing the name
        people.set(1, people.get(1) + " Green"); // Are adding Green to existing name
        System.out.println(people.toString());

////checking if an element value exists in ArrayList
        System.out.println("Is Jean in the Array list?");
        if (people.contains("Jean")) {
            System.out.println("The person was found");
        } else {
            System.out.println("The person was NOT found");
        }
//
//        //find the location of an element in an Array list 
        int position = people.indexOf("David");
        System.out.println("The position of David is " + position);

//        //checking if an ArrayList to is equal to another
        System.out.println(people.toString());
        ArrayList<String> people2 = new ArrayList();
        people2.add("Jean");
        people2.add("John Green");
        people2.add("Marie");
        people2.add("David");
        people2.add("Martin");
        System.out.println(people2.toString());
        System.out.println(people.equals(people2)); //returns true  
        people2.set(3, "Peter"); //changed david to peter 
        System.out.println(people.equals(people2));// returns false 

        List<String> group = people.subList(2, 5); // getting a subset of the people ArrayList
        System.out.println("Using conventional iteration method");
        for (int i = 0; i < group.size(); i++) {
            System.out.print(group.get(i) + " "); //put some space between tokens
        }
        System.out.println(); //make sure we go to next line
        System.out.println("Using new iteration method");
        for (String person : group) { //for-each loop 
            System.out.print(person + " ");
        }

//        //removing an element from ArrayList
//        System.out.println();
//        System.out.println(people.toString());
//        people.remove("David");
//        System.out.println(people.toString());
//
//        //empty an ArrayList 
//        people.clear();
//        System.out.println(people.toString());
    }
}
