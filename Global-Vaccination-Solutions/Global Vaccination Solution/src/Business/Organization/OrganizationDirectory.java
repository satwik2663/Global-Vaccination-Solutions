/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Brainstormer
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Staff.getValue())){
            organization = new StaffOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.MedicalRecord.getValue())){
            organization = new MedRecOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.CareTaker.getValue())){
            organization = new CareTakerOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.Delivery.getValue())){
            organization = new DeliveryOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }
}