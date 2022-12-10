/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Role.DocR;
import Model.Role.HealthR;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anushkadarade
 */
public class HealthOrg extends Organization {
    public HealthOrg() {
        super(Type.Health.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HealthR());
        return roles;
    }
}
