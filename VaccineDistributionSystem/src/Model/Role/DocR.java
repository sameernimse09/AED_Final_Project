/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Role;

import Model.EcoSys;
import Model.Enterprise.Enterprise;
import Model.Network.Network;
import Model.Organization.DocOrg;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import MainInterface.DocR.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Sameer Nimse
 */
public class DocR extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSys business) {
        return new DoctorWorkAreaJPanel(userProcessContainer, account, (DocOrg)organization, enterprise, business);
    }

    
    
    
}
