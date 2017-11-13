/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.EnterPrice.EnterPrise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Userinterface.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author aravind
 */
public class AdminRole extends Role{

    public AdminRole()
    {
        super(RoleType.Admin.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EnterPrise enterPrise, EcoSystem ecoSystem) {
        return new AdminWorkAreaJPanel(userProcessContainer, enterPrise);
    }
    
    
    
    
}
