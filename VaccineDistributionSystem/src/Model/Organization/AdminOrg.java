/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Role.AdminR;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anushkadarade
 */
public class AdminOrg extends Organization{

    public AdminOrg() {
        super(Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdminR());
        return roles;
    }
     
}
