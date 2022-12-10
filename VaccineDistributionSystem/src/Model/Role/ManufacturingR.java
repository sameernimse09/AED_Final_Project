/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Role;

import Model.EcoSys;
import Model.Enterprise.Enterprise;
import Model.Network.Network;
import Model.Organization.LabOrg;
import Model.Organization.Organization;
import Model.Organization.ManufacturingOrg;
import Model.UserAccount.UserAccount;
import MainInterface.ManufacturingRole.ManufacturingWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Sameer Nimse
 */
public class ManufacturingR extends Role{
    
    
//JPanel userProcessContainer, EcoSystem ecoSystem, UserAccount account, Network network, ManufacturingOrganization organization, Enterprise enterprise

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSys business) {
       return new ManufacturingWorkAreaJPanel(userProcessContainer, account, (ManufacturingOrg)organization, enterprise, business);
    }

}
