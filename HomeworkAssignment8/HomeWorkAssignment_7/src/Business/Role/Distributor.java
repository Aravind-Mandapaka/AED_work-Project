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
import Userinterface.DistributorRole.DistributorOrganizationWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author pruth
 */
public class Distributor extends Role{

    public Distributor() {
        super(Role.RoleType.Distributor.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EnterPrise enterPrise, EcoSystem ecoSystem) {
        return new DistributorOrganizationWorkAreaJPanel(userProcessContainer,account,organization,ecoSystem);//To change body of generated methods, choose Tools | Templates.
    }
    
}
