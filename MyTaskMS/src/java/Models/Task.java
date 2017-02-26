/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Models.User.User;
import Models.User.UserGroup;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author mahdiaza
 */

@Entity
public class Task implements Serializable {
    private UserGroup sender;
    private User reciever;
    private Long taskId;
    
    public Task(){        
    }
    
    @Id
    @GeneratedValue
    public Long getTaskId(){
        return this.taskId;
    }
    
    public void setTaskId(Long taskId){
        this.taskId = taskId;
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
