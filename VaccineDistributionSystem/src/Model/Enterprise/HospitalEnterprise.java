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
public class HospitalEnterprise extends Enterprise {
    
    public HospitalEnterprise(String name,Network network){
        super(name,EnterpriseType.Hospital, network);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
