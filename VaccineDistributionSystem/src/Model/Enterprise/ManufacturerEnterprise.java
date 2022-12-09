/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Enterprise;

import Model.Network.Network;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sameer Nimse
 */
public class ManufacturerEnterprise extends Enterprise {
    public ManufacturerEnterprise(String name,Network network){
        super(name,EnterpriseType.Pharmaceutical, network);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
