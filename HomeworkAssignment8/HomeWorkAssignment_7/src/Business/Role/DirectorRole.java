/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.EnterPrise.EnterPrise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Userinterface.DirectorOrganisation.DirectorOrganisationWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author aravind
 */
public class DirectorRole extends Role {

    public DirectorRole() {
        super(Role.RoleType.Director.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EnterPrise enterPrise, EcoSystem ecoSystem) {
         return new DirectorOrganisationWorkAreaJPanel(userProcessContainer, ecoSystem,account, organization);
    }
    
}
