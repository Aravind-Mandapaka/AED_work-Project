/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author aravind
 */
public class CustomerDirectory {
    private ArrayList<Person> customerList;
    
    public CustomerDirectory() {
        customerList=new ArrayList<Person>();
    }

    public ArrayList<Person> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Person> customerList) {
        this.customerList = customerList;
    }
    
    public Person addPerson(){
        Person person=new Person();
        customerList.add(person);
        return person;
    }
}
