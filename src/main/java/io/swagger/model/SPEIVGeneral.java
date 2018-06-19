package io.swagger.model;




import io.swagger.annotations.*;
import java.util.Objects;


public class SPEIVGeneral   {
  
  private String conceptoPago = null;
  private String montoTotal = null;
  private String nombreBeneficiario = null;
  private String fechaAplicacion = null;
  private String fechaAcordeon = null;

  /**
   **/
  public SPEIVGeneral conceptoPago(String conceptoPago) {
    this.conceptoPago = conceptoPago;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getConceptoPago() {
    return conceptoPago;
  }
  public void setConceptoPago(String conceptoPago) {
    this.conceptoPago = conceptoPago;
  }

  /**
   **/
  public SPEIVGeneral montoTotal(String montoTotal) {
    this.montoTotal = montoTotal;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getMontoTotal() {
    return montoTotal;
  }
  public void setMontoTotal(String montoTotal) {
    this.montoTotal = montoTotal;
  }

  /**
   **/
  public SPEIVGeneral nombreBeneficiario(String nombreBeneficiario) {
    this.nombreBeneficiario = nombreBeneficiario;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getNombreBeneficiario() {
    return nombreBeneficiario;
  }
  public void setNombreBeneficiario(String nombreBeneficiario) {
    this.nombreBeneficiario = nombreBeneficiario;
  }

  /**
   **/
  public SPEIVGeneral fechaAplicacion(String fechaAplicacion) {
    this.fechaAplicacion = fechaAplicacion;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getFechaAplicacion() {
    return fechaAplicacion;
  }
  public void setFechaAplicacion(String fechaAplicacion) {
    this.fechaAplicacion = fechaAplicacion;
  }

  /**
   **/
  public SPEIVGeneral fechaAcordeon(String fechaAcordeon) {
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
    SPEIVGeneral sPEIVGeneral = (SPEIVGeneral) o;
    return Objects.equals(conceptoPago, sPEIVGeneral.conceptoPago) &&
        Objects.equals(montoTotal, sPEIVGeneral.montoTotal) &&
        Objects.equals(nombreBeneficiario, sPEIVGeneral.nombreBeneficiario) &&
        Objects.equals(fechaAplicacion, sPEIVGeneral.fechaAplicacion) &&
        Objects.equals(fechaAcordeon, sPEIVGeneral.fechaAcordeon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conceptoPago, montoTotal, nombreBeneficiario, fechaAplicacion, fechaAcordeon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SPEIVGeneral {\n");
    
    sb.append("    conceptoPago: ").append(toIndentedString(conceptoPago)).append("\n");
    sb.append("    montoTotal: ").append(toIndentedString(montoTotal)).append("\n");
    sb.append("    nombreBeneficiario: ").append(toIndentedString(nombreBeneficiario)).append("\n");
    sb.append("    fechaAplicacion: ").append(toIndentedString(fechaAplicacion)).append("\n");
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
