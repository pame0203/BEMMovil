package io.swagger.model;

import io.swagger.model.AutorizadorType;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class ConsultaAutorizacionesTEFType   {
  
  private String idArchivo = null;
  private Long idBanco = null;
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
  private String email = null;
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
  private String mensajeUsuario = null;
  private Long numeroLote = null;
  private String numeroTarea = null;
  private String codigo = null;
  private Boolean exitoso = false;
  private String nombreOrdenante = null;
  private String rfcOrdenante = null;
  private Long idConsecutivoArchivo = null;
  private String identificadorTercero = null;
  private Long tranIdUsuario = null;
  private List<AutorizadorType> autorizadores = new ArrayList<AutorizadorType>();

  /**
   **/
  public ConsultaAutorizacionesTEFType idArchivo(String idArchivo) {
    this.idArchivo = idArchivo;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getIdArchivo() {
    return idArchivo;
  }
  public void setIdArchivo(String idArchivo) {
    this.idArchivo = idArchivo;
  }

  /**
   **/
  public ConsultaAutorizacionesTEFType idBanco(Long idBanco) {
    this.idBanco = idBanco;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getIdBanco() {
    return idBanco;
  }
  public void setIdBanco(Long idBanco) {
    this.idBanco = idBanco;
  }

  /**
   **/
  public ConsultaAutorizacionesTEFType tranIdCuentaDestino(Long tranIdCuentaDestino) {
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
  public ConsultaAutorizacionesTEFType tranIdCuentaOrigen(Long tranIdCuentaOrigen) {
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
  public ConsultaAutorizacionesTEFType tranNumeroEmpresa(Long tranNumeroEmpresa) {
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
  public ConsultaAutorizacionesTEFType idEstatusRegistro(Long idEstatusRegistro) {
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
  public ConsultaAutorizacionesTEFType idPerfil(Long idPerfil) {
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
  public ConsultaAutorizacionesTEFType idServicio(Long idServicio) {
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
  public ConsultaAutorizacionesTEFType idTipoIngreso(Long idTipoIngreso) {
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
  public ConsultaAutorizacionesTEFType idUsuarioCancela(Long idUsuarioCancela) {
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
  public ConsultaAutorizacionesTEFType idUsuarioCaptura(Long idUsuarioCaptura) {
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
  public ConsultaAutorizacionesTEFType idUsuarioCoejecuta(Long idUsuarioCoejecuta) {
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
  public ConsultaAutorizacionesTEFType idUsuarioEjecuta(Long idUsuarioEjecuta) {
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
  public ConsultaAutorizacionesTEFType tranBancoDestino(String tranBancoDestino) {
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
  public ConsultaAutorizacionesTEFType iva(Float iva) {
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
  public ConsultaAutorizacionesTEFType comisionAplicada(Boolean comisionAplicada) {
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
  public ConsultaAutorizacionesTEFType comisionEsquemaCobro(Float comisionEsquemaCobro) {
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
  public ConsultaAutorizacionesTEFType tranImporteComision(Float tranImporteComision) {
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
  public ConsultaAutorizacionesTEFType tranImporteIvaComision(Float tranImporteIvaComision) {
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
  public ConsultaAutorizacionesTEFType comisionTarifa(Float comisionTarifa) {
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
  public ConsultaAutorizacionesTEFType tranCuentaDestino(String tranCuentaDestino) {
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
  public ConsultaAutorizacionesTEFType tranCuentaOrigen(String tranCuentaOrigen) {
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
  public ConsultaAutorizacionesTEFType aliasCuentaOrigen(String aliasCuentaOrigen) {
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
  public ConsultaAutorizacionesTEFType descripcion(String descripcion) {
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
  public ConsultaAutorizacionesTEFType divisaDestino(String divisaDestino) {
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
  public ConsultaAutorizacionesTEFType divisaOrigen(String divisaOrigen) {
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
  public ConsultaAutorizacionesTEFType email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   **/
  public ConsultaAutorizacionesTEFType enviarEmail(Boolean enviarEmail) {
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
  public ConsultaAutorizacionesTEFType estatusRegistro(String estatusRegistro) {
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
  public ConsultaAutorizacionesTEFType tranFechaAplicacion(javax.xml.datatype.XMLGregorianCalendar tranFechaAplicacion) {
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
  public ConsultaAutorizacionesTEFType tranFechaCancelacion(javax.xml.datatype.XMLGregorianCalendar tranFechaCancelacion) {
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
  public ConsultaAutorizacionesTEFType fechaEjecucion(javax.xml.datatype.XMLGregorianCalendar fechaEjecucion) {
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
  public ConsultaAutorizacionesTEFType fechaCoejecucion(javax.xml.datatype.XMLGregorianCalendar fechaCoejecucion) {
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
  public ConsultaAutorizacionesTEFType tranFechaCreacion(javax.xml.datatype.XMLGregorianCalendar tranFechaCreacion) {
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
  public ConsultaAutorizacionesTEFType idTransferencia(String idTransferencia) {
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
  public ConsultaAutorizacionesTEFType tranImporteTotal(Float tranImporteTotal) {
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
  public ConsultaAutorizacionesTEFType tranNombreBeneficiario(String tranNombreBeneficiario) {
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
  public ConsultaAutorizacionesTEFType numeroIndice(Long numeroIndice) {
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
  public ConsultaAutorizacionesTEFType numeroSubLote(Long numeroSubLote) {
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
  public ConsultaAutorizacionesTEFType tranNumeroReferencia(String tranNumeroReferencia) {
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
  public ConsultaAutorizacionesTEFType usuarioCancela(String usuarioCancela) {
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
  public ConsultaAutorizacionesTEFType usuarioCaptura(String usuarioCaptura) {
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
  public ConsultaAutorizacionesTEFType usuarioCoejecuta(String usuarioCoejecuta) {
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
  public ConsultaAutorizacionesTEFType usuarioEjecuta(String usuarioEjecuta) {
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
  public ConsultaAutorizacionesTEFType claveConfirmacion01(String claveConfirmacion01) {
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
  public ConsultaAutorizacionesTEFType claveConfirmacion02(String claveConfirmacion02) {
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
  public ConsultaAutorizacionesTEFType claveNBxI(String claveNBxI) {
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
  public ConsultaAutorizacionesTEFType mensajeUsuario(String mensajeUsuario) {
    this.mensajeUsuario = mensajeUsuario;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getMensajeUsuario() {
    return mensajeUsuario;
  }
  public void setMensajeUsuario(String mensajeUsuario) {
    this.mensajeUsuario = mensajeUsuario;
  }

  /**
   **/
  public ConsultaAutorizacionesTEFType numeroLote(Long numeroLote) {
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
  public ConsultaAutorizacionesTEFType numeroTarea(String numeroTarea) {
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
  public ConsultaAutorizacionesTEFType codigo(String codigo) {
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
  public ConsultaAutorizacionesTEFType exitoso(Boolean exitoso) {
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
  public ConsultaAutorizacionesTEFType nombreOrdenante(String nombreOrdenante) {
    this.nombreOrdenante = nombreOrdenante;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getNombreOrdenante() {
    return nombreOrdenante;
  }
  public void setNombreOrdenante(String nombreOrdenante) {
    this.nombreOrdenante = nombreOrdenante;
  }

  /**
   **/
  public ConsultaAutorizacionesTEFType rfcOrdenante(String rfcOrdenante) {
    this.rfcOrdenante = rfcOrdenante;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getRfcOrdenante() {
    return rfcOrdenante;
  }
  public void setRfcOrdenante(String rfcOrdenante) {
    this.rfcOrdenante = rfcOrdenante;
  }

  /**
   **/
  public ConsultaAutorizacionesTEFType idConsecutivoArchivo(Long idConsecutivoArchivo) {
    this.idConsecutivoArchivo = idConsecutivoArchivo;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getIdConsecutivoArchivo() {
    return idConsecutivoArchivo;
  }
  public void setIdConsecutivoArchivo(Long idConsecutivoArchivo) {
    this.idConsecutivoArchivo = idConsecutivoArchivo;
  }

  /**
   **/
  public ConsultaAutorizacionesTEFType identificadorTercero(String identificadorTercero) {
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
  public ConsultaAutorizacionesTEFType tranIdUsuario(Long tranIdUsuario) {
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
  public ConsultaAutorizacionesTEFType autorizadores(List<AutorizadorType> autorizadores) {
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
    ConsultaAutorizacionesTEFType consultaAutorizacionesTEFType = (ConsultaAutorizacionesTEFType) o;
    return Objects.equals(idArchivo, consultaAutorizacionesTEFType.idArchivo) &&
        Objects.equals(idBanco, consultaAutorizacionesTEFType.idBanco) &&
        Objects.equals(tranIdCuentaDestino, consultaAutorizacionesTEFType.tranIdCuentaDestino) &&
        Objects.equals(tranIdCuentaOrigen, consultaAutorizacionesTEFType.tranIdCuentaOrigen) &&
        Objects.equals(tranNumeroEmpresa, consultaAutorizacionesTEFType.tranNumeroEmpresa) &&
        Objects.equals(idEstatusRegistro, consultaAutorizacionesTEFType.idEstatusRegistro) &&
        Objects.equals(idPerfil, consultaAutorizacionesTEFType.idPerfil) &&
        Objects.equals(idServicio, consultaAutorizacionesTEFType.idServicio) &&
        Objects.equals(idTipoIngreso, consultaAutorizacionesTEFType.idTipoIngreso) &&
        Objects.equals(idUsuarioCancela, consultaAutorizacionesTEFType.idUsuarioCancela) &&
        Objects.equals(idUsuarioCaptura, consultaAutorizacionesTEFType.idUsuarioCaptura) &&
        Objects.equals(idUsuarioCoejecuta, consultaAutorizacionesTEFType.idUsuarioCoejecuta) &&
        Objects.equals(idUsuarioEjecuta, consultaAutorizacionesTEFType.idUsuarioEjecuta) &&
        Objects.equals(tranBancoDestino, consultaAutorizacionesTEFType.tranBancoDestino) &&
        Objects.equals(iva, consultaAutorizacionesTEFType.iva) &&
        Objects.equals(comisionAplicada, consultaAutorizacionesTEFType.comisionAplicada) &&
        Objects.equals(comisionEsquemaCobro, consultaAutorizacionesTEFType.comisionEsquemaCobro) &&
        Objects.equals(tranImporteComision, consultaAutorizacionesTEFType.tranImporteComision) &&
        Objects.equals(tranImporteIvaComision, consultaAutorizacionesTEFType.tranImporteIvaComision) &&
        Objects.equals(comisionTarifa, consultaAutorizacionesTEFType.comisionTarifa) &&
        Objects.equals(tranCuentaDestino, consultaAutorizacionesTEFType.tranCuentaDestino) &&
        Objects.equals(tranCuentaOrigen, consultaAutorizacionesTEFType.tranCuentaOrigen) &&
        Objects.equals(aliasCuentaOrigen, consultaAutorizacionesTEFType.aliasCuentaOrigen) &&
        Objects.equals(descripcion, consultaAutorizacionesTEFType.descripcion) &&
        Objects.equals(divisaDestino, consultaAutorizacionesTEFType.divisaDestino) &&
        Objects.equals(divisaOrigen, consultaAutorizacionesTEFType.divisaOrigen) &&
        Objects.equals(email, consultaAutorizacionesTEFType.email) &&
        Objects.equals(enviarEmail, consultaAutorizacionesTEFType.enviarEmail) &&
        Objects.equals(estatusRegistro, consultaAutorizacionesTEFType.estatusRegistro) &&
        Objects.equals(tranFechaAplicacion, consultaAutorizacionesTEFType.tranFechaAplicacion) &&
        Objects.equals(tranFechaCancelacion, consultaAutorizacionesTEFType.tranFechaCancelacion) &&
        Objects.equals(fechaEjecucion, consultaAutorizacionesTEFType.fechaEjecucion) &&
        Objects.equals(fechaCoejecucion, consultaAutorizacionesTEFType.fechaCoejecucion) &&
        Objects.equals(tranFechaCreacion, consultaAutorizacionesTEFType.tranFechaCreacion) &&
        Objects.equals(idTransferencia, consultaAutorizacionesTEFType.idTransferencia) &&
        Objects.equals(tranImporteTotal, consultaAutorizacionesTEFType.tranImporteTotal) &&
        Objects.equals(tranNombreBeneficiario, consultaAutorizacionesTEFType.tranNombreBeneficiario) &&
        Objects.equals(numeroIndice, consultaAutorizacionesTEFType.numeroIndice) &&
        Objects.equals(numeroSubLote, consultaAutorizacionesTEFType.numeroSubLote) &&
        Objects.equals(tranNumeroReferencia, consultaAutorizacionesTEFType.tranNumeroReferencia) &&
        Objects.equals(usuarioCancela, consultaAutorizacionesTEFType.usuarioCancela) &&
        Objects.equals(usuarioCaptura, consultaAutorizacionesTEFType.usuarioCaptura) &&
        Objects.equals(usuarioCoejecuta, consultaAutorizacionesTEFType.usuarioCoejecuta) &&
        Objects.equals(usuarioEjecuta, consultaAutorizacionesTEFType.usuarioEjecuta) &&
        Objects.equals(claveConfirmacion01, consultaAutorizacionesTEFType.claveConfirmacion01) &&
        Objects.equals(claveConfirmacion02, consultaAutorizacionesTEFType.claveConfirmacion02) &&
        Objects.equals(claveNBxI, consultaAutorizacionesTEFType.claveNBxI) &&
        Objects.equals(mensajeUsuario, consultaAutorizacionesTEFType.mensajeUsuario) &&
        Objects.equals(numeroLote, consultaAutorizacionesTEFType.numeroLote) &&
        Objects.equals(numeroTarea, consultaAutorizacionesTEFType.numeroTarea) &&
        Objects.equals(codigo, consultaAutorizacionesTEFType.codigo) &&
        Objects.equals(exitoso, consultaAutorizacionesTEFType.exitoso) &&
        Objects.equals(nombreOrdenante, consultaAutorizacionesTEFType.nombreOrdenante) &&
        Objects.equals(rfcOrdenante, consultaAutorizacionesTEFType.rfcOrdenante) &&
        Objects.equals(idConsecutivoArchivo, consultaAutorizacionesTEFType.idConsecutivoArchivo) &&
        Objects.equals(identificadorTercero, consultaAutorizacionesTEFType.identificadorTercero) &&
        Objects.equals(tranIdUsuario, consultaAutorizacionesTEFType.tranIdUsuario) &&
        Objects.equals(autorizadores, consultaAutorizacionesTEFType.autorizadores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idArchivo, idBanco, tranIdCuentaDestino, tranIdCuentaOrigen, tranNumeroEmpresa, idEstatusRegistro, idPerfil, idServicio, idTipoIngreso, idUsuarioCancela, idUsuarioCaptura, idUsuarioCoejecuta, idUsuarioEjecuta, tranBancoDestino, iva, comisionAplicada, comisionEsquemaCobro, tranImporteComision, tranImporteIvaComision, comisionTarifa, tranCuentaDestino, tranCuentaOrigen, aliasCuentaOrigen, descripcion, divisaDestino, divisaOrigen, email, enviarEmail, estatusRegistro, tranFechaAplicacion, tranFechaCancelacion, fechaEjecucion, fechaCoejecucion, tranFechaCreacion, idTransferencia, tranImporteTotal, tranNombreBeneficiario, numeroIndice, numeroSubLote, tranNumeroReferencia, usuarioCancela, usuarioCaptura, usuarioCoejecuta, usuarioEjecuta, claveConfirmacion01, claveConfirmacion02, claveNBxI, mensajeUsuario, numeroLote, numeroTarea, codigo, exitoso, nombreOrdenante, rfcOrdenante, idConsecutivoArchivo, identificadorTercero, tranIdUsuario, autorizadores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaAutorizacionesTEFType {\n");
    
    sb.append("    idArchivo: ").append(toIndentedString(idArchivo)).append("\n");
    sb.append("    idBanco: ").append(toIndentedString(idBanco)).append("\n");
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
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
    sb.append("    mensajeUsuario: ").append(toIndentedString(mensajeUsuario)).append("\n");
    sb.append("    numeroLote: ").append(toIndentedString(numeroLote)).append("\n");
    sb.append("    numeroTarea: ").append(toIndentedString(numeroTarea)).append("\n");
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    exitoso: ").append(toIndentedString(exitoso)).append("\n");
    sb.append("    nombreOrdenante: ").append(toIndentedString(nombreOrdenante)).append("\n");
    sb.append("    rfcOrdenante: ").append(toIndentedString(rfcOrdenante)).append("\n");
    sb.append("    idConsecutivoArchivo: ").append(toIndentedString(idConsecutivoArchivo)).append("\n");
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
