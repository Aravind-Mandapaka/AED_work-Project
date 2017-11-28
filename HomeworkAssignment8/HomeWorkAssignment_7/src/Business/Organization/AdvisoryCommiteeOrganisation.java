/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdvisoryCommiteeRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author pruth
 */
public class AdvisoryCommiteeOrganisation extends Organization {

    public AdvisoryCommiteeOrganisation() {
        super(Organization.Type.AdCommitee.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
     ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdvisoryCommiteeRole());
        return roles;
    }
    
}
