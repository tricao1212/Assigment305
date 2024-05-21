/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.List;

/**
 *
 * @author Acer pv
 */
public class Tenant {
    private User user;
    private List<Contracts> contracts;

    public Tenant(User user, List<Contracts> contracts) {
        this.user = user;
        this.contracts = contracts;
    }
    
    public void requestCreateRentalContract(){
        
    }
    
    public void requestTerminateRentalContract(){
        
    }
}
