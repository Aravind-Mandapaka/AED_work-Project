/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SystemAdmin;

import java.util.ArrayList;

/**
 *
 * @author aravind
 */
public class UserAccountDirectory {
 
    
    private ArrayList<UserAccount> userAccountDirectory;

    public UserAccountDirectory() {
        
        userAccountDirectory = new ArrayList<UserAccount>();
        
        
    }
    
    
    
    public UserAccount addUserAccount() {
        UserAccount p = new UserAccount();
        userAccountDirectory.add(p);
        return p;
    }
    
    public void removeUserAcoount(UserAccount p) {
        userAccountDirectory.remove(p);
    }
}
