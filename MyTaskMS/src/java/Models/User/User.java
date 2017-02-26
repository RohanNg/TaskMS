/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.User;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mahdiaza
 */

@XmlRootElement
@Entity
public class User implements Serializable {
    private String username;
    private Long userId;
    private UserGroup userGroup;
    
    public User(){
        
    }
    
    public User(String userName){
        this.username = userName;
    }
    
    @XmlElement
    @Id
    @GeneratedValue()
    public Long getUserId(){
        return this.userId;
    }
    
    public void setUserId(Long userId){
        this.userId = userId;
    }
    public void setUserName(String username){
        this.username = username;
    }
    
    @XmlElement
    public String getUserName(){
        return this.username;
    }


    @ManyToOne
    public UserGroup getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(UserGroup userGroup) {
        this.userGroup = userGroup;
    }
}
