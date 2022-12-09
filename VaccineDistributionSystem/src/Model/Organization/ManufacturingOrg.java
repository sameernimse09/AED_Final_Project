/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Role.DocR;
import Model.Role.ManufacturingR;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anushkadarade
 */
public class ManufacturingOrg extends Organization{

    
    private ArrayList<VaccineDetails> vaccineDirectory;
    
    public ManufacturingOrg() {
        super(Type.Manufacturing.getValue());
        this.vaccineDirectory = new ArrayList<VaccineDetails>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ManufacturingRole());
        return roles;
    }
     
    public ArrayList<VaccineDetails> getVaccineDirectory() {
        return vaccineDirectory;
    }

    public void setVaccineDirectory(ArrayList<VaccineDetails> vaccineDirectory) {
        this.vaccineDirectory = vaccineDirectory;
    }
    
    public VaccineDetails addVaccine(VaccineDetails vaccine){
        this.vaccineDirectory.add(vaccine);
        return vaccine;
    }
    
    public void updateVaccine(VaccineDetails vaccine){
        int index = vaccineDirectory.indexOf(vaccine);
        vaccineDirectory.set(index, vaccine);
    }
    
    public void deleteVaccine(VaccineDetails vaccine){
        vaccineDirectory.remove(vaccine);
    }
}