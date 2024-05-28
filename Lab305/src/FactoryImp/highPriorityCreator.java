/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryImp;

import FactoryPattern.RequestCreator;
import FactoryPattern.requestProduct;

/**
 *
 * @author Acer pv
 */
public class highPriorityCreator extends RequestCreator{

    @Override
    public requestProduct ProcessRequest() {
        return new highPriorityConcrete();
    }
    
}
