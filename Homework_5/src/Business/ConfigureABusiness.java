/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

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
        p.setFirstName("Ann");
        p.setLastName("Wells");
        p.setAge(23);
        p.setAddress("Boston");

         Person p1 = pd.addPerson(); // create a second person object 
        p1.setFirstName("John");
        p1.setLastName("Adam");
        p1.setAge(25);
        p1.setAddress("Dubai");
        
        Person p2 = pd.addPerson();
        p2.setFirstName("Aravind");
        p2.setLastName("mandapaka");
        p2.setAddress("Hyderabad");
        p2.setAge(23);
        

        UserAccountDirectory uad= b.getUserAccountDirectory(); // prepare to create user accounts
        
        Person p3 = pd.searchPerson("Wells"); 
        
        if (p3!=null)
        {
        UserAccount ua = uad.addUserAccount();
        ua.setPerson(p3); //link user account to the Mr. Brown ua.setUserId(“jadam”);
        ua.setUserName("Awells");
        ua.setRole("System Admin");
        ua.setPassword("password");
        ua.setStatus("Active");
        }
        
        
         Person p4 = pd.searchPerson("Mandapaka"); 
        
        if (p4!=null)
        {
        UserAccount ua = uad.addUserAccount();
        ua.setPerson(p4); //link user account to the Mr. Brown ua.setUserId(“jadam”);
        ua.setUserName("amandapaka");
        ua.setRole("Human Resource");
        ua.setPassword("apassword");
        ua.setStatus("Active");
        }
        
        
        
        Person p5 = pd.searchPerson("Adam"); 
        
        if (p5!=null)
        {
        UserAccount ua = uad.addUserAccount();
        ua.setPerson(p5); //link user account to the Mr. Brown ua.setUserId(“jadam”);
        ua.setUserName("Adama");
        ua.setRole("Human Resource");
        ua.setPassword("password3");
        ua.setStatus("Active");
        }
        
        
        return b;
    }
}