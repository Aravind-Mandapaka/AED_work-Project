/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.NetWork;

import Business.EnterPrise.EnterPriseDirectory;

/**
 *
 * @author aravind
 */
public class NetWork {
    
    private String name;
    private EnterPriseDirectory enterpriseDirectory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterPriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    public NetWork()
    {
        enterpriseDirectory = new EnterPriseDirectory();
    }
    
    @Override
    public String toString()
    {
        return name;  
    }
    
}
