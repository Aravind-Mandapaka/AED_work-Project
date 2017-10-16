/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BusinessConfiguration;

import Business.Business;
import Business.HumanResources.Person;
import Business.HumanResources.PersonDirectory;
import Business.SystemAdmin.UserAccount;
import Business.SystemAdmin.UserAccountDirectory;

/**
 *
 * @author aravind
 */
public class ConfigureABusiness {
    
    
    
    
    public static Business Initialize (String n) { // returns a business object 
        Business b = new Business(n);
        PersonDirectory pd = b.getPersonDirectory();
        Person p = pd.addPerson(); //create person object
        p.setFirstName(“Ann”);
        p.setLastName(“Wells”);

        Person p1 = pd.addPerson(); // create a second person object 
        p1.setFirstName(“John”);
        p1.setLastName(“Adam”);

        UserAccountDirectory uad= b.getUserAccountDirectory(); // prepare to create user accounts
        Person p2 = pd.findPersonByLastName(“Brown”); 
        
        If (p2!=null)
        {
        UserAccount ua = uad.addUserAccount();
        ua.setPerson(p2); //link user account to the Mr. Brown ua.setUserId(“jadam”);
        ua.setPassWard(“pw”);
        ua.setRole(“System Admin”)
        }
    }
}