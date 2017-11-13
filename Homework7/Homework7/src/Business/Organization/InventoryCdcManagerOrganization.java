/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.InventoryCdcManager;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aravind
 */
public class InventoryCdcManagerOrganization extends Organization {

    public InventoryCdcManagerOrganization() {
        super(Type.InvenCdcCheckManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new InventoryCdcManager());
        return roles;
    }
    
}
