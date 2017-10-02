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
public class Aeroplane {
      String airport;
    String modelNumber;
    String manufacturer;
    int year;
private ArrayList<Flight> flightlist;

    public ArrayList<Flight> getFlightlist() {
        return flightlist;
    }

    public void setFlightlist(ArrayList<Flight> flightlist) {
        this.flightlist = flightlist;
    }

public Aeroplane()
{
      //ArrayList<Flight> fl = new ArrayList<Flight>();
      
flightlist = new ArrayList<Flight>();
}
 public Flight addflight()
 {
     Flight ft = new Flight();
     flightlist.add(ft);
     return ft;
     
 }       

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
