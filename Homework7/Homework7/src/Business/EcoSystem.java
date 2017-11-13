/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Disease.DiseaseCatalog;
import Business.NetWork.NetWork;
import Business.Organization.Organization; 
import Business.Role.AdminRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Vaccine.VaccineCatalog;
import java.util.ArrayList;
/**
 *
 * @author aravind
 */
public class EcoSystem extends Organization{

    
    private static EcoSystem business;
    private ArrayList<NetWork> networkList;
    private DiseaseCatalog diseaseCatalog;
    private VaccineCatalog vaccineCatalog;
    public static EcoSystem getInstance()
    {
        if(business == null)
        {
            business = new EcoSystem();
        }
        return business;
    }

    public DiseaseCatalog getDiseaseCatalog() {
        return diseaseCatalog;
    }

    public void setDiseaseCatalog(DiseaseCatalog diseaseCatalog) {
        this.diseaseCatalog = diseaseCatalog;
    }

    public VaccineCatalog getVaccineCatalog() {
        return vaccineCatalog;
    }

    public void setVaccineCatalog(VaccineCatalog vaccineCatalog) {
        this.vaccineCatalog = vaccineCatalog;
    }

    public ArrayList<NetWork> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<NetWork> networkList) {
        this.networkList = networkList;
    }
    
    public NetWork createAndAddNetwork(){
        NetWork network = new NetWork();
        networkList.add(network);
        return network;
        
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList =new ArrayList();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
 private EcoSystem()
 {
     super(null);
     networkList = new ArrayList();
     diseaseCatalog = new DiseaseCatalog();
     vaccineCatalog =new VaccineCatalog();
 }
    
    
}
