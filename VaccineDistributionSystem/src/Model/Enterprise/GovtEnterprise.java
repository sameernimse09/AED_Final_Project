/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Enterprise;

import Business.Network.Network;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sameer Nimse
 */
public class GovtEnterprise extends Enterprise {
    public GovtEnterprise(String name, Network network){
        super(name,EnterpriseType.Government, network);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
