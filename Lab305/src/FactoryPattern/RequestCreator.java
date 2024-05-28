/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryPattern;

/**
 *
 * @author Acer pv
 */
public abstract class RequestCreator {
    public requestProduct CreateRequest(){
        requestProduct res = ProcessRequest();
        res.processRequest();
        return res;
    }
    
    public abstract requestProduct ProcessRequest();
}
