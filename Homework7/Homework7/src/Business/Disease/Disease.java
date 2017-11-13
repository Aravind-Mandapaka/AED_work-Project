/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Disease;

/**
 *
 * @author aravind
 */
public class Disease {
    
    String diseaseName;
    String diagnosis;
    int vaccineSugg;
    //disease names diagnosis and vacciensuggested and their setters and egtters

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public int getVaccineSugg() {
        return vaccineSugg;
    }

    public void setVaccineSugg(int vaccineSugg) {
        this.vaccineSugg = vaccineSugg;
    }
    
    
    
    
}
