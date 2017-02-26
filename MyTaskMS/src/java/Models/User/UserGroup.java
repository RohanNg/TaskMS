/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.User;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mahdiaza
 */
public class UserGroup {
    private List<User> users;
    private String groupName;
    
    public UserGroup(){
        this.users = new ArrayList<>();
    }
    
    public void setGroupName(String groupName){
        this.groupName = groupName;
    }
    
    public String getGroupName(){
        return this.groupName;
    }
    
   
}
