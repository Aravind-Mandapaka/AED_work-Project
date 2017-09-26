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
public class Aeroplane {
    private int serialNumber;
    private int yearofManufacture;
    private int noofseats;
    private String modelno;
 
    private String airlinename;
  
    private String manufacturerName;
    private String availableStatus;
    private String maintanenceStatus;
    private String airportName;

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getYearofManufacture() {
        return yearofManufacture;
    }

    public void setYearofManufacture(int yearofManufacture) {
        this.yearofManufacture = yearofManufacture;
    }

    public int getNoofseats() {
        return noofseats;
    }

    public void setNoofseats(int noofseats) {
        this.noofseats = noofseats;
    }

    public String getModelno() {
        return modelno;
    }

    public void setModelno(String modelno) {
        this.modelno = modelno;
    }

    public String getAirlinename() {
        return airlinename;
    }

    public void setAirlinename(String airlinename) {
        this.airlinename = airlinename;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getAvailableStatus() {
        return availableStatus;
    }

    public void setAvailableStatus(String availableStatus) {
        this.availableStatus = availableStatus;
    }

    public String getMaintanenceStatus() {
        return maintanenceStatus;
    }

    public void setMaintanenceStatus(String maintanenceStatus) {
        this.maintanenceStatus = maintanenceStatus;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }
    @Override
    public String toString()
    {
       String x = String.valueOf(serialNumber);
       return x;
        
    }

    
}
