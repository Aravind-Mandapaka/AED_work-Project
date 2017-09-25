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
public class AirplaneManufacturer {
    private String manufacturerName;
    private ArrayList<Flights> listofflights;

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public ArrayList<Flights> getListofflights() {
        return listofflights;
    }

    public void setListofflights(ArrayList<Flights> listofflights) {
        this.listofflights = listofflights;
    }
    
    
}
