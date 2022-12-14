/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Role.DistributorR;
import Model.Role.DocR;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anushkadarade
 */
public class DistributorOrg extends Organization {
    public ArrayList<PersonOrg> personDirectory;
    
    public ArrayList<VaccineCount> vaccineDirectory;

    public ArrayList<VaccineCount> getVaccineDirectory() {
        return vaccineDirectory;
    }

    public void setVaccineDirectory(ArrayList<VaccineCount> vaccineDirectory) {
        this.vaccineDirectory = vaccineDirectory;
    }

    public ArrayList<PersonOrg> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<PersonOrg> personDirectory) {
        this.personDirectory = personDirectory;
    }
    public DistributorOrg() {
        super(Type.Distribution.getValue());
        this.personDirectory = new ArrayList<PersonOrg>();
        this.vaccineDirectory = new ArrayList<VaccineCount>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DistributorR());
        return roles;
    }
}
