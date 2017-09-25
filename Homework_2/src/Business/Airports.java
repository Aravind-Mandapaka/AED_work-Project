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
public class Airports {
    private String aiportzname;

    public String getAiportname() {
        return aiportname;
    }

    public void setAiportname(String aiportname) {
        this.aiportname = aiportname;
    }
   private ArrayList<Airlines>listofairlines; 
   private ArrayList<Flights>listofflights;
    public ArrayList<Airlines> getListofairlines() {
        return listofairlines;
    }

    public ArrayList<Flights> getListofflights() {
        return listofflights;
    }

    public void setListofflights(ArrayList<Flights> listofflights) {
        this.listofflights = listofflights;
    }

    public void setListofairlines(ArrayList<Airlines> listofairlines) {
        this.listofairlines = listofairlines;
    }
    
}
