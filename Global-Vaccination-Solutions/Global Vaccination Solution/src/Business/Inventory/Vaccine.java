/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import Business.Employee.*;

/**
 *
 * @author Brainstormer
 */
public class Vaccine {
    
    private String vaccine;
    private int id;
    private int quantity;
    private static int count = 1;

    public Vaccine() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public String getVaccine() {
        return vaccine;
    }

    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return vaccine;
    }
    
    
}
