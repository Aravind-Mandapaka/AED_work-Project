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
     ArrayList<Aeroplane> aeroplanelist;
    
    public Fleet()
    {
   aeroplanelist = new ArrayList<Aeroplane>();
        //Fleet f = new Fleet();
    
    }
 public Aeroplane addaeroplane()
 {
 Aeroplane ap = new Aeroplane();
 aeroplanelist.add(ap);
 return ap;
 
 }

    public ArrayList<Aeroplane> getAeroplanelist() {
        return aeroplanelist;
    }

    public void setAeroplanelist(ArrayList<Aeroplane> aeroplanelist) {
        this.aeroplanelist = aeroplanelist;
    }
    
}
