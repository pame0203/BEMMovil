package io.swagger.model;

import io.swagger.model.AutorizadorType;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class ConsultaAutorizacionesCuentaTerceroType   {
  
  private String tranNumeroCuenta = null;
  private String alias = null;
  private Long idCuentaTercero = null;
  private Long tranTipoCredito = null;
  private Long tranTipoCuenta = null;
  private Long idBanco = null;
  private Long idPais = null;
  private String poblacion = null;
  private String idDivisa = null;
  private Boolean estatusActivo = false;
  private String nombreBanco = null;
  private Long idTercero = null;
  private String tranNombrePersona = null;
  private String direccion = null;
  private String colonia = null;
  private Long idPaisB = null;
  private String telefono = null;
  private String correoElectronico = null;
  private Long orden = null;
  private String bancoInternacional = null;
  private String tranTipoDivisa = null;
  private String identificador = null;
  private String tranNombreTitular = null;
  private javax.xml.datatype.XMLGregorianCalendar tranFechaCreacion = null;
  private javax.xml.datatype.XMLGregorianCalendar fechaCapturo = null;
  private javax.xml.datatype.XMLGregorianCalendar tranFechaAplicacion = null;
  private String usuarioCapturo = null;
  private String usuarioEjecuto = null;
  private Long estatus = null;
  private String confirmacion = null;
  private List<AutorizadorType> autorizadores = new ArrayList<AutorizadorType>();
  private String rfc = null;
  private String abaswift = null;
  private String rfcordenante = null;

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType tranNumeroCuenta(String tranNumeroCuenta) {
    this.tranNumeroCuenta = tranNumeroCuenta;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTranNumeroCuenta() {
    return tranNumeroCuenta;
  }
  public void setTranNumeroCuenta(String tranNumeroCuenta) {
    this.tranNumeroCuenta = tranNumeroCuenta;
  }

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType alias(String alias) {
    this.alias = alias;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getAlias() {
    return alias;
  }
  public void setAlias(String alias) {
    this.alias = alias;
  }

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType idCuentaTercero(Long idCuentaTercero) {
    this.idCuentaTercero = idCuentaTercero;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getIdCuentaTercero() {
    return idCuentaTercero;
  }
  public void setIdCuentaTercero(Long idCuentaTercero) {
    this.idCuentaTercero = idCuentaTercero;
  }

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType tranTipoCredito(Long tranTipoCredito) {
    this.tranTipoCredito = tranTipoCredito;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getTranTipoCredito() {
    return tranTipoCredito;
  }
  public void setTranTipoCredito(Long tranTipoCredito) {
    this.tranTipoCredito = tranTipoCredito;
  }

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType tranTipoCuenta(Long tranTipoCuenta) {
    this.tranTipoCuenta = tranTipoCuenta;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getTranTipoCuenta() {
    return tranTipoCuenta;
  }
  public void setTranTipoCuenta(Long tranTipoCuenta) {
    this.tranTipoCuenta = tranTipoCuenta;
  }

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType idBanco(Long idBanco) {
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
  public ConsultaAutorizacionesCuentaTerceroType idPais(Long idPais) {
    this.idPais = idPais;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getIdPais() {
    return idPais;
  }
  public void setIdPais(Long idPais) {
    this.idPais = idPais;
  }

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType poblacion(String poblacion) {
    this.poblacion = poblacion;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getPoblacion() {
    return poblacion;
  }
  public void setPoblacion(String poblacion) {
    this.poblacion = poblacion;
  }

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType idDivisa(String idDivisa) {
    this.idDivisa = idDivisa;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getIdDivisa() {
    return idDivisa;
  }
  public void setIdDivisa(String idDivisa) {
    this.idDivisa = idDivisa;
  }

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType estatusActivo(Boolean estatusActivo) {
    this.estatusActivo = estatusActivo;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Boolean getEstatusActivo() {
    return estatusActivo;
  }
  public void setEstatusActivo(Boolean estatusActivo) {
    this.estatusActivo = estatusActivo;
  }

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType nombreBanco(String nombreBanco) {
    this.nombreBanco = nombreBanco;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getNombreBanco() {
    return nombreBanco;
  }
  public void setNombreBanco(String nombreBanco) {
    this.nombreBanco = nombreBanco;
  }

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType idTercero(Long idTercero) {
    this.idTercero = idTercero;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getIdTercero() {
    return idTercero;
  }
  public void setIdTercero(Long idTercero) {
    this.idTercero = idTercero;
  }

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType tranNombrePersona(String tranNombrePersona) {
    this.tranNombrePersona = tranNombrePersona;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTranNombrePersona() {
    return tranNombrePersona;
  }
  public void setTranNombrePersona(String tranNombrePersona) {
    this.tranNombrePersona = tranNombrePersona;
  }

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType direccion(String direccion) {
    this.direccion = direccion;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getDireccion() {
    return direccion;
  }
  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType colonia(String colonia) {
    this.colonia = colonia;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getColonia() {
    return colonia;
  }
  public void setColonia(String colonia) {
    this.colonia = colonia;
  }

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType idPaisB(Long idPaisB) {
    this.idPaisB = idPaisB;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getIdPaisB() {
    return idPaisB;
  }
  public void setIdPaisB(Long idPaisB) {
    this.idPaisB = idPaisB;
  }

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType telefono(String telefono) {
    this.telefono = telefono;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTelefono() {
    return telefono;
  }
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType correoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getCorreoElectronico() {
    return correoElectronico;
  }
  public void setCorreoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
  }

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType orden(Long orden) {
    this.orden = orden;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getOrden() {
    return orden;
  }
  public void setOrden(Long orden) {
    this.orden = orden;
  }

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType bancoInternacional(String bancoInternacional) {
    this.bancoInternacional = bancoInternacional;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getBancoInternacional() {
    return bancoInternacional;
  }
  public void setBancoInternacional(String bancoInternacional) {
    this.bancoInternacional = bancoInternacional;
  }

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType tranTipoDivisa(String tranTipoDivisa) {
    this.tranTipoDivisa = tranTipoDivisa;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTranTipoDivisa() {
    return tranTipoDivisa;
  }
  public void setTranTipoDivisa(String tranTipoDivisa) {
    this.tranTipoDivisa = tranTipoDivisa;
  }

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType identificador(String identificador) {
    this.identificador = identificador;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getIdentificador() {
    return identificador;
  }
  public void setIdentificador(String identificador) {
    this.identificador = identificador;
  }

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType tranNombreTitular(String tranNombreTitular) {
    this.tranNombreTitular = tranNombreTitular;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTranNombreTitular() {
    return tranNombreTitular;
  }
  public void setTranNombreTitular(String tranNombreTitular) {
    this.tranNombreTitular = tranNombreTitular;
  }

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType tranFechaCreacion(javax.xml.datatype.XMLGregorianCalendar tranFechaCreacion) {
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
  public ConsultaAutorizacionesCuentaTerceroType fechaCapturo(javax.xml.datatype.XMLGregorianCalendar fechaCapturo) {
    this.fechaCapturo = fechaCapturo;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public javax.xml.datatype.XMLGregorianCalendar getFechaCapturo() {
    return fechaCapturo;
  }
  public void setFechaCapturo(javax.xml.datatype.XMLGregorianCalendar fechaCapturo) {
    this.fechaCapturo = fechaCapturo;
  }

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType tranFechaAplicacion(javax.xml.datatype.XMLGregorianCalendar tranFechaAplicacion) {
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
  public ConsultaAutorizacionesCuentaTerceroType usuarioCapturo(String usuarioCapturo) {
    this.usuarioCapturo = usuarioCapturo;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getUsuarioCapturo() {
    return usuarioCapturo;
  }
  public void setUsuarioCapturo(String usuarioCapturo) {
    this.usuarioCapturo = usuarioCapturo;
  }

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType usuarioEjecuto(String usuarioEjecuto) {
    this.usuarioEjecuto = usuarioEjecuto;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getUsuarioEjecuto() {
    return usuarioEjecuto;
  }
  public void setUsuarioEjecuto(String usuarioEjecuto) {
    this.usuarioEjecuto = usuarioEjecuto;
  }

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType estatus(Long estatus) {
    this.estatus = estatus;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getEstatus() {
    return estatus;
  }
  public void setEstatus(Long estatus) {
    this.estatus = estatus;
  }

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType confirmacion(String confirmacion) {
    this.confirmacion = confirmacion;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getConfirmacion() {
    return confirmacion;
  }
  public void setConfirmacion(String confirmacion) {
    this.confirmacion = confirmacion;
  }

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType autorizadores(List<AutorizadorType> autorizadores) {
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

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType rfc(String rfc) {
    this.rfc = rfc;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getRfc() {
    return rfc;
  }
  public void setRfc(String rfc) {
    this.rfc = rfc;
  }

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType abaswift(String abaswift) {
    this.abaswift = abaswift;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getAbaswift() {
    return abaswift;
  }
  public void setAbaswift(String abaswift) {
    this.abaswift = abaswift;
  }

  /**
   **/
  public ConsultaAutorizacionesCuentaTerceroType rfcordenante(String rfcordenante) {
    this.rfcordenante = rfcordenante;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getRfcordenante() {
    return rfcordenante;
  }
  public void setRfcordenante(String rfcordenante) {
    this.rfcordenante = rfcordenante;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaAutorizacionesCuentaTerceroType consultaAutorizacionesCuentaTerceroType = (ConsultaAutorizacionesCuentaTerceroType) o;
    return Objects.equals(tranNumeroCuenta, consultaAutorizacionesCuentaTerceroType.tranNumeroCuenta) &&
        Objects.equals(alias, consultaAutorizacionesCuentaTerceroType.alias) &&
        Objects.equals(idCuentaTercero, consultaAutorizacionesCuentaTerceroType.idCuentaTercero) &&
        Objects.equals(tranTipoCredito, consultaAutorizacionesCuentaTerceroType.tranTipoCredito) &&
        Objects.equals(tranTipoCuenta, consultaAutorizacionesCuentaTerceroType.tranTipoCuenta) &&
        Objects.equals(idBanco, consultaAutorizacionesCuentaTerceroType.idBanco) &&
        Objects.equals(idPais, consultaAutorizacionesCuentaTerceroType.idPais) &&
        Objects.equals(poblacion, consultaAutorizacionesCuentaTerceroType.poblacion) &&
        Objects.equals(idDivisa, consultaAutorizacionesCuentaTerceroType.idDivisa) &&
        Objects.equals(estatusActivo, consultaAutorizacionesCuentaTerceroType.estatusActivo) &&
        Objects.equals(nombreBanco, consultaAutorizacionesCuentaTerceroType.nombreBanco) &&
        Objects.equals(idTercero, consultaAutorizacionesCuentaTerceroType.idTercero) &&
        Objects.equals(tranNombrePersona, consultaAutorizacionesCuentaTerceroType.tranNombrePersona) &&
        Objects.equals(direccion, consultaAutorizacionesCuentaTerceroType.direccion) &&
        Objects.equals(colonia, consultaAutorizacionesCuentaTerceroType.colonia) &&
        Objects.equals(idPaisB, consultaAutorizacionesCuentaTerceroType.idPaisB) &&
        Objects.equals(telefono, consultaAutorizacionesCuentaTerceroType.telefono) &&
        Objects.equals(correoElectronico, consultaAutorizacionesCuentaTerceroType.correoElectronico) &&
        Objects.equals(orden, consultaAutorizacionesCuentaTerceroType.orden) &&
        Objects.equals(bancoInternacional, consultaAutorizacionesCuentaTerceroType.bancoInternacional) &&
        Objects.equals(tranTipoDivisa, consultaAutorizacionesCuentaTerceroType.tranTipoDivisa) &&
        Objects.equals(identificador, consultaAutorizacionesCuentaTerceroType.identificador) &&
        Objects.equals(tranNombreTitular, consultaAutorizacionesCuentaTerceroType.tranNombreTitular) &&
        Objects.equals(tranFechaCreacion, consultaAutorizacionesCuentaTerceroType.tranFechaCreacion) &&
        Objects.equals(fechaCapturo, consultaAutorizacionesCuentaTerceroType.fechaCapturo) &&
        Objects.equals(tranFechaAplicacion, consultaAutorizacionesCuentaTerceroType.tranFechaAplicacion) &&
        Objects.equals(usuarioCapturo, consultaAutorizacionesCuentaTerceroType.usuarioCapturo) &&
        Objects.equals(usuarioEjecuto, consultaAutorizacionesCuentaTerceroType.usuarioEjecuto) &&
        Objects.equals(estatus, consultaAutorizacionesCuentaTerceroType.estatus) &&
        Objects.equals(confirmacion, consultaAutorizacionesCuentaTerceroType.confirmacion) &&
        Objects.equals(autorizadores, consultaAutorizacionesCuentaTerceroType.autorizadores) &&
        Objects.equals(rfc, consultaAutorizacionesCuentaTerceroType.rfc) &&
        Objects.equals(abaswift, consultaAutorizacionesCuentaTerceroType.abaswift) &&
        Objects.equals(rfcordenante, consultaAutorizacionesCuentaTerceroType.rfcordenante);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tranNumeroCuenta, alias, idCuentaTercero, tranTipoCredito, tranTipoCuenta, idBanco, idPais, poblacion, idDivisa, estatusActivo, nombreBanco, idTercero, tranNombrePersona, direccion, colonia, idPaisB, telefono, correoElectronico, orden, bancoInternacional, tranTipoDivisa, identificador, tranNombreTitular, tranFechaCreacion, fechaCapturo, tranFechaAplicacion, usuarioCapturo, usuarioEjecuto, estatus, confirmacion, autorizadores, rfc, abaswift, rfcordenante);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaAutorizacionesCuentaTerceroType {\n");
    
    sb.append("    tranNumeroCuenta: ").append(toIndentedString(tranNumeroCuenta)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    idCuentaTercero: ").append(toIndentedString(idCuentaTercero)).append("\n");
    sb.append("    tranTipoCredito: ").append(toIndentedString(tranTipoCredito)).append("\n");
    sb.append("    tranTipoCuenta: ").append(toIndentedString(tranTipoCuenta)).append("\n");
    sb.append("    idBanco: ").append(toIndentedString(idBanco)).append("\n");
    sb.append("    idPais: ").append(toIndentedString(idPais)).append("\n");
    sb.append("    poblacion: ").append(toIndentedString(poblacion)).append("\n");
    sb.append("    idDivisa: ").append(toIndentedString(idDivisa)).append("\n");
    sb.append("    estatusActivo: ").append(toIndentedString(estatusActivo)).append("\n");
    sb.append("    nombreBanco: ").append(toIndentedString(nombreBanco)).append("\n");
    sb.append("    idTercero: ").append(toIndentedString(idTercero)).append("\n");
    sb.append("    tranNombrePersona: ").append(toIndentedString(tranNombrePersona)).append("\n");
    sb.append("    direccion: ").append(toIndentedString(direccion)).append("\n");
    sb.append("    colonia: ").append(toIndentedString(colonia)).append("\n");
    sb.append("    idPaisB: ").append(toIndentedString(idPaisB)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
    sb.append("    correoElectronico: ").append(toIndentedString(correoElectronico)).append("\n");
    sb.append("    orden: ").append(toIndentedString(orden)).append("\n");
    sb.append("    bancoInternacional: ").append(toIndentedString(bancoInternacional)).append("\n");
    sb.append("    tranTipoDivisa: ").append(toIndentedString(tranTipoDivisa)).append("\n");
    sb.append("    identificador: ").append(toIndentedString(identificador)).append("\n");
    sb.append("    tranNombreTitular: ").append(toIndentedString(tranNombreTitular)).append("\n");
    sb.append("    tranFechaCreacion: ").append(toIndentedString(tranFechaCreacion)).append("\n");
    sb.append("    fechaCapturo: ").append(toIndentedString(fechaCapturo)).append("\n");
    sb.append("    tranFechaAplicacion: ").append(toIndentedString(tranFechaAplicacion)).append("\n");
    sb.append("    usuarioCapturo: ").append(toIndentedString(usuarioCapturo)).append("\n");
    sb.append("    usuarioEjecuto: ").append(toIndentedString(usuarioEjecuto)).append("\n");
    sb.append("    estatus: ").append(toIndentedString(estatus)).append("\n");
    sb.append("    confirmacion: ").append(toIndentedString(confirmacion)).append("\n");
    sb.append("    autorizadores: ").append(toIndentedString(autorizadores)).append("\n");
    sb.append("    rfc: ").append(toIndentedString(rfc)).append("\n");
    sb.append("    abaswift: ").append(toIndentedString(abaswift)).append("\n");
    sb.append("    rfcordenante: ").append(toIndentedString(rfcordenante)).append("\n");
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
