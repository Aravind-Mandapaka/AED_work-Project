/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterPrise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aravind
 */
public class PhdEnterprise extends EnterPrise {

    public PhdEnterprise(String name) {
        super(name, EnterpriseType.PHD);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
