/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Employee.*;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Brainstormer
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientList;

    public PatientDirectory() {
        patientList = new ArrayList();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }
    
    public Patient createPatient(String name, Date dob, String vacName, Date vacDate){
        Patient patient = new Patient();
        patient.setPatientName(name);
        patient.setDOB(dob);
        patient.setVaccineName(vacName);
        patient.setDate(vacDate);
        patientList.add(patient);
        return patient;
    }
}