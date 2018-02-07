/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterPrice;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aravind
 */
public class CdcEnterprise extends EnterPrise {
//tyep of enterprise which is cdc, its name and getter method of super classs
    public CdcEnterprise(String name) {
         super(name,EnterpriseType.CDC);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
         return null;
    }
    
}
