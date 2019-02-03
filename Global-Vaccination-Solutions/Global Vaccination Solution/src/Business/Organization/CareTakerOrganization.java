/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CareTakerRole;
import Business.Role.Role;
import java.util.ArrayList;



/**
 *
 * @author Brainstormer
 */
public class CareTakerOrganization extends Organization{

    public CareTakerOrganization() {
        super(Organization.Type.CareTaker.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CareTakerRole());
        return roles;
    }
     
   
    
    
}
