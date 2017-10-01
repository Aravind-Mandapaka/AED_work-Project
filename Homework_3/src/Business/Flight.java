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
public class Flight {

private String fightno;
private ArrayList<Seat>seatslist;
//private Aeroplane aeroplane;
FlightSchedule flightsch;

public Flight()

{
    FlightSchedule fch = new FlightSchedule();
    ArrayList<Seat> seat = new ArrayList<Seat>();
    FlightSchedule fs = new FlightSchedule();
   
}
    public Seat addseat()
    {
        Seat se= new Seat();
        seatslist.add(se);
        return se;
    }   

    public String getFightno() {
        return fightno;
    }

    public void setFightno(String fightno) {
        this.fightno = fightno;
    }

    public ArrayList<Seat> getSeatslist() {
        return seatslist;
    }

    public void setSeatslist(ArrayList<Seat> seatslist) {
        this.seatslist = seatslist;
    }

    public FlightSchedule getFlightsch() {
        return flightsch;
    }

    public void setFlightsch(FlightSchedule flightsch) {
        this.flightsch = flightsch;
    }
        
}
