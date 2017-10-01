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
public class TravelAgency {
    private  String name;
    private String id;
    private String address;
    private MasterSchedule mastersch;
    private CustomerDirectory customerdir;
    private ArrayList<Airliner> airlinerlist;
     
    public TravelAgency()
    {
    MasterSchedule msch = new MasterSchedule();
    CustomerDirectory custdir = new CustomerDirectory();
        ArrayList<Airliner> air = new ArrayList<Airliner>();
    
    }
    public Airliner addairliner()
    {
    Airliner ar = new Airliner();
    airlinerlist.add(ar);
    return ar;
    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public MasterSchedule getMastersch() {
        return mastersch;
    }

    public void setMastersch(MasterSchedule mastersch) {
        this.mastersch = mastersch;
    }

    public CustomerDirectory getCustomerdir() {
        return customerdir;
    }

    public void setCustomerdir(CustomerDirectory customerdir) {
        this.customerdir = customerdir;
    }

    public ArrayList<Airliner> getAirlinerlist() {
        return airlinerlist;
    }

    public void setAirlinerlist(ArrayList<Airliner> airlinerlist) {
        this.airlinerlist = airlinerlist;
    }
    
}
