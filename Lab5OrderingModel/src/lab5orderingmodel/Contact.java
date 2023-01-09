/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5orderingmodel;

import java.util.ArrayList;

/**
 *
 * @author seyib
 */
public class Contact {

    private final String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getphoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        String st = "";
        st += "Name: " + this.name + "- Number: " + this.phoneNumber;
        return st;
    }

    public static void main(String[] args) {
      //testing Contact Class 
        ArrayList<Contact> myContacts = new ArrayList();
        //creating objects
        Contact c1 = new Contact("David", "01224 888 666");
        Contact c2 = new Contact("JCG", "07567 777 333");
        Contact c3 = new Contact("Peter", "01345 999 333");
       
        //adding to arraylist
        myContacts.add(c1);
        myContacts.add(c2);
        myContacts.add(c3);
        myContacts.add(new Contact("Suzy", "01224 555 777"));
        myContacts.add(new Contact("Yolanda", "01224 555 777"));
        myContacts.add(new Contact("Deek", "01224 463 111"));
        //looping to display
        for (Contact contact : myContacts) {
            System.out.println(contact);
        }  
    }

}
