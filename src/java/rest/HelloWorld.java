package rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yyy
 */
@Path("/helloworld")
public class HelloWorld {
    @GET
    public String sayHello (@QueryParam("name")String myName){
       return "Hello " + myName; 
    }
}
