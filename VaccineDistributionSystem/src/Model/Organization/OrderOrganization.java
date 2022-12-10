/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Role.DocR;
import Model.Role.PurchaseR;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anushkadarade
 */
public class OrderOrganization extends Organization {
    
    private ArrayList<OrderInventory> purchaseDirectory;

    public ArrayList<OrderInventory> getPurchaseDirectory() {
        return purchaseDirectory;
    }

    public void setPurchaseDirectory(ArrayList<OrderInventory> purchaseDirectory) {
        this.purchaseDirectory = purchaseDirectory;
    }
    
    
     public OrderOrganization() {
        super(Type.Purchase.getValue());
        this.purchaseDirectory = new ArrayList<OrderInventory>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PurchaseR());
        return roles;
    }
    public OrderInventory addPI(OrderInventory pi){
        
        this.purchaseDirectory.add(pi);
        return pi;
    }
    
    public void updateVaccine(OrderInventory pi){
        int index = purchaseDirectory.indexOf(pi);
        purchaseDirectory.set(index, pi);
    }
    
    public void deleteVaccine(OrderInventory pi){
        purchaseDirectory.remove(pi);
    }
}
