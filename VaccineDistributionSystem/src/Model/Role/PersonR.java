/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Role;

import Model.EcoSys;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.Organization.PersonOrg;
import Model.UserAccount.UserAccount;
import javax.swing.JPanel;
import MainInterface.PersonRole.PersonAreaJPanel;

/**
 *
 * @author Sameer Nimse
 */
public class PersonR extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSys business) {
        return new PersonAreaJPanel(userProcessContainer, account, (PersonOrg)organization, enterprise, business);
    }
    
}
