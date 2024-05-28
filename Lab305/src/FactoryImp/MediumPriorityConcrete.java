/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryImp;

import FactoryPattern.requestProduct;
import java.time.LocalDate;

/**
 *
 * @author Acer pv
 */
public class MediumPriorityConcrete implements requestProduct{
     private String priority;
    private String expireDay;
    private String status;
    
    @Override
    public void setPriority() {
        this.priority = "Medium";
    }

    @Override
    public void setExpire() {
        LocalDate currentDate = LocalDate.now();
        currentDate.plusMonths(1);
        this.expireDay = currentDate.toString();
    }

    @Override
    public void setStatus() {
        this.status = "Accepted";
    }

    @Override
    public void processRequest() {
        System.out.println("Request accept, estimated completion date is "+this.expireDay);
    }
}
