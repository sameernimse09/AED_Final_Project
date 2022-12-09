/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Enterprise.Enterprise;

/**
 *
 * @author anushkadarade
 */
public class OrderInventory {
    private int Qty;
    private Enterprise manuEP;

    public Enterprise getManuEP() {
        return manuEP;
    }

    public void setManuEP(Enterprise manuEP) {
        this.manuEP = manuEP;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }
    @Override
    public String toString(){
        return manuEP.getName();
    }
}
