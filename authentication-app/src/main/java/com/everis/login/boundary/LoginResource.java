package com.everis.login.boundary;

import com.everis.security.boundary.BasicAuthentication;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("login")
@BasicAuthentication
public class LoginResource {
    @GET
    public Response Login(){
        return Response.status(Response.Status.OK).build();
    }

    @DELETE
    public Response Logout(){
        return Response.status(Response.Status.OK).build();
    }
}
