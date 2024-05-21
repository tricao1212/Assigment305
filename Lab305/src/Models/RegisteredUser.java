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
public class RegisteredUser {
    private List<User> listOfUser;
    
    public RegisteredUser(User user){
        listOfUser.add(user);
    }

    public List<User> getListOfUser() {
        return listOfUser;
    }
    
    public void removeUser(User user){
        listOfUser.remove(user);
        System.out.println("Delete successful");
    }
}
