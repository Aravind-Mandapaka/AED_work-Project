/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.EnterPrice.EnterPrise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Userinterface.DoctorRole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author aravind
 */
public class DoctorRole extends Role{
    
     public DoctorRole()
    {
        super(RoleType.Doctor.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EnterPrise enterPrise, EcoSystem ecoSystem) {
         return new DoctorWorkAreaJPanel(userProcessContainer, account, (DoctorOrganization)organization, enterPrise);
    }

  
    
}
