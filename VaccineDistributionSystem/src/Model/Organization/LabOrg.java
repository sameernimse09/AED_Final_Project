/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Role.LabR;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anushkadarade
 */
public class LabOrg extends Organization{

    public LabOrg() {
        super(Type.Lab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LabR());
        return roles;
    }
     
   
    
    
}
