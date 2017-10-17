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
 
    
    private ArrayList<UserAccount> userAccountDirectorylist;

    public UserAccountDirectory() {
        
        userAccountDirectorylist = new ArrayList<UserAccount>();
        
        
    }

    public ArrayList<UserAccount> getUserAccountDirectorylist() {
        return userAccountDirectorylist;
    }

    public UserAccount addUserAccount() {
        UserAccount p = new UserAccount();
        userAccountDirectorylist.add(p);
        return p;
    }
    
    public void removeUserAcoount(UserAccount p) {
        userAccountDirectorylist.remove(p);
    }
    public UserAccount checkvalidUser(String username, String password)
    {
    for(UserAccount ua: userAccountDirectorylist)
    {
      if(ua.getUserName().equals(username)&& ua.getPassword().equals(password))
      {
      return ua;
      }
    }
    return null;
    }
    
}
