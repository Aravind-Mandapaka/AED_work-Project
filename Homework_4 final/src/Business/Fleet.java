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
public class Fleet {

    private ArrayList<AirPlane> airPlanesList;

    public Fleet() {
        this.airPlanesList = new ArrayList<AirPlane>();
    }

    public ArrayList<AirPlane> getAirPlanesList() {
        return airPlanesList;
    }

    public void setAirPlanesList(ArrayList<AirPlane> airPlanesList) {
        this.airPlanesList = airPlanesList;
    }
    
    public AirPlane addAirPlane(){
        AirPlane airplane=new AirPlane();
        airPlanesList.add(airplane);
        return airplane;
    }
}
