/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.EcoSystem;
import Business.EnterPrise.EnterPrise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Userinterface.LabAssistantRole.LabAssistantWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author aravind
 */
public class LabAssistantRole extends Role {
    
    
     public LabAssistantRole()
    {
        super(RoleType.LabAssistant.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EnterPrise enterPrise, EcoSystem ecoSystem) {
       return new LabAssistantWorkAreaJPanel(userProcessContainer, account, organization, ecoSystem);
    }

}
