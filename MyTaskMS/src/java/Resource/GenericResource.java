/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Resource;

import Models.User.User;
import Util.HibernateUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 * REST Web Service
 *
 * @author mahdiaza
 */
@Path("/rest")
public class GenericResource {
    private final ArrayList<User> users;
    
    
    
    @Context
    private UriInfo context;
    
    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
        this.users = new ArrayList<>();
    }
    
    
    @GET
    @Path("/allusers")
    @Produces(MediaType.APPLICATION_XML)
    public List<User> getAllUsers(){
        return this.users;
    }
    
}
