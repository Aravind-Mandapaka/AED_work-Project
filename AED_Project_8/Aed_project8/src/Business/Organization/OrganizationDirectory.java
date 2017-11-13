/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author aravind
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.AdCommitee.getValue())){
            organization = new AdvisoryCommiteeOrganisation();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Director.getValue())){
            organization = new DirectorOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.DistriManager.getValue())){
            organization = new DistributionOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.InvenCdcCheckManager.getValue())){
            organization = new InventoryCdcManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.InvenManager.getValue())){
            organization = new InventoryManageOrganisation();
            organizationList.add(organization);
        }
//        else if (type.getValue().equals(Type.Officer.getValue())){
//            organization = new ();
//            organizationList.add(organization);
//        }
          else if (type.getValue().equals(Type.Providers.getValue())){
            organization = new ProviderOrganization();
            organizationList.add(organization);
        }
//          else if (type.getValue().equals(Type.VaccineDistri.getValue())){
//            organization = new vacci();
//            organizationList.add(organization);
//        }
        
        
        
        return organization;
    }
}