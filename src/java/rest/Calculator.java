/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import javax.ws.rs.GET;
import javax.ws.rs.HEAD;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author yyy
 */
@Path("/calculator")
@Produces(MediaType.APPLICATION_JSON)

public class Calculator {
    Gson gson = new Gson();
    
    @GET
    @Path("/addition")
    public Response addition (@QueryParam("firstOperand")int firstOperand, @QueryParam("secondOperand") int secondOperand){
        MathematicalOperation mo = new MathematicalOperation(firstOperand, secondOperand, firstOperand + secondOperand);
        return Response.status(200).entity(gson.toJson(mo)).build();
    }
    
    
    @POST
    @Path("/subtraction")
    public Response subtraction (@QueryParam("firstOperand")int firstOperand, @QueryParam("secondOperand") int secondOperand){
        MathematicalOperation mo = new MathematicalOperation(firstOperand, secondOperand, firstOperand - secondOperand);
        return Response.status(200).entity(gson.toJson(mo)).build();
    }
    
    @GET
    @Path("/multiply/{firstOperand}/{secondOperand}")
    public Response  multiply (@PathParam("firstOperand") int firstOperand, @PathParam("secondOperand") int secondOperand){
        MathematicalOperation mo = new MathematicalOperation(firstOperand, secondOperand, firstOperand * secondOperand);
        return Response.status(200).entity(gson.toJson(mo)).build();
   }
}
