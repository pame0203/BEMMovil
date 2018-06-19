package io.swagger.model;




import io.swagger.annotations.*;
import java.util.Objects;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;


public class PropiasVGeneral   {
  
  private String conceptoPago = null;
  private String montoTotal = null;
  private String nombreBeneficiario = null;
  private String fechaAplicacion = null;
  private String fechaAcordeon = null;
  
  

  public PropiasVGeneral(String conceptoPago, String montoTotal, String nombreBeneficiario, String fechaAplicacion,
		String fechaAcordeon) {
	super();
	this.conceptoPago = conceptoPago;
	this.montoTotal = montoTotal;
	this.nombreBeneficiario = nombreBeneficiario;
	this.fechaAplicacion = fechaAplicacion;
	this.fechaAcordeon = fechaAcordeon;
}


/**
   **/
  public PropiasVGeneral conceptoPago(String conceptoPago) {
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
  public PropiasVGeneral montoTotal(String montoTotal) {
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
  public PropiasVGeneral nombreBeneficiario(String nombreBeneficiario) {
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
  public PropiasVGeneral fechaAplicacion(String fechaAplicacion) {
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
  public PropiasVGeneral fechaAcordeon(String fechaAcordeon) {
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
    PropiasVGeneral propiasVGeneral = (PropiasVGeneral) o;
    return Objects.equals(conceptoPago, propiasVGeneral.conceptoPago) &&
        Objects.equals(montoTotal, propiasVGeneral.montoTotal) &&
        Objects.equals(nombreBeneficiario, propiasVGeneral.nombreBeneficiario) &&
        Objects.equals(fechaAplicacion, propiasVGeneral.fechaAplicacion) &&
        Objects.equals(fechaAcordeon, propiasVGeneral.fechaAcordeon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conceptoPago, montoTotal, nombreBeneficiario, fechaAplicacion, fechaAcordeon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropiasVGeneral {\n");
    
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
  
  public JsonObject toJsonObject() {
	JsonObjectBuilder object = Json.createObjectBuilder();
	object.add("conceptoPago", getConceptoPago())
		.add("montoTotal", getMontoTotal())
		.add("nombreBeneficiario", getNombreBeneficiario())
		.add("fechaAplicacion", getFechaAplicacion())
		.add("fechaAcordeon", getFechaAcordeon());
	return object.build();
  }
}
