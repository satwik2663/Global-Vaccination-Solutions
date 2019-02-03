/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import java.util.ArrayList;

/**
 *
 * @author Brainstormer
 */
public class VaccineDirectory {
    
    private ArrayList<Vaccine> vaccineList;

    public VaccineDirectory() {
        vaccineList = new ArrayList();
    }

    public ArrayList<Vaccine> getVaccineList() {
        return vaccineList;
    }
    
    public Vaccine addVaccine(String name, Integer qty){
        Vaccine vaccine = new Vaccine();
        vaccine.setVaccine(name);
        vaccine.setQuantity(qty);
        vaccineList.add(vaccine);
        return vaccine;
    }
    
    public void removeVaccine(Vaccine vaccine){
        vaccineList.remove(vaccine);
    }
}