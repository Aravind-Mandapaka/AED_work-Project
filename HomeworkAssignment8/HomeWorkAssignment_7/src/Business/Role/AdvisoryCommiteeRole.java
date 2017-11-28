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
import Userinterface.AdvisoryComiteeRole.AdvisoryComiteeWorkAreaJPanel;
import Userinterface.LabAssistantRole.LabAssistantWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author pruth
 */
public class AdvisoryCommiteeRole extends Role{

    public AdvisoryCommiteeRole() {
        super(Role.RoleType.AdvisoryCommitee.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EnterPrise enterPrise, EcoSystem ecoSystem) {
         return new AdvisoryComiteeWorkAreaJPanel(userProcessContainer, account, organization, ecoSystem);
    }
    
}
