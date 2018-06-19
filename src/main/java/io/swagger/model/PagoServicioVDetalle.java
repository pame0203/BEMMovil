package io.swagger.model;




import io.swagger.annotations.*;
import java.util.Objects;


public class PagoServicioVDetalle   {
  
  private String tipoTransaccion = null;
  private String cuentaOrigen = null;
  private String razonSocial = null;
  private String facturadorServicio = null;
  private String codigoBarra = null;
  private String digitoVerificador = null;
  private String numeroFacturador = null;
  private String telefonoFacturador = null;
  private String importeCargo = null;
  private String comision = null;
  private String ivaComision = null;
  private String claveRastreo = null;
  private String fechaVencimiento = null;
  private String referencia1 = null;
  private String referencia1AMECE = null;
  private String referencia2 = null;
  private String referencia3 = null;
  private String referencia4 = null;
  private String referencia5 = null;
  private String referencia6 = null;
  private String importePagar = null;

  /**
   **/
  public PagoServicioVDetalle tipoTransaccion(String tipoTransaccion) {
    this.tipoTransaccion = tipoTransaccion;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTipoTransaccion() {
    return tipoTransaccion;
  }
  public void setTipoTransaccion(String tipoTransaccion) {
    this.tipoTransaccion = tipoTransaccion;
  }

  /**
   **/
  public PagoServicioVDetalle cuentaOrigen(String cuentaOrigen) {
    this.cuentaOrigen = cuentaOrigen;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getCuentaOrigen() {
    return cuentaOrigen;
  }
  public void setCuentaOrigen(String cuentaOrigen) {
    this.cuentaOrigen = cuentaOrigen;
  }

  /**
   **/
  public PagoServicioVDetalle razonSocial(String razonSocial) {
    this.razonSocial = razonSocial;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getRazonSocial() {
    return razonSocial;
  }
  public void setRazonSocial(String razonSocial) {
    this.razonSocial = razonSocial;
  }

  /**
   **/
  public PagoServicioVDetalle facturadorServicio(String facturadorServicio) {
    this.facturadorServicio = facturadorServicio;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getFacturadorServicio() {
    return facturadorServicio;
  }
  public void setFacturadorServicio(String facturadorServicio) {
    this.facturadorServicio = facturadorServicio;
  }

  /**
   **/
  public PagoServicioVDetalle codigoBarra(String codigoBarra) {
    this.codigoBarra = codigoBarra;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getCodigoBarra() {
    return codigoBarra;
  }
  public void setCodigoBarra(String codigoBarra) {
    this.codigoBarra = codigoBarra;
  }

  /**
   **/
  public PagoServicioVDetalle digitoVerificador(String digitoVerificador) {
    this.digitoVerificador = digitoVerificador;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getDigitoVerificador() {
    return digitoVerificador;
  }
  public void setDigitoVerificador(String digitoVerificador) {
    this.digitoVerificador = digitoVerificador;
  }

  /**
   **/
  public PagoServicioVDetalle numeroFacturador(String numeroFacturador) {
    this.numeroFacturador = numeroFacturador;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getNumeroFacturador() {
    return numeroFacturador;
  }
  public void setNumeroFacturador(String numeroFacturador) {
    this.numeroFacturador = numeroFacturador;
  }

  /**
   **/
  public PagoServicioVDetalle telefonoFacturador(String telefonoFacturador) {
    this.telefonoFacturador = telefonoFacturador;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTelefonoFacturador() {
    return telefonoFacturador;
  }
  public void setTelefonoFacturador(String telefonoFacturador) {
    this.telefonoFacturador = telefonoFacturador;
  }

  /**
   **/
  public PagoServicioVDetalle importeCargo(String importeCargo) {
    this.importeCargo = importeCargo;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getImporteCargo() {
    return importeCargo;
  }
  public void setImporteCargo(String importeCargo) {
    this.importeCargo = importeCargo;
  }

  /**
   **/
  public PagoServicioVDetalle comision(String comision) {
    this.comision = comision;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getComision() {
    return comision;
  }
  public void setComision(String comision) {
    this.comision = comision;
  }

  /**
   **/
  public PagoServicioVDetalle ivaComision(String ivaComision) {
    this.ivaComision = ivaComision;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getIvaComision() {
    return ivaComision;
  }
  public void setIvaComision(String ivaComision) {
    this.ivaComision = ivaComision;
  }

  /**
   **/
  public PagoServicioVDetalle claveRastreo(String claveRastreo) {
    this.claveRastreo = claveRastreo;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getClaveRastreo() {
    return claveRastreo;
  }
  public void setClaveRastreo(String claveRastreo) {
    this.claveRastreo = claveRastreo;
  }

  /**
   **/
  public PagoServicioVDetalle fechaVencimiento(String fechaVencimiento) {
    this.fechaVencimiento = fechaVencimiento;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getFechaVencimiento() {
    return fechaVencimiento;
  }
  public void setFechaVencimiento(String fechaVencimiento) {
    this.fechaVencimiento = fechaVencimiento;
  }

  /**
   **/
  public PagoServicioVDetalle referencia1(String referencia1) {
    this.referencia1 = referencia1;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getReferencia1() {
    return referencia1;
  }
  public void setReferencia1(String referencia1) {
    this.referencia1 = referencia1;
  }

  /**
   **/
  public PagoServicioVDetalle referencia1AMECE(String referencia1AMECE) {
    this.referencia1AMECE = referencia1AMECE;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getReferencia1AMECE() {
    return referencia1AMECE;
  }
  public void setReferencia1AMECE(String referencia1AMECE) {
    this.referencia1AMECE = referencia1AMECE;
  }

  /**
   **/
  public PagoServicioVDetalle referencia2(String referencia2) {
    this.referencia2 = referencia2;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getReferencia2() {
    return referencia2;
  }
  public void setReferencia2(String referencia2) {
    this.referencia2 = referencia2;
  }

  /**
   **/
  public PagoServicioVDetalle referencia3(String referencia3) {
    this.referencia3 = referencia3;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getReferencia3() {
    return referencia3;
  }
  public void setReferencia3(String referencia3) {
    this.referencia3 = referencia3;
  }

  /**
   **/
  public PagoServicioVDetalle referencia4(String referencia4) {
    this.referencia4 = referencia4;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getReferencia4() {
    return referencia4;
  }
  public void setReferencia4(String referencia4) {
    this.referencia4 = referencia4;
  }

  /**
   **/
  public PagoServicioVDetalle referencia5(String referencia5) {
    this.referencia5 = referencia5;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getReferencia5() {
    return referencia5;
  }
  public void setReferencia5(String referencia5) {
    this.referencia5 = referencia5;
  }

  /**
   **/
  public PagoServicioVDetalle referencia6(String referencia6) {
    this.referencia6 = referencia6;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getReferencia6() {
    return referencia6;
  }
  public void setReferencia6(String referencia6) {
    this.referencia6 = referencia6;
  }

  /**
   **/
  public PagoServicioVDetalle importePagar(String importePagar) {
    this.importePagar = importePagar;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getImportePagar() {
    return importePagar;
  }
  public void setImportePagar(String importePagar) {
    this.importePagar = importePagar;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagoServicioVDetalle pagoServicioVDetalle = (PagoServicioVDetalle) o;
    return Objects.equals(tipoTransaccion, pagoServicioVDetalle.tipoTransaccion) &&
        Objects.equals(cuentaOrigen, pagoServicioVDetalle.cuentaOrigen) &&
        Objects.equals(razonSocial, pagoServicioVDetalle.razonSocial) &&
        Objects.equals(facturadorServicio, pagoServicioVDetalle.facturadorServicio) &&
        Objects.equals(codigoBarra, pagoServicioVDetalle.codigoBarra) &&
        Objects.equals(digitoVerificador, pagoServicioVDetalle.digitoVerificador) &&
        Objects.equals(numeroFacturador, pagoServicioVDetalle.numeroFacturador) &&
        Objects.equals(telefonoFacturador, pagoServicioVDetalle.telefonoFacturador) &&
        Objects.equals(importeCargo, pagoServicioVDetalle.importeCargo) &&
        Objects.equals(comision, pagoServicioVDetalle.comision) &&
        Objects.equals(ivaComision, pagoServicioVDetalle.ivaComision) &&
        Objects.equals(claveRastreo, pagoServicioVDetalle.claveRastreo) &&
        Objects.equals(fechaVencimiento, pagoServicioVDetalle.fechaVencimiento) &&
        Objects.equals(referencia1, pagoServicioVDetalle.referencia1) &&
        Objects.equals(referencia1AMECE, pagoServicioVDetalle.referencia1AMECE) &&
        Objects.equals(referencia2, pagoServicioVDetalle.referencia2) &&
        Objects.equals(referencia3, pagoServicioVDetalle.referencia3) &&
        Objects.equals(referencia4, pagoServicioVDetalle.referencia4) &&
        Objects.equals(referencia5, pagoServicioVDetalle.referencia5) &&
        Objects.equals(referencia6, pagoServicioVDetalle.referencia6) &&
        Objects.equals(importePagar, pagoServicioVDetalle.importePagar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoTransaccion, cuentaOrigen, razonSocial, facturadorServicio, codigoBarra, digitoVerificador, numeroFacturador, telefonoFacturador, importeCargo, comision, ivaComision, claveRastreo, fechaVencimiento, referencia1, referencia1AMECE, referencia2, referencia3, referencia4, referencia5, referencia6, importePagar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagoServicioVDetalle {\n");
    
    sb.append("    tipoTransaccion: ").append(toIndentedString(tipoTransaccion)).append("\n");
    sb.append("    cuentaOrigen: ").append(toIndentedString(cuentaOrigen)).append("\n");
    sb.append("    razonSocial: ").append(toIndentedString(razonSocial)).append("\n");
    sb.append("    facturadorServicio: ").append(toIndentedString(facturadorServicio)).append("\n");
    sb.append("    codigoBarra: ").append(toIndentedString(codigoBarra)).append("\n");
    sb.append("    digitoVerificador: ").append(toIndentedString(digitoVerificador)).append("\n");
    sb.append("    numeroFacturador: ").append(toIndentedString(numeroFacturador)).append("\n");
    sb.append("    telefonoFacturador: ").append(toIndentedString(telefonoFacturador)).append("\n");
    sb.append("    importeCargo: ").append(toIndentedString(importeCargo)).append("\n");
    sb.append("    comision: ").append(toIndentedString(comision)).append("\n");
    sb.append("    ivaComision: ").append(toIndentedString(ivaComision)).append("\n");
    sb.append("    claveRastreo: ").append(toIndentedString(claveRastreo)).append("\n");
    sb.append("    fechaVencimiento: ").append(toIndentedString(fechaVencimiento)).append("\n");
    sb.append("    referencia1: ").append(toIndentedString(referencia1)).append("\n");
    sb.append("    referencia1AMECE: ").append(toIndentedString(referencia1AMECE)).append("\n");
    sb.append("    referencia2: ").append(toIndentedString(referencia2)).append("\n");
    sb.append("    referencia3: ").append(toIndentedString(referencia3)).append("\n");
    sb.append("    referencia4: ").append(toIndentedString(referencia4)).append("\n");
    sb.append("    referencia5: ").append(toIndentedString(referencia5)).append("\n");
    sb.append("    referencia6: ").append(toIndentedString(referencia6)).append("\n");
    sb.append("    importePagar: ").append(toIndentedString(importePagar)).append("\n");
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
