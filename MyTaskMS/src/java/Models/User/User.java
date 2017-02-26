/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.User;

/**
 *
 * @author mahdiaza
 */
public class User {
    private String username;
    
    public User(){
        
    }
    
    public void setUserName(String username){
        this.username = username;
    }
    
    public String getUserName(){
        return this.username;
    }
}
