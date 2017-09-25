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
    private ArrayList<Aeroplane> airplane;
    
    public Aeroplanelist()
            {
          airplane = new ArrayList<Aeroplane>();
            }

    public ArrayList<Aeroplane> getAirplane() {
        return airplane;
    }
public Aeroplane addAeroplanes()
     {
    Aeroplane ap = new Aeroplane();
    Aeroplanelist.add(ap);
    return ap;
    
            
            
            
     }
    public void setAirplane(ArrayList<Aeroplane> airplane) {
        this.airplane = airplane;
    }
    
}
