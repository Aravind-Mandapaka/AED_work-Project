/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HumanResources;
import java.util.ArrayList;
//import Business.HumanResources.Person;
/**
 *
 * @author aravind
 */
public class PersonDirectory {
    
    private ArrayList<Person> personDirectory;

    public PersonDirectory() {
        personDirectory = new ArrayList<Person>();
        
        
    }

    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    
    
    
    public Person addPerson() {
        Person p = new Person();
        personDirectory.add(p);
        return p;
    }
    
    public void removePerson(Person p) {
        personDirectory.remove(p);
    }
    
    /*public Person searchPerson(int id) {
        //ArrayList<Product> result = new ArrayList<Product>();
        for(Person p : personDirectory) {
            if(p.getModelNumber() == id) {
                return p;
            }
        }
        return null;
    }*/
    
    
}
