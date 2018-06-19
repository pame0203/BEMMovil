package io.swagger.model;

import io.swagger.model.AutorizadorType;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class ConsultaAutorizacionesOpiMNType   {
  
  private Long tranIdCuentaDestino = null;
  private Long tranIdCuentaOrigen = null;
  private Long tranNumeroEmpresa = null;
  private Long idEstatusRegistro = null;
  private Long idPerfil = null;
  private Long idServicio = null;
  private Long idTipoIngreso = null;
  private Long idUsuarioCancela = null;
  private Long idUsuarioCaptura = null;
  private Long idUsuarioCoejecuta = null;
  private Long idUsuarioEjecuta = null;
  private String tranBancoDestino = null;
  private Float iva = null;
  private Boolean comisionAplicada = false;
  private Float comisionEsquemaCobro = null;
  private Float tranImporteComision = null;
  private Float tranImporteIvaComision = null;
  private Float comisionTarifa = null;
  private String tranCuentaDestino = null;
  private String tranCuentaOrigen = null;
  private String aliasCuentaOrigen = null;
  private String descripcion = null;
  private String divisaDestino = null;
  private String divisaOrigen = null;
  private Boolean enviarEmail = false;
  private String estatusRegistro = null;
  private javax.xml.datatype.XMLGregorianCalendar tranFechaAplicacion = null;
  private javax.xml.datatype.XMLGregorianCalendar tranFechaCancelacion = null;
  private javax.xml.datatype.XMLGregorianCalendar fechaEjecucion = null;
  private javax.xml.datatype.XMLGregorianCalendar fechaCoejecucion = null;
  private javax.xml.datatype.XMLGregorianCalendar tranFechaCreacion = null;
  private String idTransferencia = null;
  private Float tranImporteTotal = null;
  private String tranNombreBeneficiario = null;
  private Long numeroIndice = null;
  private Long numeroSubLote = null;
  private String tranNumeroReferencia = null;
  private String usuarioCancela = null;
  private String usuarioCaptura = null;
  private String usuarioCoejecuta = null;
  private String usuarioEjecuta = null;
  private String claveConfirmacion01 = null;
  private String claveConfirmacion02 = null;
  private String claveNBxI = null;
  private Long numeroLote = null;
  private String numeroTarea = null;
  private String codigo = null;
  private Boolean exitoso = false;
  private String identificadorTercero = null;
  private Long tranIdUsuario = null;
  private List<AutorizadorType> autorizadores = new ArrayList<AutorizadorType>();

  /**
   **/
  public ConsultaAutorizacionesOpiMNType tranIdCuentaDestino(Long tranIdCuentaDestino) {
    this.tranIdCuentaDestino = tranIdCuentaDestino;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getTranIdCuentaDestino() {
    return tranIdCuentaDestino;
  }
  public void setTranIdCuentaDestino(Long tranIdCuentaDestino) {
    this.tranIdCuentaDestino = tranIdCuentaDestino;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType tranIdCuentaOrigen(Long tranIdCuentaOrigen) {
    this.tranIdCuentaOrigen = tranIdCuentaOrigen;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getTranIdCuentaOrigen() {
    return tranIdCuentaOrigen;
  }
  public void setTranIdCuentaOrigen(Long tranIdCuentaOrigen) {
    this.tranIdCuentaOrigen = tranIdCuentaOrigen;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType tranNumeroEmpresa(Long tranNumeroEmpresa) {
    this.tranNumeroEmpresa = tranNumeroEmpresa;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getTranNumeroEmpresa() {
    return tranNumeroEmpresa;
  }
  public void setTranNumeroEmpresa(Long tranNumeroEmpresa) {
    this.tranNumeroEmpresa = tranNumeroEmpresa;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType idEstatusRegistro(Long idEstatusRegistro) {
    this.idEstatusRegistro = idEstatusRegistro;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getIdEstatusRegistro() {
    return idEstatusRegistro;
  }
  public void setIdEstatusRegistro(Long idEstatusRegistro) {
    this.idEstatusRegistro = idEstatusRegistro;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType idPerfil(Long idPerfil) {
    this.idPerfil = idPerfil;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getIdPerfil() {
    return idPerfil;
  }
  public void setIdPerfil(Long idPerfil) {
    this.idPerfil = idPerfil;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType idServicio(Long idServicio) {
    this.idServicio = idServicio;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getIdServicio() {
    return idServicio;
  }
  public void setIdServicio(Long idServicio) {
    this.idServicio = idServicio;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType idTipoIngreso(Long idTipoIngreso) {
    this.idTipoIngreso = idTipoIngreso;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getIdTipoIngreso() {
    return idTipoIngreso;
  }
  public void setIdTipoIngreso(Long idTipoIngreso) {
    this.idTipoIngreso = idTipoIngreso;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType idUsuarioCancela(Long idUsuarioCancela) {
    this.idUsuarioCancela = idUsuarioCancela;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getIdUsuarioCancela() {
    return idUsuarioCancela;
  }
  public void setIdUsuarioCancela(Long idUsuarioCancela) {
    this.idUsuarioCancela = idUsuarioCancela;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType idUsuarioCaptura(Long idUsuarioCaptura) {
    this.idUsuarioCaptura = idUsuarioCaptura;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getIdUsuarioCaptura() {
    return idUsuarioCaptura;
  }
  public void setIdUsuarioCaptura(Long idUsuarioCaptura) {
    this.idUsuarioCaptura = idUsuarioCaptura;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType idUsuarioCoejecuta(Long idUsuarioCoejecuta) {
    this.idUsuarioCoejecuta = idUsuarioCoejecuta;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getIdUsuarioCoejecuta() {
    return idUsuarioCoejecuta;
  }
  public void setIdUsuarioCoejecuta(Long idUsuarioCoejecuta) {
    this.idUsuarioCoejecuta = idUsuarioCoejecuta;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType idUsuarioEjecuta(Long idUsuarioEjecuta) {
    this.idUsuarioEjecuta = idUsuarioEjecuta;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getIdUsuarioEjecuta() {
    return idUsuarioEjecuta;
  }
  public void setIdUsuarioEjecuta(Long idUsuarioEjecuta) {
    this.idUsuarioEjecuta = idUsuarioEjecuta;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType tranBancoDestino(String tranBancoDestino) {
    this.tranBancoDestino = tranBancoDestino;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTranBancoDestino() {
    return tranBancoDestino;
  }
  public void setTranBancoDestino(String tranBancoDestino) {
    this.tranBancoDestino = tranBancoDestino;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType iva(Float iva) {
    this.iva = iva;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Float getIva() {
    return iva;
  }
  public void setIva(Float iva) {
    this.iva = iva;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType comisionAplicada(Boolean comisionAplicada) {
    this.comisionAplicada = comisionAplicada;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Boolean getComisionAplicada() {
    return comisionAplicada;
  }
  public void setComisionAplicada(Boolean comisionAplicada) {
    this.comisionAplicada = comisionAplicada;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType comisionEsquemaCobro(Float comisionEsquemaCobro) {
    this.comisionEsquemaCobro = comisionEsquemaCobro;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Float getComisionEsquemaCobro() {
    return comisionEsquemaCobro;
  }
  public void setComisionEsquemaCobro(Float comisionEsquemaCobro) {
    this.comisionEsquemaCobro = comisionEsquemaCobro;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType tranImporteComision(Float tranImporteComision) {
    this.tranImporteComision = tranImporteComision;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Float getTranImporteComision() {
    return tranImporteComision;
  }
  public void setTranImporteComision(Float tranImporteComision) {
    this.tranImporteComision = tranImporteComision;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType tranImporteIvaComision(Float tranImporteIvaComision) {
    this.tranImporteIvaComision = tranImporteIvaComision;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Float getTranImporteIvaComision() {
    return tranImporteIvaComision;
  }
  public void setTranImporteIvaComision(Float tranImporteIvaComision) {
    this.tranImporteIvaComision = tranImporteIvaComision;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType comisionTarifa(Float comisionTarifa) {
    this.comisionTarifa = comisionTarifa;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Float getComisionTarifa() {
    return comisionTarifa;
  }
  public void setComisionTarifa(Float comisionTarifa) {
    this.comisionTarifa = comisionTarifa;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType tranCuentaDestino(String tranCuentaDestino) {
    this.tranCuentaDestino = tranCuentaDestino;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTranCuentaDestino() {
    return tranCuentaDestino;
  }
  public void setTranCuentaDestino(String tranCuentaDestino) {
    this.tranCuentaDestino = tranCuentaDestino;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType tranCuentaOrigen(String tranCuentaOrigen) {
    this.tranCuentaOrigen = tranCuentaOrigen;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTranCuentaOrigen() {
    return tranCuentaOrigen;
  }
  public void setTranCuentaOrigen(String tranCuentaOrigen) {
    this.tranCuentaOrigen = tranCuentaOrigen;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType aliasCuentaOrigen(String aliasCuentaOrigen) {
    this.aliasCuentaOrigen = aliasCuentaOrigen;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getAliasCuentaOrigen() {
    return aliasCuentaOrigen;
  }
  public void setAliasCuentaOrigen(String aliasCuentaOrigen) {
    this.aliasCuentaOrigen = aliasCuentaOrigen;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType descripcion(String descripcion) {
    this.descripcion = descripcion;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getDescripcion() {
    return descripcion;
  }
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType divisaDestino(String divisaDestino) {
    this.divisaDestino = divisaDestino;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getDivisaDestino() {
    return divisaDestino;
  }
  public void setDivisaDestino(String divisaDestino) {
    this.divisaDestino = divisaDestino;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType divisaOrigen(String divisaOrigen) {
    this.divisaOrigen = divisaOrigen;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getDivisaOrigen() {
    return divisaOrigen;
  }
  public void setDivisaOrigen(String divisaOrigen) {
    this.divisaOrigen = divisaOrigen;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType enviarEmail(Boolean enviarEmail) {
    this.enviarEmail = enviarEmail;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Boolean getEnviarEmail() {
    return enviarEmail;
  }
  public void setEnviarEmail(Boolean enviarEmail) {
    this.enviarEmail = enviarEmail;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType estatusRegistro(String estatusRegistro) {
    this.estatusRegistro = estatusRegistro;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getEstatusRegistro() {
    return estatusRegistro;
  }
  public void setEstatusRegistro(String estatusRegistro) {
    this.estatusRegistro = estatusRegistro;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType tranFechaAplicacion(javax.xml.datatype.XMLGregorianCalendar tranFechaAplicacion) {
    this.tranFechaAplicacion = tranFechaAplicacion;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public javax.xml.datatype.XMLGregorianCalendar getTranFechaAplicacion() {
    return tranFechaAplicacion;
  }
  public void setTranFechaAplicacion(javax.xml.datatype.XMLGregorianCalendar tranFechaAplicacion) {
    this.tranFechaAplicacion = tranFechaAplicacion;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType tranFechaCancelacion(javax.xml.datatype.XMLGregorianCalendar tranFechaCancelacion) {
    this.tranFechaCancelacion = tranFechaCancelacion;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public javax.xml.datatype.XMLGregorianCalendar getTranFechaCancelacion() {
    return tranFechaCancelacion;
  }
  public void setTranFechaCancelacion(javax.xml.datatype.XMLGregorianCalendar tranFechaCancelacion) {
    this.tranFechaCancelacion = tranFechaCancelacion;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType fechaEjecucion(javax.xml.datatype.XMLGregorianCalendar fechaEjecucion) {
    this.fechaEjecucion = fechaEjecucion;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public javax.xml.datatype.XMLGregorianCalendar getFechaEjecucion() {
    return fechaEjecucion;
  }
  public void setFechaEjecucion(javax.xml.datatype.XMLGregorianCalendar fechaEjecucion) {
    this.fechaEjecucion = fechaEjecucion;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType fechaCoejecucion(javax.xml.datatype.XMLGregorianCalendar fechaCoejecucion) {
    this.fechaCoejecucion = fechaCoejecucion;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public javax.xml.datatype.XMLGregorianCalendar getFechaCoejecucion() {
    return fechaCoejecucion;
  }
  public void setFechaCoejecucion(javax.xml.datatype.XMLGregorianCalendar fechaCoejecucion) {
    this.fechaCoejecucion = fechaCoejecucion;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType tranFechaCreacion(javax.xml.datatype.XMLGregorianCalendar tranFechaCreacion) {
    this.tranFechaCreacion = tranFechaCreacion;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public javax.xml.datatype.XMLGregorianCalendar getTranFechaCreacion() {
    return tranFechaCreacion;
  }
  public void setTranFechaCreacion(javax.xml.datatype.XMLGregorianCalendar tranFechaCreacion) {
    this.tranFechaCreacion = tranFechaCreacion;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType idTransferencia(String idTransferencia) {
    this.idTransferencia = idTransferencia;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getIdTransferencia() {
    return idTransferencia;
  }
  public void setIdTransferencia(String idTransferencia) {
    this.idTransferencia = idTransferencia;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType tranImporteTotal(Float tranImporteTotal) {
    this.tranImporteTotal = tranImporteTotal;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Float getTranImporteTotal() {
    return tranImporteTotal;
  }
  public void setTranImporteTotal(Float tranImporteTotal) {
    this.tranImporteTotal = tranImporteTotal;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType tranNombreBeneficiario(String tranNombreBeneficiario) {
    this.tranNombreBeneficiario = tranNombreBeneficiario;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTranNombreBeneficiario() {
    return tranNombreBeneficiario;
  }
  public void setTranNombreBeneficiario(String tranNombreBeneficiario) {
    this.tranNombreBeneficiario = tranNombreBeneficiario;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType numeroIndice(Long numeroIndice) {
    this.numeroIndice = numeroIndice;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getNumeroIndice() {
    return numeroIndice;
  }
  public void setNumeroIndice(Long numeroIndice) {
    this.numeroIndice = numeroIndice;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType numeroSubLote(Long numeroSubLote) {
    this.numeroSubLote = numeroSubLote;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getNumeroSubLote() {
    return numeroSubLote;
  }
  public void setNumeroSubLote(Long numeroSubLote) {
    this.numeroSubLote = numeroSubLote;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType tranNumeroReferencia(String tranNumeroReferencia) {
    this.tranNumeroReferencia = tranNumeroReferencia;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTranNumeroReferencia() {
    return tranNumeroReferencia;
  }
  public void setTranNumeroReferencia(String tranNumeroReferencia) {
    this.tranNumeroReferencia = tranNumeroReferencia;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType usuarioCancela(String usuarioCancela) {
    this.usuarioCancela = usuarioCancela;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getUsuarioCancela() {
    return usuarioCancela;
  }
  public void setUsuarioCancela(String usuarioCancela) {
    this.usuarioCancela = usuarioCancela;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType usuarioCaptura(String usuarioCaptura) {
    this.usuarioCaptura = usuarioCaptura;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getUsuarioCaptura() {
    return usuarioCaptura;
  }
  public void setUsuarioCaptura(String usuarioCaptura) {
    this.usuarioCaptura = usuarioCaptura;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType usuarioCoejecuta(String usuarioCoejecuta) {
    this.usuarioCoejecuta = usuarioCoejecuta;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getUsuarioCoejecuta() {
    return usuarioCoejecuta;
  }
  public void setUsuarioCoejecuta(String usuarioCoejecuta) {
    this.usuarioCoejecuta = usuarioCoejecuta;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType usuarioEjecuta(String usuarioEjecuta) {
    this.usuarioEjecuta = usuarioEjecuta;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getUsuarioEjecuta() {
    return usuarioEjecuta;
  }
  public void setUsuarioEjecuta(String usuarioEjecuta) {
    this.usuarioEjecuta = usuarioEjecuta;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType claveConfirmacion01(String claveConfirmacion01) {
    this.claveConfirmacion01 = claveConfirmacion01;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getClaveConfirmacion01() {
    return claveConfirmacion01;
  }
  public void setClaveConfirmacion01(String claveConfirmacion01) {
    this.claveConfirmacion01 = claveConfirmacion01;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType claveConfirmacion02(String claveConfirmacion02) {
    this.claveConfirmacion02 = claveConfirmacion02;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getClaveConfirmacion02() {
    return claveConfirmacion02;
  }
  public void setClaveConfirmacion02(String claveConfirmacion02) {
    this.claveConfirmacion02 = claveConfirmacion02;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType claveNBxI(String claveNBxI) {
    this.claveNBxI = claveNBxI;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getClaveNBxI() {
    return claveNBxI;
  }
  public void setClaveNBxI(String claveNBxI) {
    this.claveNBxI = claveNBxI;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType numeroLote(Long numeroLote) {
    this.numeroLote = numeroLote;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getNumeroLote() {
    return numeroLote;
  }
  public void setNumeroLote(Long numeroLote) {
    this.numeroLote = numeroLote;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType numeroTarea(String numeroTarea) {
    this.numeroTarea = numeroTarea;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getNumeroTarea() {
    return numeroTarea;
  }
  public void setNumeroTarea(String numeroTarea) {
    this.numeroTarea = numeroTarea;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType exitoso(Boolean exitoso) {
    this.exitoso = exitoso;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Boolean getExitoso() {
    return exitoso;
  }
  public void setExitoso(Boolean exitoso) {
    this.exitoso = exitoso;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType identificadorTercero(String identificadorTercero) {
    this.identificadorTercero = identificadorTercero;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getIdentificadorTercero() {
    return identificadorTercero;
  }
  public void setIdentificadorTercero(String identificadorTercero) {
    this.identificadorTercero = identificadorTercero;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType tranIdUsuario(Long tranIdUsuario) {
    this.tranIdUsuario = tranIdUsuario;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getTranIdUsuario() {
    return tranIdUsuario;
  }
  public void setTranIdUsuario(Long tranIdUsuario) {
    this.tranIdUsuario = tranIdUsuario;
  }

  /**
   **/
  public ConsultaAutorizacionesOpiMNType autorizadores(List<AutorizadorType> autorizadores) {
    this.autorizadores = autorizadores;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<AutorizadorType> getAutorizadores() {
    return autorizadores;
  }
  public void setAutorizadores(List<AutorizadorType> autorizadores) {
    this.autorizadores = autorizadores;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaAutorizacionesOpiMNType consultaAutorizacionesOpiMNType = (ConsultaAutorizacionesOpiMNType) o;
    return Objects.equals(tranIdCuentaDestino, consultaAutorizacionesOpiMNType.tranIdCuentaDestino) &&
        Objects.equals(tranIdCuentaOrigen, consultaAutorizacionesOpiMNType.tranIdCuentaOrigen) &&
        Objects.equals(tranNumeroEmpresa, consultaAutorizacionesOpiMNType.tranNumeroEmpresa) &&
        Objects.equals(idEstatusRegistro, consultaAutorizacionesOpiMNType.idEstatusRegistro) &&
        Objects.equals(idPerfil, consultaAutorizacionesOpiMNType.idPerfil) &&
        Objects.equals(idServicio, consultaAutorizacionesOpiMNType.idServicio) &&
        Objects.equals(idTipoIngreso, consultaAutorizacionesOpiMNType.idTipoIngreso) &&
        Objects.equals(idUsuarioCancela, consultaAutorizacionesOpiMNType.idUsuarioCancela) &&
        Objects.equals(idUsuarioCaptura, consultaAutorizacionesOpiMNType.idUsuarioCaptura) &&
        Objects.equals(idUsuarioCoejecuta, consultaAutorizacionesOpiMNType.idUsuarioCoejecuta) &&
        Objects.equals(idUsuarioEjecuta, consultaAutorizacionesOpiMNType.idUsuarioEjecuta) &&
        Objects.equals(tranBancoDestino, consultaAutorizacionesOpiMNType.tranBancoDestino) &&
        Objects.equals(iva, consultaAutorizacionesOpiMNType.iva) &&
        Objects.equals(comisionAplicada, consultaAutorizacionesOpiMNType.comisionAplicada) &&
        Objects.equals(comisionEsquemaCobro, consultaAutorizacionesOpiMNType.comisionEsquemaCobro) &&
        Objects.equals(tranImporteComision, consultaAutorizacionesOpiMNType.tranImporteComision) &&
        Objects.equals(tranImporteIvaComision, consultaAutorizacionesOpiMNType.tranImporteIvaComision) &&
        Objects.equals(comisionTarifa, consultaAutorizacionesOpiMNType.comisionTarifa) &&
        Objects.equals(tranCuentaDestino, consultaAutorizacionesOpiMNType.tranCuentaDestino) &&
        Objects.equals(tranCuentaOrigen, consultaAutorizacionesOpiMNType.tranCuentaOrigen) &&
        Objects.equals(aliasCuentaOrigen, consultaAutorizacionesOpiMNType.aliasCuentaOrigen) &&
        Objects.equals(descripcion, consultaAutorizacionesOpiMNType.descripcion) &&
        Objects.equals(divisaDestino, consultaAutorizacionesOpiMNType.divisaDestino) &&
        Objects.equals(divisaOrigen, consultaAutorizacionesOpiMNType.divisaOrigen) &&
        Objects.equals(enviarEmail, consultaAutorizacionesOpiMNType.enviarEmail) &&
        Objects.equals(estatusRegistro, consultaAutorizacionesOpiMNType.estatusRegistro) &&
        Objects.equals(tranFechaAplicacion, consultaAutorizacionesOpiMNType.tranFechaAplicacion) &&
        Objects.equals(tranFechaCancelacion, consultaAutorizacionesOpiMNType.tranFechaCancelacion) &&
        Objects.equals(fechaEjecucion, consultaAutorizacionesOpiMNType.fechaEjecucion) &&
        Objects.equals(fechaCoejecucion, consultaAutorizacionesOpiMNType.fechaCoejecucion) &&
        Objects.equals(tranFechaCreacion, consultaAutorizacionesOpiMNType.tranFechaCreacion) &&
        Objects.equals(idTransferencia, consultaAutorizacionesOpiMNType.idTransferencia) &&
        Objects.equals(tranImporteTotal, consultaAutorizacionesOpiMNType.tranImporteTotal) &&
        Objects.equals(tranNombreBeneficiario, consultaAutorizacionesOpiMNType.tranNombreBeneficiario) &&
        Objects.equals(numeroIndice, consultaAutorizacionesOpiMNType.numeroIndice) &&
        Objects.equals(numeroSubLote, consultaAutorizacionesOpiMNType.numeroSubLote) &&
        Objects.equals(tranNumeroReferencia, consultaAutorizacionesOpiMNType.tranNumeroReferencia) &&
        Objects.equals(usuarioCancela, consultaAutorizacionesOpiMNType.usuarioCancela) &&
        Objects.equals(usuarioCaptura, consultaAutorizacionesOpiMNType.usuarioCaptura) &&
        Objects.equals(usuarioCoejecuta, consultaAutorizacionesOpiMNType.usuarioCoejecuta) &&
        Objects.equals(usuarioEjecuta, consultaAutorizacionesOpiMNType.usuarioEjecuta) &&
        Objects.equals(claveConfirmacion01, consultaAutorizacionesOpiMNType.claveConfirmacion01) &&
        Objects.equals(claveConfirmacion02, consultaAutorizacionesOpiMNType.claveConfirmacion02) &&
        Objects.equals(claveNBxI, consultaAutorizacionesOpiMNType.claveNBxI) &&
        Objects.equals(numeroLote, consultaAutorizacionesOpiMNType.numeroLote) &&
        Objects.equals(numeroTarea, consultaAutorizacionesOpiMNType.numeroTarea) &&
        Objects.equals(codigo, consultaAutorizacionesOpiMNType.codigo) &&
        Objects.equals(exitoso, consultaAutorizacionesOpiMNType.exitoso) &&
        Objects.equals(identificadorTercero, consultaAutorizacionesOpiMNType.identificadorTercero) &&
        Objects.equals(tranIdUsuario, consultaAutorizacionesOpiMNType.tranIdUsuario) &&
        Objects.equals(autorizadores, consultaAutorizacionesOpiMNType.autorizadores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tranIdCuentaDestino, tranIdCuentaOrigen, tranNumeroEmpresa, idEstatusRegistro, idPerfil, idServicio, idTipoIngreso, idUsuarioCancela, idUsuarioCaptura, idUsuarioCoejecuta, idUsuarioEjecuta, tranBancoDestino, iva, comisionAplicada, comisionEsquemaCobro, tranImporteComision, tranImporteIvaComision, comisionTarifa, tranCuentaDestino, tranCuentaOrigen, aliasCuentaOrigen, descripcion, divisaDestino, divisaOrigen, enviarEmail, estatusRegistro, tranFechaAplicacion, tranFechaCancelacion, fechaEjecucion, fechaCoejecucion, tranFechaCreacion, idTransferencia, tranImporteTotal, tranNombreBeneficiario, numeroIndice, numeroSubLote, tranNumeroReferencia, usuarioCancela, usuarioCaptura, usuarioCoejecuta, usuarioEjecuta, claveConfirmacion01, claveConfirmacion02, claveNBxI, numeroLote, numeroTarea, codigo, exitoso, identificadorTercero, tranIdUsuario, autorizadores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaAutorizacionesOpiMNType {\n");
    
    sb.append("    tranIdCuentaDestino: ").append(toIndentedString(tranIdCuentaDestino)).append("\n");
    sb.append("    tranIdCuentaOrigen: ").append(toIndentedString(tranIdCuentaOrigen)).append("\n");
    sb.append("    tranNumeroEmpresa: ").append(toIndentedString(tranNumeroEmpresa)).append("\n");
    sb.append("    idEstatusRegistro: ").append(toIndentedString(idEstatusRegistro)).append("\n");
    sb.append("    idPerfil: ").append(toIndentedString(idPerfil)).append("\n");
    sb.append("    idServicio: ").append(toIndentedString(idServicio)).append("\n");
    sb.append("    idTipoIngreso: ").append(toIndentedString(idTipoIngreso)).append("\n");
    sb.append("    idUsuarioCancela: ").append(toIndentedString(idUsuarioCancela)).append("\n");
    sb.append("    idUsuarioCaptura: ").append(toIndentedString(idUsuarioCaptura)).append("\n");
    sb.append("    idUsuarioCoejecuta: ").append(toIndentedString(idUsuarioCoejecuta)).append("\n");
    sb.append("    idUsuarioEjecuta: ").append(toIndentedString(idUsuarioEjecuta)).append("\n");
    sb.append("    tranBancoDestino: ").append(toIndentedString(tranBancoDestino)).append("\n");
    sb.append("    iva: ").append(toIndentedString(iva)).append("\n");
    sb.append("    comisionAplicada: ").append(toIndentedString(comisionAplicada)).append("\n");
    sb.append("    comisionEsquemaCobro: ").append(toIndentedString(comisionEsquemaCobro)).append("\n");
    sb.append("    tranImporteComision: ").append(toIndentedString(tranImporteComision)).append("\n");
    sb.append("    tranImporteIvaComision: ").append(toIndentedString(tranImporteIvaComision)).append("\n");
    sb.append("    comisionTarifa: ").append(toIndentedString(comisionTarifa)).append("\n");
    sb.append("    tranCuentaDestino: ").append(toIndentedString(tranCuentaDestino)).append("\n");
    sb.append("    tranCuentaOrigen: ").append(toIndentedString(tranCuentaOrigen)).append("\n");
    sb.append("    aliasCuentaOrigen: ").append(toIndentedString(aliasCuentaOrigen)).append("\n");
    sb.append("    descripcion: ").append(toIndentedString(descripcion)).append("\n");
    sb.append("    divisaDestino: ").append(toIndentedString(divisaDestino)).append("\n");
    sb.append("    divisaOrigen: ").append(toIndentedString(divisaOrigen)).append("\n");
    sb.append("    enviarEmail: ").append(toIndentedString(enviarEmail)).append("\n");
    sb.append("    estatusRegistro: ").append(toIndentedString(estatusRegistro)).append("\n");
    sb.append("    tranFechaAplicacion: ").append(toIndentedString(tranFechaAplicacion)).append("\n");
    sb.append("    tranFechaCancelacion: ").append(toIndentedString(tranFechaCancelacion)).append("\n");
    sb.append("    fechaEjecucion: ").append(toIndentedString(fechaEjecucion)).append("\n");
    sb.append("    fechaCoejecucion: ").append(toIndentedString(fechaCoejecucion)).append("\n");
    sb.append("    tranFechaCreacion: ").append(toIndentedString(tranFechaCreacion)).append("\n");
    sb.append("    idTransferencia: ").append(toIndentedString(idTransferencia)).append("\n");
    sb.append("    tranImporteTotal: ").append(toIndentedString(tranImporteTotal)).append("\n");
    sb.append("    tranNombreBeneficiario: ").append(toIndentedString(tranNombreBeneficiario)).append("\n");
    sb.append("    numeroIndice: ").append(toIndentedString(numeroIndice)).append("\n");
    sb.append("    numeroSubLote: ").append(toIndentedString(numeroSubLote)).append("\n");
    sb.append("    tranNumeroReferencia: ").append(toIndentedString(tranNumeroReferencia)).append("\n");
    sb.append("    usuarioCancela: ").append(toIndentedString(usuarioCancela)).append("\n");
    sb.append("    usuarioCaptura: ").append(toIndentedString(usuarioCaptura)).append("\n");
    sb.append("    usuarioCoejecuta: ").append(toIndentedString(usuarioCoejecuta)).append("\n");
    sb.append("    usuarioEjecuta: ").append(toIndentedString(usuarioEjecuta)).append("\n");
    sb.append("    claveConfirmacion01: ").append(toIndentedString(claveConfirmacion01)).append("\n");
    sb.append("    claveConfirmacion02: ").append(toIndentedString(claveConfirmacion02)).append("\n");
    sb.append("    claveNBxI: ").append(toIndentedString(claveNBxI)).append("\n");
    sb.append("    numeroLote: ").append(toIndentedString(numeroLote)).append("\n");
    sb.append("    numeroTarea: ").append(toIndentedString(numeroTarea)).append("\n");
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    exitoso: ").append(toIndentedString(exitoso)).append("\n");
    sb.append("    identificadorTercero: ").append(toIndentedString(identificadorTercero)).append("\n");
    sb.append("    tranIdUsuario: ").append(toIndentedString(tranIdUsuario)).append("\n");
    sb.append("    autorizadores: ").append(toIndentedString(autorizadores)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
