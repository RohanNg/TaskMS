/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Models.User;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mahdiaza
 */

@XmlRootElement
@Entity
public class UserGroup implements Serializable {
    private List<User> users = new ArrayList<>();
    private String groupName;
    private Long groupId;
    private UserGroup parent;
    private List<UserGroup> children;
    
    public UserGroup(){
        
    }
    
    public UserGroup(String groupName){
        
        this.groupName = groupName;
    }
    
    @XmlElement
    @Id
    @GeneratedValue()
    @Column(name="groupId")
    public Long getGroupId(){
        return this.groupId;
    }
    
    public void setGroupId(Long groupId){
        this.groupId = groupId;
    }
    
    public void setGroupName(String groupName){
        this.groupName = groupName;
    }
    
    @XmlElement
    public String getGroupName(){
        return this.groupName;
    }
    
    public void setUsers(List<User> users){
        this.users = users;
    }
    
    @OneToMany(targetEntity= User.class, fetch = FetchType.EAGER, cascade= CascadeType.ALL)
    public List<User> getUsers(){
        return this.users;
    }
    
    public void addUser(User user){
        //user.setUserGroup(this);
        this.users.add(user);
        
    }
    
    public void setParent(UserGroup parent){
        this.parent = parent;
    }
    
    @ManyToOne(cascade = CascadeType.ALL)
    public UserGroup getParent(){
        return this.parent;
    }
    
    public void setChildren(List<UserGroup> children){
        this.children = children;
    }
    
    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    public List<UserGroup> getChildren(){
        return this.children;
    }
}
