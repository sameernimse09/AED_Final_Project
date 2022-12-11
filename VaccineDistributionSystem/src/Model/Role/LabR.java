/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Role;

import Model.EcoSys;
import Model.Enterprise.Enterprise;
import Model.Network.Network;
import Model.Organization.Organization;
import Model.Organization.LabOrg;
import Model.UserAccount.UserAccount;
import MainInterface.LabRole.LabJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Sameer Nimse
 */
public class LabR extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSys business) {
        return new LabJPanel(userProcessContainer, account, (LabOrg)organization, enterprise, business);
    }

    

}