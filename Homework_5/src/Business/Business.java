/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.HumanResources.PersonDirectory;
import Business.SystemAdmin.UserAccountDirectory;

/**
 *
 * @author aravind
 */
public class Business {
 
    private PersonDirectory personDirectory;
    private UserAccountDirectory userAccountDirectory;

    

    public Business(String n) {
         personDirectory= new PersonDirectory();
        userAccountDirectory = new UserAccountDirectory();
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    
    
}
