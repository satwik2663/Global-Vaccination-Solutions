/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *@author Brainstormer
 */
public class DoctorByHosWorkRequest extends WorkRequest{
    
    private Date requestingDate;
    private String doctorName;

    public Date getrequestingDate() {
        return requestingDate;
    }

    public void setrequestingDate(Date requestingDate) {
        this.requestingDate = requestingDate;
    }

    public String getdoctorName() {
        return doctorName;
    }

    public void setdoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    
    
    @Override
    public String toString() {
        return doctorName;
    }
    
}
