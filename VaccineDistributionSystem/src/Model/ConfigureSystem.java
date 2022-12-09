package Model;

import Model.Employee.Employee;
import Model.Role.SystemAdminR;
import Model.UserAccount.UserAccount;

/**
 *
 * @author anushkadarade
 */
public class ConfigureSystem {
    
    public static EcoSys configure(){
        
        EcoSys system = EcoSys.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminR());
        
        return system;
    }
    
}
