/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Employee.*;
import java.util.Date;

/**
 *
 *@author Brainstormer
 */
public class Patient {
    
    private String patientName;
    private String VaccineName;
    private int medId;
    private Date dob;
    private Date date;
    private static int count = 1;

    public Patient() {
        medId = count;
        count++;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getVaccineName() {
        return VaccineName;
    }

    public void setVaccineName(String VaccineName) {
        this.VaccineName = VaccineName;
    }

    public int getMedId() {
        return medId;
    }

    public void setMedId(int medId) {
        this.medId = medId;
    }

    public Date getDOB() {
        return date;
    }

    public void setDOB(Date dob) {
        this.dob = dob;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
    
    @Override
    public String toString() {
        return patientName;
    }
    
    
}
