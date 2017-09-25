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
public class Flights {
    private int manfactureyear;
    private String modelno;
    private int serialno;
    private int noofseats;

    public int getManfactureyear() {
        return manfactureyear;
    }

    public void setManfactureyear(int manfactureyear) {
        this.manfactureyear = manfactureyear;
    }

    public String getModelno() {
        return modelno;
    }

    public void setModelno(String modelno) {
        this.modelno = modelno;
    }

    public int getSerialno() {
        return serialno;
    }

    public void setSerialno(int serialno) {
        this.serialno = serialno;
    }

    public int getNoofseats() {
        return noofseats;
    }

    public void setNoofseats(int noofseats) {
        this.noofseats = noofseats;
    }
}
