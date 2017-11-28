/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vaccine;

import java.util.Date;

/**
 *
 * @author pruth
 */
public class Vaccine {
    int vaccineId=0;
    static int count =0;
    String vaccineName;
    String manufacturer;
    int stockAvalilable=0;
    Date ExpiryDate;
    
    public Vaccine()
    {
      vaccineId = ++count;   
    }
    
    
    
    public int getStockAvalilable() {
        return stockAvalilable;
    }

    public void setStockAvalilable(int stockAvalilable) {
        this.stockAvalilable = stockAvalilable;
    }
    
    public  int getVaccineId() {
        return vaccineId;
    }

    public  void setVaccineId(int vaccineId) {
        this.vaccineId = vaccineId;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Date getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(Date ExpiryDate) {
        this.ExpiryDate = ExpiryDate;
    }
    
}
