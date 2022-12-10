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
import Model.Organization.DistributorOrg;
import Model.UserAccount.UserAccount;
import MainInterface.DistributionRole.NDistirbutionWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Sameer Nimse
 */
public class DistributorR extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSys business) {
        return new NDistirbutionWorkAreaJPanel(userProcessContainer, account, (DistributorOrg)organization, enterprise, business);
    }

    

}
