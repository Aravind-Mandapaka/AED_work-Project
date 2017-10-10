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
    private MasterTravelSchedule masterTravelSchedule;
    private ArrayList<AirLiner> airLinersList;
    private CustomerDirectory customerDirectory;

    public TravelAgency() {
        this.masterTravelSchedule = new MasterTravelSchedule();
        this.airLinersList = new ArrayList<AirLiner>();
        this.customerDirectory = new CustomerDirectory();
    }
    public MasterTravelSchedule getMasterTravelSchedule() {
        return masterTravelSchedule;
    }

    public void setMasterTravelSchedule(MasterTravelSchedule masterTravelSchedule) {
        this.masterTravelSchedule = masterTravelSchedule;
    }

    public ArrayList<AirLiner> getAirLinersList() {
        return airLinersList;
    }

    public void setAirLinersList(ArrayList<AirLiner> airLinersList) {
        this.airLinersList = airLinersList;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public AirLiner addAirLiner(){
        AirLiner airLiner=new AirLiner();
        airLinersList.add(airLiner);
        return airLiner;
    }
}
