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
public class Aeroplanelist {
    private ArrayList<Aeroplane> airplanelist;
    
    public Aeroplanelist()
            {
          airplanelist = new ArrayList<Aeroplane>();
            }

    public ArrayList<Aeroplane> getAirplanelist() {
        return airplanelist;
    }

    public void setAirplanelist(ArrayList<Aeroplane> airplanelist) {
        this.airplanelist = airplanelist;
    }

    
public Aeroplane addAeroplanes()
     {
    Aeroplane ap = new Aeroplane();
    airplanelist.add(ap);
    return ap;
        
     }

public void deleteValues(Aeroplane y)
  {
      airplanelist.remove(y);
      
  
  }
    //public void setAirplane(ArrayList<Aeroplane> airplanelist) {
      //  this.airplanelist = airplanelist;
   // }
    
}
