/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author anushkadarade
 */
public class WorkQueue {
    
    private ArrayList<WorkReq> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkReq> getWorkRequestList() {
        return workRequestList;
    }
}