package io.swagger.model;




import io.swagger.annotations.*;
import java.util.Objects;


public class TransferenciaVGeneral   {
  
  private String conceptoPago = null;
  private String montoTotal = null;
  private String nombreBeneficiario = null;
  private String fechaAplicacion = null;
  private String fechaAcordeon = null;

  /**
   **/
  public TransferenciaVGeneral conceptoPago(String conceptoPago) {
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
  public TransferenciaVGeneral montoTotal(String montoTotal) {
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
  public TransferenciaVGeneral nombreBeneficiario(String nombreBeneficiario) {
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
  public TransferenciaVGeneral fechaAplicacion(String fechaAplicacion) {
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
  public TransferenciaVGeneral fechaAcordeon(String fechaAcordeon) {
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
    TransferenciaVGeneral transferenciaVGeneral = (TransferenciaVGeneral) o;
    return Objects.equals(conceptoPago, transferenciaVGeneral.conceptoPago) &&
        Objects.equals(montoTotal, transferenciaVGeneral.montoTotal) &&
        Objects.equals(nombreBeneficiario, transferenciaVGeneral.nombreBeneficiario) &&
        Objects.equals(fechaAplicacion, transferenciaVGeneral.fechaAplicacion) &&
        Objects.equals(fechaAcordeon, transferenciaVGeneral.fechaAcordeon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conceptoPago, montoTotal, nombreBeneficiario, fechaAplicacion, fechaAcordeon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferenciaVGeneral {\n");
    
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
