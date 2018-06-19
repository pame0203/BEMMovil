package io.swagger.model;




import io.swagger.annotations.*;
import java.util.Objects;


public class PagoServicioVGeneral   {
  
  private String nombreFacturador = null;
  private String codigoBarra = null;
  private String digitoVerificador = null;
  private String referenciaAMECE = null;
  private String importePagar = null;
  private String fecha = null;
  private String fechaAcordeon = null;

  /**
   **/
  public PagoServicioVGeneral nombreFacturador(String nombreFacturador) {
    this.nombreFacturador = nombreFacturador;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getNombreFacturador() {
    return nombreFacturador;
  }
  public void setNombreFacturador(String nombreFacturador) {
    this.nombreFacturador = nombreFacturador;
  }

  /**
   **/
  public PagoServicioVGeneral codigoBarra(String codigoBarra) {
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
  public PagoServicioVGeneral digitoVerificador(String digitoVerificador) {
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
  public PagoServicioVGeneral referenciaAMECE(String referenciaAMECE) {
    this.referenciaAMECE = referenciaAMECE;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getReferenciaAMECE() {
    return referenciaAMECE;
  }
  public void setReferenciaAMECE(String referenciaAMECE) {
    this.referenciaAMECE = referenciaAMECE;
  }

  /**
   **/
  public PagoServicioVGeneral importePagar(String importePagar) {
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

  /**
   **/
  public PagoServicioVGeneral fecha(String fecha) {
    this.fecha = fecha;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getFecha() {
    return fecha;
  }
  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  /**
   **/
  public PagoServicioVGeneral fechaAcordeon(String fechaAcordeon) {
    this.fechaAcordeon = fechaAcordeon;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getFechaAcordeon() {
    return fechaAcordeon;
  }
  public void setFechaAcordeon(String fechaAcordeon) {
    this.fechaAcordeon = fechaAcordeon;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagoServicioVGeneral pagoServicioVGeneral = (PagoServicioVGeneral) o;
    return Objects.equals(nombreFacturador, pagoServicioVGeneral.nombreFacturador) &&
        Objects.equals(codigoBarra, pagoServicioVGeneral.codigoBarra) &&
        Objects.equals(digitoVerificador, pagoServicioVGeneral.digitoVerificador) &&
        Objects.equals(referenciaAMECE, pagoServicioVGeneral.referenciaAMECE) &&
        Objects.equals(importePagar, pagoServicioVGeneral.importePagar) &&
        Objects.equals(fecha, pagoServicioVGeneral.fecha) &&
        Objects.equals(fechaAcordeon, pagoServicioVGeneral.fechaAcordeon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombreFacturador, codigoBarra, digitoVerificador, referenciaAMECE, importePagar, fecha, fechaAcordeon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagoServicioVGeneral {\n");
    
    sb.append("    nombreFacturador: ").append(toIndentedString(nombreFacturador)).append("\n");
    sb.append("    codigoBarra: ").append(toIndentedString(codigoBarra)).append("\n");
    sb.append("    digitoVerificador: ").append(toIndentedString(digitoVerificador)).append("\n");
    sb.append("    referenciaAMECE: ").append(toIndentedString(referenciaAMECE)).append("\n");
    sb.append("    importePagar: ").append(toIndentedString(importePagar)).append("\n");
    sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
    sb.append("    fechaAcordeon: ").append(toIndentedString(fechaAcordeon)).append("\n");
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
