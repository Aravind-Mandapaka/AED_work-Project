/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterPrice;
import Business.EnterPrice.EnterPrise.EnterpriseType;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author aravind
 */
public class HospitalEnterprise extends EnterPrise{
    
//hospirta;l enterprose which has enterspise as super class
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
