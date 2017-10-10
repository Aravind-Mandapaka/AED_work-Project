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
public class MasterTravelSchedule {

    private ArrayList<FlightSchedule> flightScheduleList;

    public MasterTravelSchedule() {
        this.flightScheduleList = new ArrayList<FlightSchedule>();
    }

    public ArrayList<FlightSchedule> getFlightScheduleList() {
        return flightScheduleList;
    }

    public void setFlightScheduleList(ArrayList<FlightSchedule> flightScheduleList) {
        this.flightScheduleList = flightScheduleList;
    }
    
    public FlightSchedule addFlightSchedule(){
        FlightSchedule flightSchedule=new FlightSchedule();
        this.flightScheduleList.add(flightSchedule);
        return flightSchedule;
    }
}
