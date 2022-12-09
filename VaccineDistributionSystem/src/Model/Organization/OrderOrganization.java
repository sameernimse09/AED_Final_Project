/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Role.DocR;
import Model.Role.OrderR;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anushkadarade
 */
public class OrderOrganization extends Organization {
    
    private ArrayList<PurchaseInventory> purchaseDirectory;

    public ArrayList<PurchaseInventory> getPurchaseDirectory() {
        return purchaseDirectory;
    }

    public void setPurchaseDirectory(ArrayList<PurchaseInventory> purchaseDirectory) {
        this.purchaseDirectory = purchaseDirectory;
    }
    
    
     public OrderOrganization() {
        super(Type.Purchase.getValue());
        this.purchaseDirectory = new ArrayList<PurchaseInventory>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PurchaseRole());
        return roles;
    }
    public PurchaseInventory addPI(PurchaseInventory pi){
        
        this.purchaseDirectory.add(pi);
        return pi;
    }
    
    public void updateVaccine(PurchaseInventory pi){
        int index = purchaseDirectory.indexOf(pi);
        purchaseDirectory.set(index, pi);
    }
    
    public void deleteVaccine(PurchaseInventory pi){
        purchaseDirectory.remove(pi);
    }
}
