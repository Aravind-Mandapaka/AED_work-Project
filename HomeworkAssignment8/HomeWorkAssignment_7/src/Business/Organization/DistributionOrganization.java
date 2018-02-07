/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DirectorRole;
import Business.Role.Distributor;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aravind
 */
public class DistributionOrganization extends Organization{

    public DistributionOrganization() {
        super(Organization.Type.DistriManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
        roles.add(new Distributor());
        return roles;
    }
    
}
