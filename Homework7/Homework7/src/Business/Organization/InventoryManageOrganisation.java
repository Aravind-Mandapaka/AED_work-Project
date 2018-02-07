/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.InventoryManager;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aravind
 */
public class InventoryManageOrganisation extends Organization {

    public InventoryManageOrganisation() {
        super(Organization.Type.InvenManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
        roles.add(new InventoryManager());
        return roles;
    }
    
}
