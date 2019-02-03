/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author Brainstormer
 */
public class EventsByHosForOrphaWorkRequest extends WorkRequest{
    
    private Date visitingDate1;
    private Date visitingDate2;
    private Date visitingDate3;
    private Date selectedDate;
private String hospitalVisiting;
    public Date getSelectedDate() {
        return selectedDate;
    }

    public void setSelectedDate(Date selectedDate) {
        this.selectedDate = selectedDate;
    }

    public String getHospitalVisiting() {
        return hospitalVisiting;
    }

    public void setHospitalVisiting(String hospitalVisiting) {
        this.hospitalVisiting = hospitalVisiting;
    }
    
    
    
    private String eventName;
    private String purpose;
    private int eventid;
    private String orphanageName;

    public Date getVisitingDate1() {
        return visitingDate1;
    }

    public void setVisitingDate1(Date visitingDate1) {
        this.visitingDate1 = visitingDate1;
    }

    public Date getVisitingDate2() {
        return visitingDate2;
    }

    public void setVisitingDate2(Date visitingDate2) {
        this.visitingDate2 = visitingDate2;
    }

    public Date getVisitingDate3() {
        return visitingDate3;
    }

    public void setVisitingDate3(Date visitingDate3) {
        this.visitingDate3 = visitingDate3;
    }

    
    
    
    public String getOrphanageName() {
        return orphanageName;
    }

    public void setOrphanageName(String orphanageName) {
        this.orphanageName = orphanageName;
    }
    

   
    
    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

  

    public String geteventName() {
        return eventName;
    }

    public void seteventName(String eventName) {
        this.eventName = eventName;
    }
    
    
    @Override
    public String toString() {
        return eventName;
    }

    public int getEventid() {
        return eventid;
    }

    /**
     * @param eventid the eventid to set
     */
    public void setEventid(int eventid) {
        this.eventid = eventid;
    }
    
}
