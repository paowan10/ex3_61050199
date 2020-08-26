/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customermailapplication;

/**
 *
 * @author Beer
 */
public class CustomerFactory {
    public static Customer createCutomer(int type){
        if (type==1) return new RegularCustomer();
        else if (type==2) return new MountainCustomer();
        else if (type==3) return new DelinquentCustomer();
        return null;
        
        
    }
    
}
