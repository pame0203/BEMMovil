package io.swagger.api;

import java.util.Map;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/resource")

@Api(description = "the resource API")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2017-12-13T21:38:07.777Z")

public class ResourceApi  {

//    @GET
//    @Path("/protected")
//    @Consumes({ "*/*" })
//    @Produces({ "text/plain" })
//    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
//        @Authorization(value = "oauth2", scopes = {
//            @AuthorizationScope(scope = "myCustomScope", description = "")
//        })
//    }, tags={  })
//    @ApiResponses(value = {
//        @ApiResponse(code = 200, message = "successful operation", response = String.class) })
//    public Response customScopeProtected() {
//    	return Response.ok().entity("magic!").build();
//    }
//
//    @POST
//    @Path("/{path}")
//    @Consumes({ "*/*" })
//    @Produces({ "application/json" })
//    @ApiOperation(value = "", notes = "", response = String.class, responseContainer = "Map", authorizations = {
//        @Authorization(value = "oauth2", scopes = {
//            @AuthorizationScope(scope = "DEFAULT_SCOPE", description = "")
//        })
//    }, tags={  })
//    @ApiResponses(value = {
//        @ApiResponse(code = 200, message = "successful operation", response = String.class, responseContainer = "Map") })
//    public Response enterInfo(@PathParam("path") String path,@HeaderParam("Header") String header,@FormParam("form")  String form) {
//    	return Response.ok().entity("magic!").build();
//    }
//
//    @GET
//    @Path("/prop")
//    @Consumes({ "*/*" })
//    @Produces({ "text/plain" })
//    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
//        @Authorization(value = "oauth2", scopes = {
//            @AuthorizationScope(scope = "DEFAULT_SCOPE", description = "")
//        })
//    }, tags={  })
//    @ApiResponses(value = {
//        @ApiResponse(code = 200, message = "successful operation", response = void.class) })
//    public Response getPropertyValue(@QueryParam("propertyName") String propertyName) {
//    	return Response.ok().entity("magic!").build();
//    }
//
//    @GET
//
//    @Consumes({ "*/*" })
//    @Produces({ "text/plain" })
//    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
//        @Authorization(value = "oauth2", scopes = {
//            @AuthorizationScope(scope = "DEFAULT_SCOPE", description = "")
//        })
//    }, tags={  })
//    @ApiResponses(value = {
//        @ApiResponse(code = 200, message = "successful operation", response = String.class) })
//    public Response getResourceData() {
//    	return Response.ok().entity("magic!").build();
//    }
//
//    @GET
//    @Path("/greet")
//    @Consumes({ "*/*" })
//    @Produces({ "text/plain" })
//    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
//        @Authorization(value = "oauth2", scopes = {
//            @AuthorizationScope(scope = "DEFAULT_SCOPE", description = "")
//        })
//    }, tags={  })
//    @ApiResponses(value = {
//        @ApiResponse(code = 200, message = "successful operation", response = String.class) })
//    public Response helloUser(@QueryParam("name") String name) {
//    	return Response.ok().entity("magic!").build();
//    }
//
//    @GET
//    @Path("/unprotected")
//    @Consumes({ "*/*" })
//    @Produces({ "text/plain" })
//    @ApiOperation(value = "", notes = "", response = String.class, tags={  })
//    @ApiResponses(value = {
//        @ApiResponse(code = 200, message = "successful operation", response = String.class) })
//    public Response unprotected() {
//    	return Response.ok().entity("magic!").build();
//    }
}
