package io.swagger.api;

import io.swagger.model.Usuario;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/Acceso")

@Api(description = "the Acceso API")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2017-12-13T21:38:07.777Z")

public class AccesoApi  {

    @POST
    @Path("/autenticarUsuario")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Usuario.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Usuario.class) })
    public Response autenticarUsuario(@HeaderParam("username") String username,@HeaderParam("password") String password,@HeaderParam("dispositivo") String dispositivo,@HeaderParam("plataforma") String plataforma,@HeaderParam("idSesionH") String idSesionH,@HeaderParam("sic") String sic,@HeaderParam("version") String version) {
    	return Response.ok().entity("magic!").build();
    }

//    @GET
//    @Path("/validarReto/{idSesion}/{idSesionH}")
//    @Consumes({ "*/*" })
//    @Produces({ "application/json" })
//    @ApiOperation(value = "", notes = "", response = Object.class, tags={  })
//    @ApiResponses(value = { 
//        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
//    public Response validarReto(@HeaderParam("idSesion") String idSesion,@HeaderParam("idSesionH") String idSesionH,@HeaderParam("dispositivo") String dispositivo,@HeaderParam("plataforma") String plataforma,@HeaderParam("nombreUsuario") String nombreUsuario,@HeaderParam("sic") String sic,@HeaderParam("version") String version) {
//    	return Response.ok().entity("magic!").build();
//    }

    @GET
    @Path("/verificarUsuario/{username}")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response verificarUsuario(@PathParam("username") String username,@HeaderParam("dispositivo") String dispositivo,@HeaderParam("plataforma") String plataforma,@HeaderParam("sic") String sic,@HeaderParam("version") String version) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/verificarUsuario")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response verificarUsuarioPost(@HeaderParam("username") String username,@HeaderParam("dispositivo") String dispositivo,@HeaderParam("plataforma") String plataforma,@HeaderParam("sic") String sic,@HeaderParam("version") String version) {
    	return Response.ok().entity("magic!").build();
    }
}

