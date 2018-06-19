package io.swagger.api;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/eliminar")

@Api(description = "the eliminar API")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2017-12-13T21:38:07.777Z")

public class EliminarApi  {

    @DELETE
    @Path("/{idTipoOperacion}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response guardarPropias(@PathParam("idTipoOperacion") Integer idTipoOperacion,@HeaderParam("idUsuario") Long idUsuario,@HeaderParam("idTransferencia") String idTransferencia,@HeaderParam("sesion") String sesion,@HeaderParam("idSesionH") String idSesionH,@HeaderParam("dispositivo") String dispositivo,@HeaderParam("plataforma") String plataforma,@HeaderParam("nombreUsuario") String nombreUsuario,@HeaderParam("sic") String sic,@HeaderParam("version") String version) {
    	return Response.ok().entity("magic!").build();
    }
}

