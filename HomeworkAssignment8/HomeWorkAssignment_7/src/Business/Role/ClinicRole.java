/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.EnterPrise.EnterPrise;
import Userinterface.ClinicRole.ClinicWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author aravind
 */
public class ClinicRole extends Role {
    public ClinicRole()
    {
        super(Role.RoleType.Clinic.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EnterPrise enterprise, EcoSystem ecoSystem) {
         return new ClinicWorkAreaJPanel(userProcessContainer, account,organization, enterprise);
    }
    
}
