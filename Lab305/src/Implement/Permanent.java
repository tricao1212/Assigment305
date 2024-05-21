/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implement;

import Builder.Contract;
import Models.Contracts;

/**
 *
 * @author Acer pv
 */
public class Permanent implements Contract{
    private int ContractId;
    private double RentAmount;
    private int TenantId;
    private int PropertyId;

    @Override
    public void BuildContractId(int contractId) {
        this.ContractId = contractId;
    }

    @Override
    public void BuildPropertyId(int propertyId) {
        this.PropertyId = propertyId;
    }

    @Override
    public void BuildTenantId(int tenantId) {
        this.TenantId = tenantId;
    }

    @Override
    public void BuildRentalAmount(double amount) {
        this.RentAmount = amount;
    }

   @Override
    public Contracts SignContract() {
        return new Contracts(ContractId, PropertyId, TenantId, RentAmount);
    }
    
}
