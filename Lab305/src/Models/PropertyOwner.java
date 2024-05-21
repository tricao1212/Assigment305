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
public class PropertyOwner {
    private User user;
    private List<Property> listOfProperties;

    public PropertyOwner(User user, List<Property> listOfProperties) {
        this.user = user;
        this.listOfProperties = listOfProperties;
    }

    public List<Property> getListOfProperties() {
        return listOfProperties;
    }

    public void addProperty(Property property) {
        this.listOfProperties.add(property);
    }
    
    public void deleteProperty(Property property){
        this.listOfProperties.remove(property);
    }
    
}
