/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Children;

import Business.Patient.*;
import Business.Employee.*;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 *@author Brainstormer
 */
public class ChildrenDirectory {
    
    private ArrayList<Children> childList;

    public ChildrenDirectory() {
        childList = new ArrayList();
    }

    public ArrayList<Children> getChildList() {
        return childList;
    }
    
    public Children addChild(String name, Date dob, Date joinDate){
        Children child = new Children();
        child.setChildName(name);
        child.setDob(dob);        
        child.setJoinedDate(joinDate);
        childList.add(child);
        return child;
    }
}