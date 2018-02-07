/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.EnterPrise.EnterPrise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author aravind
 */
public abstract class Role {

    String name;

    public enum RoleType {
        Admin("Admin"),
        Doctor("Doctor"),
        LabAssistant("Lab Assistant"),
        AdvisoryCommitee("Advisory Commitee"),
        Director("Director"),
        Distributor("Distributor"),
        InventoryManager("Inventory Manager"),
        Clinic("Clinic"),
        InventoryCdcManager("Inventory Manager"),
        Provider("Provider");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role(String name) {
        this.name = name;
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EnterPrise enterPrise, EcoSystem ecoSystem);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

}
