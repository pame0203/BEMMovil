package io.swagger.model;

import io.swagger.model.AutorizadorType;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class ConsultaAutorizacionesServiciosType   {
  
  private Long id = null;
  private Long idCuenta = null;
  private Long idFacturador = null;
  private String facturador = null;
  private String r1 = null;
  private String r2 = null;
  private String r3 = null;
  private String r4 = null;
  private String r5 = null;
  private String r6 = null;
  private Long idUsuarioCaptura = null;
  private Long idUsuarioEjecuta = null;
  private Long idUsuarioCoejecuta = null;
  private String tipoCambio = null;
  private String tipoCambioB = null;
  private String confirmacion = null;
  private javax.xml.datatype.XMLGregorianCalendar fecha = null;
  private javax.xml.datatype.XMLGregorianCalendar fechaEjecucion = null;
  private String usuarioCaptura = null;
  private String usuarioEjecuta = null;
  private String usuarioCoejecuta = null;
  private javax.xml.datatype.XMLGregorianCalendar fechaCoejecucion = null;
  private String divisaFacturador = null;
  private Float comision = null;
  private Float descuento = null;
  private Float montoTotal = null;
  private Long estatus = null;
  private String tranNumeroCuenta = null;
  private List<AutorizadorType> autorizadores = new ArrayList<AutorizadorType>();
  private String rfc = null;
  private String iva = null;

  /**
   **/
  public ConsultaAutorizacionesServiciosType id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  public ConsultaAutorizacionesServiciosType idCuenta(Long idCuenta) {
    this.idCuenta = idCuenta;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getIdCuenta() {
    return idCuenta;
  }
  public void setIdCuenta(Long idCuenta) {
    this.idCuenta = idCuenta;
  }

  /**
   **/
  public ConsultaAutorizacionesServiciosType idFacturador(Long idFacturador) {
    this.idFacturador = idFacturador;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getIdFacturador() {
    return idFacturador;
  }
  public void setIdFacturador(Long idFacturador) {
    this.idFacturador = idFacturador;
  }

  /**
   **/
  public ConsultaAutorizacionesServiciosType facturador(String facturador) {
    this.facturador = facturador;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getFacturador() {
    return facturador;
  }
  public void setFacturador(String facturador) {
    this.facturador = facturador;
  }

  /**
   **/
  public ConsultaAutorizacionesServiciosType r1(String r1) {
    this.r1 = r1;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getR1() {
    return r1;
  }
  public void setR1(String r1) {
    this.r1 = r1;
  }

  /**
   **/
  public ConsultaAutorizacionesServiciosType r2(String r2) {
    this.r2 = r2;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getR2() {
    return r2;
  }
  public void setR2(String r2) {
    this.r2 = r2;
  }

  /**
   **/
  public ConsultaAutorizacionesServiciosType r3(String r3) {
    this.r3 = r3;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getR3() {
    return r3;
  }
  public void setR3(String r3) {
    this.r3 = r3;
  }

  /**
   **/
  public ConsultaAutorizacionesServiciosType r4(String r4) {
    this.r4 = r4;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getR4() {
    return r4;
  }
  public void setR4(String r4) {
    this.r4 = r4;
  }

  /**
   **/
  public ConsultaAutorizacionesServiciosType r5(String r5) {
    this.r5 = r5;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getR5() {
    return r5;
  }
  public void setR5(String r5) {
    this.r5 = r5;
  }

  /**
   **/
  public ConsultaAutorizacionesServiciosType r6(String r6) {
    this.r6 = r6;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getR6() {
    return r6;
  }
  public void setR6(String r6) {
    this.r6 = r6;
  }

  /**
   **/
  public ConsultaAutorizacionesServiciosType idUsuarioCaptura(Long idUsuarioCaptura) {
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
  public ConsultaAutorizacionesServiciosType idUsuarioEjecuta(Long idUsuarioEjecuta) {
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
  public ConsultaAutorizacionesServiciosType idUsuarioCoejecuta(Long idUsuarioCoejecuta) {
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
  public ConsultaAutorizacionesServiciosType tipoCambio(String tipoCambio) {
    this.tipoCambio = tipoCambio;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTipoCambio() {
    return tipoCambio;
  }
  public void setTipoCambio(String tipoCambio) {
    this.tipoCambio = tipoCambio;
  }

  /**
   **/
  public ConsultaAutorizacionesServiciosType tipoCambioB(String tipoCambioB) {
    this.tipoCambioB = tipoCambioB;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTipoCambioB() {
    return tipoCambioB;
  }
  public void setTipoCambioB(String tipoCambioB) {
    this.tipoCambioB = tipoCambioB;
  }

  /**
   **/
  public ConsultaAutorizacionesServiciosType confirmacion(String confirmacion) {
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
  public ConsultaAutorizacionesServiciosType fecha(javax.xml.datatype.XMLGregorianCalendar fecha) {
    this.fecha = fecha;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public javax.xml.datatype.XMLGregorianCalendar getFecha() {
    return fecha;
  }
  public void setFecha(javax.xml.datatype.XMLGregorianCalendar fecha) {
    this.fecha = fecha;
  }

  /**
   **/
  public ConsultaAutorizacionesServiciosType fechaEjecucion(javax.xml.datatype.XMLGregorianCalendar fechaEjecucion) {
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
  public ConsultaAutorizacionesServiciosType usuarioCaptura(String usuarioCaptura) {
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
  public ConsultaAutorizacionesServiciosType usuarioEjecuta(String usuarioEjecuta) {
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
  public ConsultaAutorizacionesServiciosType usuarioCoejecuta(String usuarioCoejecuta) {
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
  public ConsultaAutorizacionesServiciosType fechaCoejecucion(javax.xml.datatype.XMLGregorianCalendar fechaCoejecucion) {
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
  public ConsultaAutorizacionesServiciosType divisaFacturador(String divisaFacturador) {
    this.divisaFacturador = divisaFacturador;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getDivisaFacturador() {
    return divisaFacturador;
  }
  public void setDivisaFacturador(String divisaFacturador) {
    this.divisaFacturador = divisaFacturador;
  }

  /**
   **/
  public ConsultaAutorizacionesServiciosType comision(Float comision) {
    this.comision = comision;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Float getComision() {
    return comision;
  }
  public void setComision(Float comision) {
    this.comision = comision;
  }

  /**
   **/
  public ConsultaAutorizacionesServiciosType descuento(Float descuento) {
    this.descuento = descuento;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Float getDescuento() {
    return descuento;
  }
  public void setDescuento(Float descuento) {
    this.descuento = descuento;
  }

  /**
   **/
  public ConsultaAutorizacionesServiciosType montoTotal(Float montoTotal) {
    this.montoTotal = montoTotal;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Float getMontoTotal() {
    return montoTotal;
  }
  public void setMontoTotal(Float montoTotal) {
    this.montoTotal = montoTotal;
  }

  /**
   **/
  public ConsultaAutorizacionesServiciosType estatus(Long estatus) {
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
  public ConsultaAutorizacionesServiciosType tranNumeroCuenta(String tranNumeroCuenta) {
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
  public ConsultaAutorizacionesServiciosType autorizadores(List<AutorizadorType> autorizadores) {
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
  public ConsultaAutorizacionesServiciosType rfc(String rfc) {
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
  public ConsultaAutorizacionesServiciosType iva(String iva) {
    this.iva = iva;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getIva() {
    return iva;
  }
  public void setIva(String iva) {
    this.iva = iva;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaAutorizacionesServiciosType consultaAutorizacionesServiciosType = (ConsultaAutorizacionesServiciosType) o;
    return Objects.equals(id, consultaAutorizacionesServiciosType.id) &&
        Objects.equals(idCuenta, consultaAutorizacionesServiciosType.idCuenta) &&
        Objects.equals(idFacturador, consultaAutorizacionesServiciosType.idFacturador) &&
        Objects.equals(facturador, consultaAutorizacionesServiciosType.facturador) &&
        Objects.equals(r1, consultaAutorizacionesServiciosType.r1) &&
        Objects.equals(r2, consultaAutorizacionesServiciosType.r2) &&
        Objects.equals(r3, consultaAutorizacionesServiciosType.r3) &&
        Objects.equals(r4, consultaAutorizacionesServiciosType.r4) &&
        Objects.equals(r5, consultaAutorizacionesServiciosType.r5) &&
        Objects.equals(r6, consultaAutorizacionesServiciosType.r6) &&
        Objects.equals(idUsuarioCaptura, consultaAutorizacionesServiciosType.idUsuarioCaptura) &&
        Objects.equals(idUsuarioEjecuta, consultaAutorizacionesServiciosType.idUsuarioEjecuta) &&
        Objects.equals(idUsuarioCoejecuta, consultaAutorizacionesServiciosType.idUsuarioCoejecuta) &&
        Objects.equals(tipoCambio, consultaAutorizacionesServiciosType.tipoCambio) &&
        Objects.equals(tipoCambioB, consultaAutorizacionesServiciosType.tipoCambioB) &&
        Objects.equals(confirmacion, consultaAutorizacionesServiciosType.confirmacion) &&
        Objects.equals(fecha, consultaAutorizacionesServiciosType.fecha) &&
        Objects.equals(fechaEjecucion, consultaAutorizacionesServiciosType.fechaEjecucion) &&
        Objects.equals(usuarioCaptura, consultaAutorizacionesServiciosType.usuarioCaptura) &&
        Objects.equals(usuarioEjecuta, consultaAutorizacionesServiciosType.usuarioEjecuta) &&
        Objects.equals(usuarioCoejecuta, consultaAutorizacionesServiciosType.usuarioCoejecuta) &&
        Objects.equals(fechaCoejecucion, consultaAutorizacionesServiciosType.fechaCoejecucion) &&
        Objects.equals(divisaFacturador, consultaAutorizacionesServiciosType.divisaFacturador) &&
        Objects.equals(comision, consultaAutorizacionesServiciosType.comision) &&
        Objects.equals(descuento, consultaAutorizacionesServiciosType.descuento) &&
        Objects.equals(montoTotal, consultaAutorizacionesServiciosType.montoTotal) &&
        Objects.equals(estatus, consultaAutorizacionesServiciosType.estatus) &&
        Objects.equals(tranNumeroCuenta, consultaAutorizacionesServiciosType.tranNumeroCuenta) &&
        Objects.equals(autorizadores, consultaAutorizacionesServiciosType.autorizadores) &&
        Objects.equals(rfc, consultaAutorizacionesServiciosType.rfc) &&
        Objects.equals(iva, consultaAutorizacionesServiciosType.iva);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idCuenta, idFacturador, facturador, r1, r2, r3, r4, r5, r6, idUsuarioCaptura, idUsuarioEjecuta, idUsuarioCoejecuta, tipoCambio, tipoCambioB, confirmacion, fecha, fechaEjecucion, usuarioCaptura, usuarioEjecuta, usuarioCoejecuta, fechaCoejecucion, divisaFacturador, comision, descuento, montoTotal, estatus, tranNumeroCuenta, autorizadores, rfc, iva);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaAutorizacionesServiciosType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idCuenta: ").append(toIndentedString(idCuenta)).append("\n");
    sb.append("    idFacturador: ").append(toIndentedString(idFacturador)).append("\n");
    sb.append("    facturador: ").append(toIndentedString(facturador)).append("\n");
    sb.append("    r1: ").append(toIndentedString(r1)).append("\n");
    sb.append("    r2: ").append(toIndentedString(r2)).append("\n");
    sb.append("    r3: ").append(toIndentedString(r3)).append("\n");
    sb.append("    r4: ").append(toIndentedString(r4)).append("\n");
    sb.append("    r5: ").append(toIndentedString(r5)).append("\n");
    sb.append("    r6: ").append(toIndentedString(r6)).append("\n");
    sb.append("    idUsuarioCaptura: ").append(toIndentedString(idUsuarioCaptura)).append("\n");
    sb.append("    idUsuarioEjecuta: ").append(toIndentedString(idUsuarioEjecuta)).append("\n");
    sb.append("    idUsuarioCoejecuta: ").append(toIndentedString(idUsuarioCoejecuta)).append("\n");
    sb.append("    tipoCambio: ").append(toIndentedString(tipoCambio)).append("\n");
    sb.append("    tipoCambioB: ").append(toIndentedString(tipoCambioB)).append("\n");
    sb.append("    confirmacion: ").append(toIndentedString(confirmacion)).append("\n");
    sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
    sb.append("    fechaEjecucion: ").append(toIndentedString(fechaEjecucion)).append("\n");
    sb.append("    usuarioCaptura: ").append(toIndentedString(usuarioCaptura)).append("\n");
    sb.append("    usuarioEjecuta: ").append(toIndentedString(usuarioEjecuta)).append("\n");
    sb.append("    usuarioCoejecuta: ").append(toIndentedString(usuarioCoejecuta)).append("\n");
    sb.append("    fechaCoejecucion: ").append(toIndentedString(fechaCoejecucion)).append("\n");
    sb.append("    divisaFacturador: ").append(toIndentedString(divisaFacturador)).append("\n");
    sb.append("    comision: ").append(toIndentedString(comision)).append("\n");
    sb.append("    descuento: ").append(toIndentedString(descuento)).append("\n");
    sb.append("    montoTotal: ").append(toIndentedString(montoTotal)).append("\n");
    sb.append("    estatus: ").append(toIndentedString(estatus)).append("\n");
    sb.append("    tranNumeroCuenta: ").append(toIndentedString(tranNumeroCuenta)).append("\n");
    sb.append("    autorizadores: ").append(toIndentedString(autorizadores)).append("\n");
    sb.append("    rfc: ").append(toIndentedString(rfc)).append("\n");
    sb.append("    iva: ").append(toIndentedString(iva)).append("\n");
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
