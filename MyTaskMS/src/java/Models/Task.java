/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Models.User.User;
import Models.User.UserGroup;

/**
 *
 * @author mahdiaza
 */

public class Task {
    private UserGroup sender;
    private User reciever;
    
    public Task(){        
    }
    
    public void setSender(UserGroup sender){
        this.sender = sender;
    }
    
    public UserGroup getSender(){
        return this.sender;
    }
    
    public void setReciever(User reciever){
        this.reciever = reciever;
    }
    
    public User getReciever(){
        return this.reciever;
    }
    
}
