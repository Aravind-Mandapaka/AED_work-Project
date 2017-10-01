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
 
    private ArrayList<Customer> customerlist;
    
    public CustomerDirectory()
    {
    Customer cust = new Customer();
    
    
    }
    public Customer addcustomer()
    {
    Customer cs = new Customer();
    customerlist.add(cs);
    return cs;
    }

    public ArrayList<Customer> getCustomerlist() {
        return customerlist;
    }

    public void setCustomerlist(ArrayList<Customer> customerlist) {
        this.customerlist = customerlist;
    }
    
}
