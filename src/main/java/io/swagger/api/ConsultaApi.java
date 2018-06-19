package io.swagger.api;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;
import io.swagger.model.Autorizador;
import io.swagger.model.Cuenta;
import io.swagger.model.Propias;
import io.swagger.model.PropiasVDetalle;
import io.swagger.model.PropiasVGeneral;
import io.swagger.model.TipoCuenta;

import java.util.ArrayList;
import java.util.List;

import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.json.JsonValue;


@Path("/Consulta")

@Api(description = "the Consulta API")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2017-12-13T21:38:07.777Z")

public class ConsultaApi  {

    @GET
    @Path("/ConsultaAutorizaciones/{numEmpresa}/{idUsuario}/{tipoConsulta}/{tipoOperacion}/{nombreCompleto}")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response consultaAutorizaciones(@PathParam("numEmpresa") Integer numEmpresa,
    		@PathParam("idUsuario") Integer idUsuario,@PathParam("tipoConsulta") Integer tipoConsulta,
    		@PathParam("tipoOperacion") Integer tipoOperacion,@PathParam("nombreCompleto") String nombreCompleto,
    		@HeaderParam("idSesion") String idSesion,@HeaderParam("idSesionH") String idSesionH,
    		@HeaderParam("dispositivo") String dispositivo,@HeaderParam("plataforma") String plataforma,
    		@HeaderParam("nombreUsuario") String nombreUsuario,@HeaderParam("sic") String sic,
    		@HeaderParam("version") String version, @HeaderParam("Authorization") String authorization) {
    	
    	System.out.println("\nidSesion: " + idSesion + "\nidSesionH: " + idSesionH + "\ndispositivo: " + 
        		dispositivo + "\nplataforma: " + plataforma + "\nnombreUsuario: " + nombreUsuario + "\nsic: " + 
        		sic + "\nversion: " + version + "\nnumEmpresa: " + numEmpresa + "\nidUsuario: " + idUsuario + 
        		"\ntipoConsulta: " + tipoConsulta + "\ntipoOperacion: " + tipoOperacion + 
        		"\nnombreCompleto: " + nombreCompleto + "\nAuthorization: " + authorization);
    	
    	JsonObjectBuilder response = Json.createObjectBuilder();
    	response.add("cuentasTercero", JsonValue.NULL)
    		.add("totalCuentaTercero", 0)
    		.add("totalOPI", 0)
    		.add("totalOPI_MN", 0)
    		.add("propias", Json.createArrayBuilder().add(new Propias("4DAA6C8A-E7B4-409B-92DF-82A5642E3976", 
    				new ArrayList<Autorizador>(), 
    				new PropiasVGeneral("Cuentas Propias Test", "2000", "EduardoÑLopez", "21/09/2017", "21/09/2017"),
    				new PropiasVDetalle("0401023637", "", "USD", "", "EduardoÑLopez", "0499232351", "", "2000", "0", 
    						"21/09/2017", "21092017", "Cuentas Propias Test", "", "EduardoÑLopez", "21/09/2017 15:31:08", 
    						"EduardoÑLopez", "21/09/2017 15:32:04", "EnEsperaDeAutorizacion", "Banorte"),
    				true).toJsonObject()))
    		.add("totalPropias", 1)
    		.add("spei", JsonValue.NULL)
    		.add("totalSPEI", 0)
    		.add("tef", JsonValue.NULL)
    		.add("totalTEF", 0)
    		.add("tranTercero", JsonValue.NULL)
    		.add("totalTranTercero", 0)
    		.add("pagoServicios", JsonValue.NULL)
    		.add("totalPagoServicio", 0)
    		.add( "ejecucionExitosa", true)
    		.add("respuestaServicio", "CECE00 Servicio Ejecutado Correctamente")
    		.add("opi_MN", JsonValue.NULL)
    		.add("opi", JsonValue.NULL);

        return Response.ok().header("Authorization", authorization).entity(response.build()).build();
    }

