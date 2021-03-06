package io.swagger.model;




import io.swagger.annotations.*;
import java.util.Objects;


public class TEFVGeneral   {
  
  private String conceptoPago = null;
  private String montoTotal = null;
  private String nombreBeneficiario = null;
  private String fechaAplicacion = null;
  private String fechaAcordeon = null;

  /**
   **/
  public TEFVGeneral conceptoPago(String conceptoPago) {
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
  public TEFVGeneral montoTotal(String montoTotal) {
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
  public TEFVGeneral nombreBeneficiario(String nombreBeneficiario) {
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
  public TEFVGeneral fechaAplicacion(String fechaAplicacion) {
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
  public TEFVGeneral fechaAcordeon(String fechaAcordeon) {
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
    TEFVGeneral tEFVGeneral = (TEFVGeneral) o;
    return Objects.equals(conceptoPago, tEFVGeneral.conceptoPago) &&
        Objects.equals(montoTotal, tEFVGeneral.montoTotal) &&
        Objects.equals(nombreBeneficiario, tEFVGeneral.nombreBeneficiario) &&
        Objects.equals(fechaAplicacion, tEFVGeneral.fechaAplicacion) &&
        Objects.equals(fechaAcordeon, tEFVGeneral.fechaAcordeon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conceptoPago, montoTotal, nombreBeneficiario, fechaAplicacion, fechaAcordeon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TEFVGeneral {\n");
    
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
