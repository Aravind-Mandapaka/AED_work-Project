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
public class Airliner {
    
    private String airlinername;
    private String airportname;
    Fleet fleetlist;
    //private ArrayList<FlightSchedule> flightschedule;
    public Airliner()
    {
         fleetlist = new Fleet();
        
    }

    public String getAirlinername() {
        return airlinername;
    }

    public void setAirlinername(String airlinername) {
        this.airlinername = airlinername;
    }

    public String getAirportname() {
        return airportname;
    }

    public void setAirportname(String airportname) {
        this.airportname = airportname;
    }

    public Fleet getFleetlist() {
        return fleetlist;
    }

    public void setFleetlist(Fleet fleetlist) {
        this.fleetlist = fleetlist;
    }

    @Override
    public String toString() {
        return this.airlinername;
//To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
