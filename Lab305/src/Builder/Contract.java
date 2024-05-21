/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

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
    void SignContract (Contracts contracts);
}
