/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.WorkQueue;

import Model.Organization.VaccineDetails;
import Model.UserAccount.UserAccount;

/**
 *
 * @author anushkadarade
 */
public class approvedVaccine extends WorkReq{
    
    private String testResult;
    
    private VaccineDetails vaccine;
    
    private UserAccount sales;

    public UserAccount getSales() {
        return sales;
    }

    public void setSales(UserAccount sales) {
        this.sales = sales;
    }

    public VaccineDetails getVaccine() {
        return vaccine;
    }

    public void setVaccine(VaccineDetails vaccine) {
        this.vaccine = vaccine;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    

}
