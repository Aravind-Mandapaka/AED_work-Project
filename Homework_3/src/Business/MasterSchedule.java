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
public class MasterSchedule {
 //  private ArrayList<Airliner>airlinerlist;
   private ArrayList<FlightSchedule> flightschedule;
   
   public MasterSchedule()
   {
   ArrayList<FlightSchedule> flight = new ArrayList<FlightSchedule>();
   }
    public FlightSchedule addflightschdeule()
    {
    FlightSchedule fsch = new FlightSchedule();
    flightschedule.add(fsch);
    return fsch;
    }

    public ArrayList<FlightSchedule> getFlightschedule() {
        return flightschedule;
    }

    public void setFlightschedule(ArrayList<FlightSchedule> flightschedule) {
        this.flightschedule = flightschedule;
    }
    
}
