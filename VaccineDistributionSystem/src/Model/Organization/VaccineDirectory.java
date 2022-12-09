/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import java.util.ArrayList;

/**
 *
 * @author anushkadarade
 */
public class VaccineDirectory {
    private ArrayList<VaccineDetails> vaccineDirectory;
    
    public VaccineDirectory(){
        this.vaccineDirectory = new ArrayList<VaccineDetails>();
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
