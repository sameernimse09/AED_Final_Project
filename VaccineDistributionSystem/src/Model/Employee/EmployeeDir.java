/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Employee;

import java.util.ArrayList;

/**
 *
 * @author Sameer Nimse
 */
public class EmployeeDir {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDir() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
}