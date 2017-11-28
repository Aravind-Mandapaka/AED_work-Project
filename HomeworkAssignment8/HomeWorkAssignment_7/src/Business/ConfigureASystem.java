package Business;

import Business.Disease.Disease;
import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.Vaccine.Vaccine;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author pruth
 */
public class ConfigureASystem {
    
    public static EcoSystem configure() {
        
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee,new SystemAdminRole());
        
        //Diseasecatalog
        try{
        Vaccine v=system.getVaccineCatalog().addVaccine();
        v.setExpiryDate(new SimpleDateFormat("MM/dd/yyyy").parse("05/31/2017"));
        v.setManufacturer("");
        v.setVaccineName("Varicella");
          v.setStockAvalilable(600);
        Disease d=system.getDiseaseCatalog().addDisease();
        d.setDiagnosis("Rashes");
        d.setDiseaseName("ChickenPox");
        d.setVaccineSugg(1);
        
        Vaccine v1=system.getVaccineCatalog().addVaccine();
        v1.setExpiryDate(new SimpleDateFormat("MM/dd/yyyy").parse("12/31/2017"));
        v1.setManufacturer("");
        v1.setVaccineName("Hep A");
        v1.setStockAvalilable(100);
        Disease d1=system.getDiseaseCatalog().addDisease();
        d1.setDiagnosis("Illness");
        d1.setDiseaseName("Hepatitis");
        d1.setVaccineSugg(2);
        
        Vaccine v2=system.getVaccineCatalog().addVaccine();
        v2.setExpiryDate(new SimpleDateFormat("MM/dd/yyyy").parse("12/25/2017"));
        v2.setManufacturer("");
        v2.setVaccineName("MMR");
        v2.setStockAvalilable(500);
        Disease d2=system.getDiseaseCatalog().addDisease();
        d2.setDiagnosis("Red Eyes");
        d2.setDiseaseName("Measles");
        d2.setVaccineSugg(3);
        }catch(ParseException e){
            System.out.println("Exception occurred");
        }
        return system;
    
    }
    
}
