/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Role.DocR;
import Model.Role.Role;
import Model.Role.SalesR;
import java.util.ArrayList;

/**
 *
 * @author anushkadarade
 */
public class SaleOrg extends Organization {
    public SaleOrg() {
        super(Type.Sales.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SalesRole());
        return roles;
    }
}
