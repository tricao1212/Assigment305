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
public class highPriorityConcrete implements requestProduct{
     private String priority;
    private String expireDay;
    private String status;
    
    @Override
    public void setPriority() {
        this.priority = "Emergency";
    }

    @Override
    public void setExpire() {
        LocalDate currentDate = LocalDate.now();
        this.expireDay = currentDate.toString();
    }

    @Override
    public void setStatus() {
        this.status = "Accept";
    }

    @Override
    public void processRequest() {
        System.out.println("Emergency request, our Administer will contact you immediately !");
    }
}
