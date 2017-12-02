/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.EnterPrise.EnterPrise;
import Business.Organization.Organization;
import Business.Organization.ProviderOrganization;
import Business.UserAccount.UserAccount;
import Userinterface.LabAssistantRole.ProcessWorkRequestJPanel;
import Userinterface.ProviderRole.ProviderWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author aravind
 */
public class ProviderRole extends Role {

    public ProviderRole() {
        super(Role.RoleType.Provider.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EnterPrise enterPrise, EcoSystem ecoSystem) {
         return new ProviderWorkAreaJPanel(userProcessContainer, (ProviderOrganization)organization, enterPrise, account,ecoSystem);
    }
    
}
