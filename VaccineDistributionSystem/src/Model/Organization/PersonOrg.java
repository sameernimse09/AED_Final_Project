/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Role.PersonR;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anushkadarade
 */
public class PersonOrg extends Organization{

    public PersonOrg() {
        super(Type.Person.getValue());
    }
    private String hospitalName;
    private String appointmentDate;

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PersonR());
        return roles;
    }
    
    
}
