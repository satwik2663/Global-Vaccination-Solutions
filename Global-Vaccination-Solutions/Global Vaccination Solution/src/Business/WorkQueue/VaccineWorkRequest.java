/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 *@author Brainstormer
 */
public class VaccineWorkRequest extends WorkRequest{
    
    private int vaccineQuantity;
    private String vaccineName;

    public int getvaccineQuantity() {
        return vaccineQuantity;
    }

    public void setvaccineQuantity(int vaccineQuantity) {
        this.vaccineQuantity = vaccineQuantity;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }
    
    
    @Override
    public String toString() {
        return vaccineName;
    }
    
}
