/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Acer pv
 */
public class Contracts {
    private int Id;
    private int PropertyId;
    private int TenantId;
    private double RentalAmount;

    public Contracts(int Id, int PropertyId, int TenantId, double RentalAmount) {
        this.Id = Id;
        this.PropertyId = PropertyId;
        this.TenantId = TenantId;
        this.RentalAmount = RentalAmount;
    }
    public Contracts(Contracts cont){
        this.Id = cont.Id;
        this.PropertyId = cont.PropertyId;
        this.TenantId = cont.TenantId;
        this.RentalAmount = cont.RentalAmount;
    }
}