    @GET
    @Path("/credilinea/{numeroCredito}/{numeroCuenta}/{importeComision}/{opcionConsulta}")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response consultaCredilinea(@HeaderParam("session") String session,@PathParam("numeroCredito") Long numeroCredito,@PathParam("numeroCuenta") Long numeroCuenta,@PathParam("importeComision") Double importeComision,@PathParam("opcionConsulta") Long opcionConsulta,@HeaderParam("idSesionH") String idSesionH,@HeaderParam("dispositivo") String dispositivo,@HeaderParam("plataforma") String plataforma,@HeaderParam("nombreUsuario") String nombreUsuario,@HeaderParam("sic") String sic,@HeaderParam("version") String version) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/ConsultaCronologica")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response consultaCronologica() {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/consultaCuentaIndividual")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response consultaCuentaIndividual() {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/consultaMovimientosPorCuenta/{idUser}")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response consultaMovimientosPorCuenta(@PathParam("idUser") Long idUser,@HeaderParam("session") String session,@HeaderParam("idSesionH") String idSesionH,@HeaderParam("account") String account,@HeaderParam("tipoCuenta") Long tipoCuenta,@HeaderParam("dispositivo") String dispositivo,@HeaderParam("plataforma") String plataforma,@HeaderParam("nombreUsuario") String nombreUsuario,@HeaderParam("sic") String sic,@HeaderParam("version") String version) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/consultaSaldos")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response consultaSaldos(@HeaderParam("sesion") String sesion,@HeaderParam("idSesionH") String idSesionH,
    		@HeaderParam("dispositivo") String dispositivo,@HeaderParam("plataforma") String plataforma,
    		@HeaderParam("nombreUsuario") String nombreUsuario,@HeaderParam("sic") String sic,
    		@HeaderParam("version") String version,
    		@HeaderParam("Authorization") String authorization) {
    	
      System.out.println("\nsesion: " + sesion + "\nidSesionH: " + idSesionH + "\ndispositivo: " + 
    		dispositivo + "\nplataforma: " + plataforma + "\nnombreUsuario: " + nombreUsuario + "\nsic: " + 
    		sic + "\nversion: " + version + "\nAuthorization: " + authorization);
      
      JsonObjectBuilder response = Json.createObjectBuilder();
      response.add("consultaExitosa", true)
      	.add("mensajeServicio", "Servicio Ejecutado Con Exito en la demostracion")
      	.add("cuentaCheque", new TipoCuenta(getCuentasCheque(), 766279468265.61, 10999867.66, "" ).toJsonObject()) 
      	.add("crediLinea", new TipoCuenta(null, 0.0, 0.0, "31").toJsonObject())
      	.add("mesaDinero", new TipoCuenta(null, 0.0, 0.0,"30").toJsonObject())
      	.add("cuentaPagare", new TipoCuenta(getCuentasPagare(), 0.0, 0.0,"").toJsonObject())
      	.add("tarjetaCredito",  new TipoCuenta(null, 0.0, 0.0, "40").toJsonObject())
      	.add("saldoTotalMXN", "766279468265.61")
      	.add("saldoTotalUSD", "10999867.66");
      
      return Response.ok().header("Authorization", authorization).entity(response.build()).build();
    }

    @GET
    @Path("/ConsultaTotalAutorizaciones/{numEmpresa}/{idUsuario}/{tipoOperacion}")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response consultaTotalAutorizaciones(@PathParam("numEmpresa") Integer numEmpresa,
    		@PathParam("idUsuario") Integer idUsuario,@PathParam("tipoOperacion") Integer tipoOperacion,
    		@HeaderParam("idSesion") String idSesion,@HeaderParam("idSesionH") String idSesionH,
    		@HeaderParam("dispositivo") String dispositivo,@HeaderParam("plataforma") String plataforma,
    		@HeaderParam("nombreUsuario") String nombreUsuario,@HeaderParam("sic") String sic,
    		@HeaderParam("version") String version, @HeaderParam("Authorization") String authorization) {
    	
    	System.out.println("\nidSesion: " + idSesion + "\nidSesionH: " + idSesionH + "\ndispositivo: " + 
        		dispositivo + "\nplataforma: " + plataforma + "\nnombreUsuario: " + nombreUsuario + "\nsic: " + 
        		sic + "\nversion: " + version + "\nnumEmpresa: " + numEmpresa + "\nidUsuario: " + idUsuario + 
        		"\ntipoOperacion: " + tipoOperacion + "\nAuthorization: " + authorization);
    	
    	JsonObjectBuilder response = Json.createObjectBuilder();
        response.add("success", true)
        	.add("message", "CECT00 Servicio Ejecutado Correctamente")
        	.add("totalAutorizaciones", Json.createObjectBuilder().add("OpiMN_213", 1)
        				.add("TransferenciaTerceros_202", 1)
        				.add("PropiasBanorte_201", 1)
        				.add("SPEI_203", 0)
        				.add("PagoServicios_301", 0)
        				.add("TEF_204", 0)
        				.add("CuentaTerceros_1203", 0)
        				.add("Opi_205", 0));
        
        return Response.ok().header("Authorization", authorization).entity(response.build()).build();
    }

    @GET
    @Path("/ConsultarMovimientosRecurrencia")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response consultarMovimientosRecurrencia() {
    	return Response.ok().entity("magic!").build();
    }
    
    
    /* Sample data*/
    
	private List<Cuenta> getCuentasCheque() {
		List<Cuenta> cuentas = new ArrayList<Cuenta>();
		cuentas.add(new Cuenta("ALTA NOMINAL B6", "0401035162", "9961301929.62", "9961301929.62", "072580004010351620",
				"ALTA NOMINAL B6", "MXP", "10", "010", "Enlace Tradicional", "0311", null, null, null));
		cuentas.add(new Cuenta("ALTA NOMINAL B6", "0803466025", "10035805.41", "10035805.41", "072580008034660254",
				"ALTA NOMINAL B6", "MXP", "10", "010", "Enlace Global", "0391", null, null, null));
		cuentas.add(
				new Cuenta("LOS GANSOS SA", "0499028983", "746321694630.73", "746321694630.73", "072580004990289838",
						"LOS GANSOS SA", "MXP", "10", "010", "Enlace Tradicional", "0311", null, null, null));
		cuentas.add(new Cuenta("ALTA NOMINAL B6", "0401023637", "996195.66", "996195.66", "072580004010236376",
				"ALTA NOMINAL B6", "USD", "10", "010", "Enlace Dólares", "0441", null, null, null));
		cuentas.add(new Cuenta("SAHITH FUENTES PENA", "0499245584", "9983698149.54", "9983698149.54",
				"072180002014933284", "MIGUEL FERNANDO SERVIN CAMPOS", "MXP", "10", "010", "Enlace Tradicional", "0311",
				null, null, null));
		cuentas.add(new Cuenta("Banorte Fácil", "0499249144", "2737750.31", "2737750.31", "", "ROBERTO ALEJO SANCHEZ",
				"MXP", "12", "010", "Banorte Fácil", "0361", null, null, null));
		cuentas.add(new Cuenta("ENLACE DLLS C/INT PM", "0499232351", "10003672.00", "10003672.00", "072580007309881824",
				"ALTA NOMINAL B6", "USD", "10", "010", "Enlace Dólares", "0441", null, null, null));
		return cuentas;
	}
	
	private List<Cuenta> getCuentasPagare() {
		List<Cuenta> cuentas = new ArrayList<Cuenta>();
		cuentas.add(new Cuenta("MATERIAS PRIMAS MORALES", "073099763400001", "null", "0.00", "072580007309881824",
				"MATERIAS PRIMAS MORALES", "MXP", "20", "020", "Pagaré", "0252", null, null, null));
		cuentas.add(new Cuenta("SAHITH FUENTES PENA", "073099987000002", "null", "0.00", "072180002014933284",
				"SAHITH FUENTES PENA", "MXP", "20", "020", "Pagaré", "0251", null, null, null));
		cuentas.add(new Cuenta("Pagaré", "073099987000007", "null", "0.00", "", "Pagaré", "MXP", "20", "020", "Pagaré",
				"0251", null, null, null));
		cuentas.add(new Cuenta("Pagaré", "073099987000008", "null", "0.00", "", "Pagaré", "MXP", "20", "020", "Pagaré",
				"0251", null, null, null));
		return cuentas;
	}

    
}
