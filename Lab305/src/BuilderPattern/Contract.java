/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuilderPattern;

import Models.Contracts;

/**
 *
 * @author Acer pv
 */
public interface Contract {
    void BuildContractId(int contractId);
    void BuildPropertyId(int propertyId);
    void BuildTenantId(int tenantId);
    void BuildRentalAmount(double amount);
    Contracts SignContract();
}
