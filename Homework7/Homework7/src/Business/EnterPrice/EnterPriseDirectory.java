/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterPrice;

import java.util.ArrayList;
import Business.EnterPrice.EnterPrise;

/**
 *
 * @author aravind
 */
public class EnterPriseDirectory {
    
    private ArrayList<EnterPrise> enterpriseList;
//arraylist of enterprise
    public ArrayList<EnterPrise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<EnterPrise> EnterpriseList) {
        this.enterpriseList = EnterpriseList;
    }
    
    public EnterPriseDirectory()
    {
        enterpriseList = new ArrayList();
        
    }
    
    public EnterPrise createAndAddEnterPrise(String name, EnterPrise.EnterpriseType type)
    {
        EnterPrise enterprise = null;
        if(type == EnterPrise.EnterpriseType.Hospital)
        {
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
         if(type == EnterPrise.EnterpriseType.PHD)
        {
            enterprise = new PhdEnterprise(name);
            enterpriseList.add(enterprise);
        }
         if(type == EnterPrise.EnterpriseType.CDC)
        {
            enterprise = new CdcEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
    
}
