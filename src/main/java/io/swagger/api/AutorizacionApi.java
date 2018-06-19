package io.swagger.api;


import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.json.JsonValue;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/Autorizacion")

@Api(description = "the Autorizacion API")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2017-12-13T21:38:07.777Z")

public class AutorizacionApi  {

    @POST
    @Path("/AltaCuenta")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response altaCuenta(@HeaderParam("codigoAutorizacion") String codigoAutorizacion,@HeaderParam("idCuentaTerceros") Long idCuentaTerceros,@HeaderParam("idSesion") String idSesion,@HeaderParam("idTerceros") Long idTerceros,@HeaderParam("idTipoOperacion") String idTipoOperacion,@HeaderParam("idTransferenciaComp") Long idTransferenciaComp,@HeaderParam("idUsuario") String idUsuario,@HeaderParam("nombreEjecutor") String nombreEjecutor,@HeaderParam("dispositivo") String dispositivo,@HeaderParam("plataforma") String plataforma,@HeaderParam("idSesionH") String idSesionH,@HeaderParam("sic") String sic,@HeaderParam("version") String version) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/PagoServicios")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response pagoServicios(@HeaderParam("idTransferencia") String idTransferencia,@HeaderParam("idSesion") String idSesion,@HeaderParam("idSesionH") String idSesionH,@HeaderParam("password") String password,@HeaderParam("idUsuario") String idUsuario,@HeaderParam("nombreUsuario") String nombreUsuario,@HeaderParam("dispositivo") String dispositivo,@HeaderParam("plataforma") String plataforma,@HeaderParam("sic") String sic,@HeaderParam("version") String version) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/TransferenciaPOOM")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response transferenciaPOOM(@HeaderParam("idTransferencia") String idTransferencia,
    		@HeaderParam("tipoOperacion") String tipoOperacion,@HeaderParam("idSesion") String idSesion,
    		@HeaderParam("idSesionH") String idSesionH,@HeaderParam("password") String password,
    		@HeaderParam("idUsuario") String idUsuario,@HeaderParam("nombreUsuario") String nombreUsuario,
    		@HeaderParam("dispositivo") String dispositivo,@HeaderParam("plataforma") String plataforma,
    		@HeaderParam("sic") String sic,@HeaderParam("version") String version,
    		@HeaderParam("Authorization") String authorization) {
    	
    	System.out.println("\nidSesion: " + idSesion + "\nidSesionH: " + idSesionH + "\ndispositivo: " + 
        		dispositivo + "\nplataforma: " + plataforma + "\nnombreUsuario: " + nombreUsuario + "\nsic: " + 
        		sic + "\nversion: " + version + "\nnidTransferencia: " + idTransferencia + "\nidUsuario: " + idUsuario + 
        		"\ntipoOperacion: " + tipoOperacion + "\ntipoOperacion: " + tipoOperacion + 
        		"\npassword: " + password + "\nAuthorization: " + authorization);
    	
    	JsonObjectBuilder response = Json.createObjectBuilder();
    	response.add("success", true)
    		.add("message", "Ok Operación efectuada")
    		.add("claveRastreo", "950")
    		.add("transaccionExitosa", true);

        return Response.ok().header("Authorization", authorization).entity(response.build()).build();
    	
    }

    @POST
    @Path("/TransferenciaSSTT")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response transferenciaSSTT(@HeaderParam("idTransferencia") String idTransferencia,
    		@HeaderParam("tipoOperacion") String tipoOperacion,@HeaderParam("idSesion") String idSesion,
    		@HeaderParam("idSesionH") String idSesionH,@HeaderParam("password") String password,
    		@HeaderParam("idUsuario") String idUsuario,@HeaderParam("nombreUsuario") String nombreUsuario,
    		@HeaderParam("dispositivo") String dispositivo,@HeaderParam("plataforma") String plataforma,
    		@HeaderParam("sic") String sic,@HeaderParam("version") String version,
    		@HeaderParam("Authorization") String authorization) {
    	
    	System.out.println("\nidSesion: " + idSesion + "\nidSesionH: " + idSesionH + "\ndispositivo: " + 
        		dispositivo + "\nplataforma: " + plataforma + "\nnombreUsuario: " + nombreUsuario + "\nsic: " + 
        		sic + "\nversion: " + version + "\nnidTransferencia: " + idTransferencia + "\nidUsuario: " + idUsuario + 
        		"\ntipoOperacion: " + tipoOperacion + "\ntipoOperacion: " + tipoOperacion + 
        		 "\nAuthorization: " + authorization);
    	
    	JsonObjectBuilder response = Json.createObjectBuilder();
    	response.add("success", true)
    		.add("message", "Ok Operación efectuada")
    		.add("claveRastreo", "")
    		.add("transaccionExitosa", true);

        return Response.ok().header("Authorization", authorization).entity(response.build()).build();
 	
    }
}

