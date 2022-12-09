/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author anushkadarade
 */
public class EcoSys {
    
    private static EcoSys business;
    
    public static EcoSys getInstance(){
        if(business==null){
            business=new EcoSys();  
        }
        return business;
    }
}
