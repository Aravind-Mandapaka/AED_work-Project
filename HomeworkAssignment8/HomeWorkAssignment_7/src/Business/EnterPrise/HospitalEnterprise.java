/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterPrise;
import Business.EnterPrise.EnterPrise.EnterpriseType;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author aravind
 */
public class HospitalEnterprise extends EnterPrise{
    

public HospitalEnterprise(String name)
{
    super(name,EnterpriseType.Hospital);
}
@Override
public ArrayList<Role> getSupportedRole()
{
    return null;
}


}
