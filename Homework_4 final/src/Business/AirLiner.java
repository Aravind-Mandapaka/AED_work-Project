/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author aravind
 */
public class AirLiner {
    private String airLinerName;
    private Fleet fleet;

    public AirLiner(){
        this.fleet=new Fleet();
    }
    public String getAirLinerName() {
        return airLinerName;
    }

    public void setAirLinerName(String airLinerName) {
        this.airLinerName = airLinerName;
    }

    public Fleet getFleet() {
        return fleet;
    }

    public void setFleet(Fleet fleet) {
        this.fleet = fleet;
    }

    @Override
    public String toString() {
        return this.airLinerName;
    }
    
}
