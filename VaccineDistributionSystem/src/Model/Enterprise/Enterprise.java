 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Enterprise;

import Model.Network.Network;
import Model.Organization.Organization;
import Model.Organization.OrgDirectory;

/**
 *
 * @author anushkadarade
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrgDirectory organizationDirectory;
    private Network network;

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public OrgDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    
    public enum EnterpriseType{
        Hospital("Hospital") , Service("Service") , Pharmaceutical("Pharmaceutical") , Government("Government");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type, Network network){
        super(name);
        this.enterpriseType=type;
        this.network = network;
        organizationDirectory=new OrgDirectory();
    }
}
