package com.example;

import io.swagger.annotations.Api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Api
@Path("myresource")
public class MyResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Wrapper<Doodad> getIt() {
        Doodad d = new Doodad(1, "My First Doodad");
        return(new Wrapper<Doodad>(d, "foobar"));
    }
}
