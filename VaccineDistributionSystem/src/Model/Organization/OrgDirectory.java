/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author anushkadarade
 */
public class OrgDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrgDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DocOrg();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Person.getValue())){
            organization = new PersonOrg();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Pharma.getValue())){
            organization = new PharmaOrg();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrg();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Manufacturing.getValue())){
            organization = new ManufacturingOrg();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Sales.getValue())){
            organization = new SaleOrg();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Purchase.getValue())){
            organization = new OrderOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Health.getValue())){
            organization = new HealthOrg();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Economy.getValue())){
            organization = new EcoOrg();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Distribution.getValue())){
            organization = new DistributorOrg();
            organizationList.add(organization);
        }
        return organization;
    }
}