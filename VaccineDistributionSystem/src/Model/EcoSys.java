/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Network.Network;
import Model.Organization.Organization;
import Model.Role.Role;
import Model.Role.SystemAdminR;
import java.util.ArrayList;

/**
 *
 * @author anushkadarade
 */
public class EcoSys extends Organization{
    
    private static EcoSys business;
    private ArrayList<Network> networkList;
    public static EcoSys getInstance(){
        if(business==null){
            business=new EcoSys();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminR());
        return roleList;
    }
    private EcoSys(){
        super(null);
        networkList=new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
}
