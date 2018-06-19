package io.swagger.api;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/guardar")

@Api(description = "the guardar API")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2017-12-13T21:38:07.777Z")

public class GuardarApi  {

    @POST
    @Path("/spei")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response guardaSpei(@HeaderParam("nombreBeneficiario") String nombreBeneficiario,@HeaderParam("verificaTerceros") Boolean verificaTerceros,@HeaderParam("descripcion") String descripcion,@HeaderParam("importeOperacion") Float importeOperacion,@HeaderParam("ivaAplicar") Float ivaAplicar,@HeaderParam("numeroReferencia") String numeroReferencia,@HeaderParam("nombreOrdenante") String nombreOrdenante,@HeaderParam("idTipoOperacion") Integer idTipoOperacion,@HeaderParam("fechaAplicacion") String fechaAplicacion,@HeaderParam("cuentaOrigen") String cuentaOrigen,@HeaderParam("enviarEmail") Boolean enviarEmail,@HeaderParam("identificadorPersonalizadoTercero") String identificadorPersonalizadoTercero,@HeaderParam("idGrupoCuentaOrigen") Long idGrupoCuentaOrigen,@HeaderParam("grupoCuentaOrigen") String grupoCuentaOrigen,@HeaderParam("idCuentaTercero") Long idCuentaTercero,@HeaderParam("idCuentaOrigen") Long idCuentaOrigen,@HeaderParam("cuentaDestino") String cuentaDestino,@HeaderParam("idConsecutivo") Long idConsecutivo,@HeaderParam("Tran_IdUsuario") Long tranIdUsuario,@HeaderParam("rfcOrdenante") String rfcOrdenante,@HeaderParam("sesion") String sesion,@HeaderParam("idSesionH") String idSesionH,@HeaderParam("dispositivo") String dispositivo,@HeaderParam("plataforma") String plataforma,@HeaderParam("nombreUsuario") String nombreUsuario,@HeaderParam("sic") String sic,@HeaderParam("version") String version) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/spid")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response guardaSpid(@HeaderParam("nombreBeneficiario") String nombreBeneficiario,@HeaderParam("verificaTerceros") Boolean verificaTerceros,@HeaderParam("descripcion") String descripcion,@HeaderParam("importeOperacion") Float importeOperacion,@HeaderParam("ivaAplicar") Float ivaAplicar,@HeaderParam("numeroReferencia") String numeroReferencia,@HeaderParam("nombreOrdenante") String nombreOrdenante,@HeaderParam("idTipoOperacion") Integer idTipoOperacion,@HeaderParam("fechaAplicacion") String fechaAplicacion,@HeaderParam("cuentaOrigen") String cuentaOrigen,@HeaderParam("enviarEmail") Boolean enviarEmail,@HeaderParam("identificadorPersonalizadoTercero") String identificadorPersonalizadoTercero,@HeaderParam("idGrupoCuentaOrigen") Long idGrupoCuentaOrigen,@HeaderParam("grupoCuentaOrigen") String grupoCuentaOrigen,@HeaderParam("idCuentaTercero") Long idCuentaTercero,@HeaderParam("idCuentaOrigen") Long idCuentaOrigen,@HeaderParam("cuentaDestino") String cuentaDestino,@HeaderParam("idConsecutivo") Long idConsecutivo,@HeaderParam("Tran_IdUsuario") Long tranIdUsuario,@HeaderParam("rfcOrdenante") String rfcOrdenante,@HeaderParam("tipoCuentaBeneficiario") String tipoCuentaBeneficiario,@HeaderParam("sesion") String sesion,@HeaderParam("idSesionH") String idSesionH,@HeaderParam("dispositivo") String dispositivo,@HeaderParam("plataforma") String plataforma,@HeaderParam("nombreUsuario") String nombreUsuario,@HeaderParam("sic") String sic,@HeaderParam("version") String version) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/propias")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response guardarPropias(@HeaderParam("Tran_NombreBeneficiario") String tranNombreBeneficiario,@HeaderParam("Descripcion") String descripcion,@HeaderParam("Tran_ImporteOperacion") Float tranImporteOperacion,@HeaderParam("IvaAplicar") Float ivaAplicar,@HeaderParam("Tran_NumeroReferencia") String tranNumeroReferencia,@HeaderParam("IdTransferencia") String idTransferencia,@HeaderParam("IdGrupoCuentaOrigen") Long idGrupoCuentaOrigen,@HeaderParam("RfcBeneficiario") String rfcBeneficiario,@HeaderParam("GrupoCuentaOrigen") String grupoCuentaOrigen,@HeaderParam("IdGrupoCuentadestino") Long idGrupoCuentadestino,@HeaderParam("GrupoCuentadestino") Long grupoCuentadestino,@HeaderParam("RfcOrdenante") String rfcOrdenante,@HeaderParam("IdCuentaTercero") Long idCuentaTercero,@HeaderParam("Tran_CuentaOrigen") String tranCuentaOrigen,@HeaderParam("Tran_CuentaDestino") String tranCuentaDestino,@HeaderParam("IdConsecutivo") Long idConsecutivo,@HeaderParam("Tran_NombreTitular") String tranNombreTitular,@HeaderParam("EnviarEmail") Boolean enviarEmail,@HeaderParam("FechaAplicacion") String fechaAplicacion,@HeaderParam("Tran_BancoDestino") String tranBancoDestino,@HeaderParam("Tran_IdCuentaOrigen") Long tranIdCuentaOrigen,@HeaderParam("Tran_IdUsuario") Long tranIdUsuario,@HeaderParam("TipoCambio") String tipoCambio,@HeaderParam("sesion") String sesion,@HeaderParam("idSesionH") String idSesionH,@HeaderParam("dispositivo") String dispositivo,@HeaderParam("plataforma") String plataforma,@HeaderParam("nombreUsuario") String nombreUsuario,@HeaderParam("sic") String sic,@HeaderParam("version") String version) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/terceros")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response guardarTerceros(@HeaderParam("VerificaTerceros") String verificaTerceros,@HeaderParam("Descripcion") String descripcion,@HeaderParam("Tran_ImporteOperacion") Float tranImporteOperacion,@HeaderParam("IvaAplicar") Float ivaAplicar,@HeaderParam("Tran_NumeroReferencia") String tranNumeroReferencia,@HeaderParam("IdTransferencia") String idTransferencia,@HeaderParam("FechaAplicacion") String fechaAplicacion,@HeaderParam("Tran_CuentaOrigen") String tranCuentaOrigen,@HeaderParam("RfcBeneficiario") String rfcBeneficiario,@HeaderParam("EnviarEmail") Boolean enviarEmail,@HeaderParam("GrupoCuentaOrigen") String grupoCuentaOrigen,@HeaderParam("RfcOrdenante") String rfcOrdenante,@HeaderParam("IdentificadorPersonalizadoTercero") String identificadorPersonalizadoTercero,@HeaderParam("IdCuentaTercero") Long idCuentaTercero,@HeaderParam("IdGrupoCuentaOrigen") Long idGrupoCuentaOrigen,@HeaderParam("Tran_CuentaDestino") String tranCuentaDestino,@HeaderParam("IdConsecutivo") Long idConsecutivo,@HeaderParam("Tran_NombreTitular") String tranNombreTitular,@HeaderParam("Tran_BancoDestino") String tranBancoDestino,@HeaderParam("GrupoCuentaDestino") String grupoCuentaDestino,@HeaderParam("Tran_IdCuentaOrigen") Long tranIdCuentaOrigen,@HeaderParam("Tran_IdUsuario") Long tranIdUsuario,@HeaderParam("sesion") String sesion,@HeaderParam("idSesionH") String idSesionH,@HeaderParam("dispositivo") String dispositivo,@HeaderParam("plataforma") String plataforma,@HeaderParam("nombreUsuario") String nombreUsuario,@HeaderParam("sic") String sic,@HeaderParam("version") String version) {
    	return Response.ok().entity("magic!").build();
    }
}

