/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Acer pv
 */
public class Property {
    private int PropertyId;
    private String Description;
    private int PropertyOwnerId;

    public Property(int PropertyId, String Description, int PropertyOwnerId) {
        this.PropertyId = PropertyId;
        this.Description = Description;
        this.PropertyOwnerId = PropertyOwnerId;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getPropertyOwnerId() {
        return PropertyOwnerId;
    }

    public void setPropertyOwnerId(int PropertyOwnerId) {
        this.PropertyOwnerId = PropertyOwnerId;
    }
    
    
}
