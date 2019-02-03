/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Brainstormer
 */
public class DeliveryWorkRequest extends WorkRequest {
    
    private int vaccineQuantity;
    private String vaccineName;
    private String destinationNetwork;

    public int getVaccineQuantity() {
        return vaccineQuantity;
    }

    public void setVaccineQuantity(int vaccineQuantity) {
        this.vaccineQuantity = vaccineQuantity;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getDestinationNetwork() {
        return destinationNetwork;
    }

    public void setDestinationNetwork(String destinationNetwork) {
        this.destinationNetwork = destinationNetwork;
    }
    
    @Override
    public String toString() {
        return vaccineName;
    }
}
