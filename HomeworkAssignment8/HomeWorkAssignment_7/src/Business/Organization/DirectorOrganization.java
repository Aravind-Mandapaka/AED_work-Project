/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DirectorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author pruth
 */
public class DirectorOrganization extends Organization{

    public DirectorOrganization() {
        super(Organization.Type.Director.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DirectorRole());
        return roles;
    }
    
}
