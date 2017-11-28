/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Disease;

import java.util.ArrayList;

/**
 *
 * @author pruth
 */
public class DiseaseCatalog {
    ArrayList<Disease> diseaseList;
    
    public DiseaseCatalog()
    {
            diseaseList =new ArrayList<Disease>();
    }

    public ArrayList<Disease> getDiseaseList() {
        return diseaseList;
    }

    public void setDiseaseList(ArrayList<Disease> diseaseList) {
        this.diseaseList = diseaseList;
    }
    
    public Disease addDisease()
    {
        Disease d = new Disease();
        diseaseList.add(d);
        return d;
    }
    
}
