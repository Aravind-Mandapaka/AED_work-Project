/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HumanResources;

import Business.SystemAdmin.UserAccount;

/**
 *
 * @author aravind
 */
public class Person {
 
    private String firstName;
    private String lastName;
    private String address;
    private int age;
     
    //private UserAccount useraccount;

   // public Person() {
        
   // }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.firstName;
//To change body of generated methods, choose Tools | Templates.
    }
    
}
