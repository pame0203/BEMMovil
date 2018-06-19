package io.swagger.api;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/ConsultaSeg")

@Api(description = "the ConsultaSeg API")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2017-12-13T21:38:07.777Z")

public class ConsultaSegApi  {

    @POST
    @Path("/asignarCtasUsuario")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response asignarCtasUsuario(@HeaderParam("Tran_NombrePersona") String tranNombrePersona,@HeaderParam("Tran_NumeroEmpresa") Long tranNumeroEmpresa,@HeaderParam("Tran_IdUsuario") String tranIdUsuario,@HeaderParam("Correo") String correo,@HeaderParam("Estatus") Integer estatus,@HeaderParam("TipoUsuario") String tipoUsuario,@HeaderParam("IdUsuarioModificar") Long idUsuarioModificar,@HeaderParam("TranIdProducto") String tranIdProducto,@HeaderParam("CodigoAut") String codigoAut,@HeaderParam("Cuentas") String cuentas,@HeaderParam("Disponibles") String disponibles,@HeaderParam("TipoAsignadas") String tipoAsignadas,@HeaderParam("TipoDesasignadas") String tipoDesasignadas,@HeaderParam("AsignaFlag") String asignaFlag,@HeaderParam("DesasFlag") String desasFlag,@HeaderParam("sesion") String sesion,@HeaderParam("idSesionH") String idSesionH,@HeaderParam("dispositivo") String dispositivo,@HeaderParam("plataforma") String plataforma,@HeaderParam("nombreUsuario") String nombreUsuario,@HeaderParam("sic") String sic,@HeaderParam("version") String version) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/consultarDatosEmpresa/{Tran_NumeroEmpresa}/{TipoUsuario}/{IdUsuarioPeticion}")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response consultarDatosEmpresa(@PathParam("IdUsuarioPeticion") Long idUsuarioPeticion,@PathParam("TipoUsuario") String tipoUsuario,@PathParam("Tran_NumeroEmpresa") Long tranNumeroEmpresa,@HeaderParam("sesion") String sesion,@HeaderParam("idSesionH") String idSesionH,@HeaderParam("dispositivo") String dispositivo,@HeaderParam("plataforma") String plataforma,@HeaderParam("nombreUsuario") String nombreUsuario,@HeaderParam("sic") String sic,@HeaderParam("version") String version) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/guardarConfigEmpresa")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response guardarConfigEmpresa(@HeaderParam("Tran_NumeroEmpresa") Long tranNumeroEmpresa,@HeaderParam("CodigoAut") String codigoAut,@HeaderParam("habilitarCuentas") String habilitarCuentas,@HeaderParam("notificacionCorreo") String notificacionCorreo,@HeaderParam("sesion") String sesion,@HeaderParam("idSesionH") String idSesionH,@HeaderParam("dispositivo") String dispositivo,@HeaderParam("plataforma") String plataforma,@HeaderParam("nombreUsuario") String nombreUsuario,@HeaderParam("sic") String sic,@HeaderParam("version") String version) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/obtenerCtasEmpUsuario/{Tran_NumeroEmpresa}/{idUsuarioConsulta}/{TranIdProducto}/{IdUsuarioPeticion}")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response obtenerCtasEmpUsuario(@PathParam("Tran_NumeroEmpresa") Long tranNumeroEmpresa,@PathParam("idUsuarioConsulta") Long idUsuarioConsulta,@PathParam("TranIdProducto") String tranIdProducto,@PathParam("IdUsuarioPeticion") Long idUsuarioPeticion,@HeaderParam("sesion") String sesion,@HeaderParam("idSesionH") String idSesionH,@HeaderParam("dispositivo") String dispositivo,@HeaderParam("plataforma") String plataforma,@HeaderParam("nombreUsuario") String nombreUsuario,@HeaderParam("sic") String sic,@HeaderParam("version") String version) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/obtenerUsuarios/{Tran_NumeroEmpresa}/{TipoUsuario}/{IdUsuarioPeticion}")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response obtenerUsuarios(@PathParam("IdUsuarioPeticion") Long idUsuarioPeticion,@PathParam("TipoUsuario") String tipoUsuario,@PathParam("Tran_NumeroEmpresa") Long tranNumeroEmpresa,@HeaderParam("sesion") String sesion,@HeaderParam("idSesionH") String idSesionH,@HeaderParam("dispositivo") String dispositivo,@HeaderParam("plataforma") String plataforma,@HeaderParam("nombreUsuario") String nombreUsuario,@HeaderParam("sic") String sic,@HeaderParam("version") String version) {
    	return Response.ok().entity("magic!").build();
    }
}

