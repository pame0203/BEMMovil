package io.swagger.api;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/Token")

@Api(description = "the Token API")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2017-12-13T21:38:07.777Z")

public class TokenApi  {

    @GET
    @Path("/resincronizar/{userID}/{serialNumber}/{firstToken}/{secondToken}")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response resincronizarToken(@PathParam("userID") String userID,@PathParam("serialNumber") String serialNumber,@PathParam("firstToken") String firstToken,@PathParam("secondToken") String secondToken) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/resincronizar")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response resincronizarTokenPost(@HeaderParam("userID") String userID,@HeaderParam("serialNumber") String serialNumber,@HeaderParam("firstToken") String firstToken,@HeaderParam("secondToken") String secondToken) {
    	return Response.ok().entity("magic!").build();
    }
}

