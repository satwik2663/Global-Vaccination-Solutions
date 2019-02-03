/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Children;

import Business.Patient.*;
import Business.Employee.*;
import java.util.Date;

/**
 *
 * @author Brainstormer
 */
public class Children {

    private int id;
    private String childName;

    private Date dob;
    private Date joinedDate;

    private static int count = 1;

    public Children() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    @Override
    public String toString() {
        return childName;
    }

}
