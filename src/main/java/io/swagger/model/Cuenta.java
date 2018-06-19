package io.swagger.model;




import io.swagger.annotations.*;
import java.util.Objects;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonValue;
import javax.xml.datatype.XMLGregorianCalendar;

public class Cuenta   {
  
  private String nombreCuenta = null;
  private String numeroCuenta = null;
  private String saldoDisponible = null;
  private String saldoActual = null;
  private String clabeCuenta = null;
  private String titularCuenta = null;
  private String divisaCuenta = null;
  private String idTipoCuenta = null;
  private String idProductoCuenta = null;
  private String descripcionProductoCuenta = null;
  private String idSubProductoCuenta = null;
  private String pagoMinimo = null;
  private String saldoCorte = null;
  private javax.xml.datatype.XMLGregorianCalendar fechaCorte = null;

  
  public Cuenta(String nombreCuenta, String numeroCuenta, String saldoDisponible, String saldoActual, String clabeCuenta,
		String titularCuenta, String divisaCuenta, String idTipoCuenta, String idProductoCuenta,
		String descripcionProductoCuenta, String idSubProductoCuenta, String pagoMinimo, String saldoCorte,
		XMLGregorianCalendar fechaCorte) {
	super();
	this.nombreCuenta = nombreCuenta;
	this.numeroCuenta = numeroCuenta;
	this.saldoDisponible = saldoDisponible;
	this.saldoActual = saldoActual;
	this.clabeCuenta = clabeCuenta;
	this.titularCuenta = titularCuenta;
	this.divisaCuenta = divisaCuenta;
	this.idTipoCuenta = idTipoCuenta;
	this.idProductoCuenta = idProductoCuenta;
	this.descripcionProductoCuenta = descripcionProductoCuenta;
	this.idSubProductoCuenta = idSubProductoCuenta;
	this.pagoMinimo = pagoMinimo;
	this.saldoCorte = saldoCorte;
	this.fechaCorte = fechaCorte;
}


/**
   **/
  public Cuenta nombreCuenta(String nombreCuenta) {
    this.nombreCuenta = nombreCuenta;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getNombreCuenta() {
    return nombreCuenta;
  }
  public void setNombreCuenta(String nombreCuenta) {
    this.nombreCuenta = nombreCuenta;
  }

  /**
   **/
  public Cuenta numeroCuenta(String numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getNumeroCuenta() {
    return numeroCuenta;
  }
  public void setNumeroCuenta(String numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
  }

  /**
   **/
  public Cuenta saldoDisponible(String saldoDisponible) {
    this.saldoDisponible = saldoDisponible;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getSaldoDisponible() {
    return saldoDisponible;
  }
  public void setSaldoDisponible(String saldoDisponible) {
    this.saldoDisponible = saldoDisponible;
  }

  /**
   **/
  public Cuenta saldoActual(String saldoActual) {
    this.saldoActual = saldoActual;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getSaldoActual() {
    return saldoActual;
  }
  public void setSaldoActual(String saldoActual) {
    this.saldoActual = saldoActual;
  }

  /**
   **/
  public Cuenta clabeCuenta(String clabeCuenta) {
    this.clabeCuenta = clabeCuenta;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getClabeCuenta() {
    return clabeCuenta;
  }
  public void setClabeCuenta(String clabeCuenta) {
    this.clabeCuenta = clabeCuenta;
  }

  /**
   **/
  public Cuenta titularCuenta(String titularCuenta) {
    this.titularCuenta = titularCuenta;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTitularCuenta() {
    return titularCuenta;
  }
  public void setTitularCuenta(String titularCuenta) {
    this.titularCuenta = titularCuenta;
  }

  /**
   **/
  public Cuenta divisaCuenta(String divisaCuenta) {
    this.divisaCuenta = divisaCuenta;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getDivisaCuenta() {
    return divisaCuenta;
  }
  public void setDivisaCuenta(String divisaCuenta) {
    this.divisaCuenta = divisaCuenta;
  }

  /**
   **/
  public Cuenta idTipoCuenta(String idTipoCuenta) {
    this.idTipoCuenta = idTipoCuenta;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getIdTipoCuenta() {
    return idTipoCuenta;
  }
  public void setIdTipoCuenta(String idTipoCuenta) {
    this.idTipoCuenta = idTipoCuenta;
  }

  /**
   **/
  public Cuenta idProductoCuenta(String idProductoCuenta) {
    this.idProductoCuenta = idProductoCuenta;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getIdProductoCuenta() {
    return idProductoCuenta;
  }
  public void setIdProductoCuenta(String idProductoCuenta) {
    this.idProductoCuenta = idProductoCuenta;
  }

  /**
   **/
  public Cuenta descripcionProductoCuenta(String descripcionProductoCuenta) {
    this.descripcionProductoCuenta = descripcionProductoCuenta;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getDescripcionProductoCuenta() {
    return descripcionProductoCuenta;
  }
  public void setDescripcionProductoCuenta(String descripcionProductoCuenta) {
    this.descripcionProductoCuenta = descripcionProductoCuenta;
  }

  /**
   **/
  public Cuenta idSubProductoCuenta(String idSubProductoCuenta) {
    this.idSubProductoCuenta = idSubProductoCuenta;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getIdSubProductoCuenta() {
    return idSubProductoCuenta;
  }
  public void setIdSubProductoCuenta(String idSubProductoCuenta) {
    this.idSubProductoCuenta = idSubProductoCuenta;
  }

  /**
   **/
  public Cuenta pagoMinimo(String pagoMinimo) {
    this.pagoMinimo = pagoMinimo;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getPagoMinimo() {
    return pagoMinimo;
  }
  public void setPagoMinimo(String pagoMinimo) {
    this.pagoMinimo = pagoMinimo;
  }

  /**
   **/
  public Cuenta saldoCorte(String saldoCorte) {
    this.saldoCorte = saldoCorte;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getSaldoCorte() {
    return saldoCorte;
  }
  public void setSaldoCorte(String saldoCorte) {
    this.saldoCorte = saldoCorte;
  }

  /**
   **/
  public Cuenta fechaCorte(javax.xml.datatype.XMLGregorianCalendar fechaCorte) {
    this.fechaCorte = fechaCorte;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public javax.xml.datatype.XMLGregorianCalendar getFechaCorte() {
    return fechaCorte;
  }
  public void setFechaCorte(javax.xml.datatype.XMLGregorianCalendar fechaCorte) {
    this.fechaCorte = fechaCorte;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cuenta cuenta = (Cuenta) o;
    return Objects.equals(nombreCuenta, cuenta.nombreCuenta) &&
        Objects.equals(numeroCuenta, cuenta.numeroCuenta) &&
        Objects.equals(saldoDisponible, cuenta.saldoDisponible) &&
        Objects.equals(saldoActual, cuenta.saldoActual) &&
        Objects.equals(clabeCuenta, cuenta.clabeCuenta) &&
        Objects.equals(titularCuenta, cuenta.titularCuenta) &&
        Objects.equals(divisaCuenta, cuenta.divisaCuenta) &&
        Objects.equals(idTipoCuenta, cuenta.idTipoCuenta) &&
        Objects.equals(idProductoCuenta, cuenta.idProductoCuenta) &&
        Objects.equals(descripcionProductoCuenta, cuenta.descripcionProductoCuenta) &&
        Objects.equals(idSubProductoCuenta, cuenta.idSubProductoCuenta) &&
        Objects.equals(pagoMinimo, cuenta.pagoMinimo) &&
        Objects.equals(saldoCorte, cuenta.saldoCorte) &&
        Objects.equals(fechaCorte, cuenta.fechaCorte);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombreCuenta, numeroCuenta, saldoDisponible, saldoActual, clabeCuenta, titularCuenta, divisaCuenta, idTipoCuenta, idProductoCuenta, descripcionProductoCuenta, idSubProductoCuenta, pagoMinimo, saldoCorte, fechaCorte);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cuenta {\n");
    
    sb.append("    nombreCuenta: ").append(toIndentedString(nombreCuenta)).append("\n");
    sb.append("    numeroCuenta: ").append(toIndentedString(numeroCuenta)).append("\n");
    sb.append("    saldoDisponible: ").append(toIndentedString(saldoDisponible)).append("\n");
    sb.append("    saldoActual: ").append(toIndentedString(saldoActual)).append("\n");
    sb.append("    clabeCuenta: ").append(toIndentedString(clabeCuenta)).append("\n");
    sb.append("    titularCuenta: ").append(toIndentedString(titularCuenta)).append("\n");
    sb.append("    divisaCuenta: ").append(toIndentedString(divisaCuenta)).append("\n");
    sb.append("    idTipoCuenta: ").append(toIndentedString(idTipoCuenta)).append("\n");
    sb.append("    idProductoCuenta: ").append(toIndentedString(idProductoCuenta)).append("\n");
    sb.append("    descripcionProductoCuenta: ").append(toIndentedString(descripcionProductoCuenta)).append("\n");
    sb.append("    idSubProductoCuenta: ").append(toIndentedString(idSubProductoCuenta)).append("\n");
    sb.append("    pagoMinimo: ").append(toIndentedString(pagoMinimo)).append("\n");
    sb.append("    saldoCorte: ").append(toIndentedString(saldoCorte)).append("\n");
    sb.append("    fechaCorte: ").append(toIndentedString(fechaCorte)).append("\n");
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
		object.add("nombreCuenta", getNombreCuenta()).add("numeroCuenta", getNumeroCuenta())
				.add("saldoDisponible", getSaldoDisponible()).add("saldoActual", getSaldoActual())
				.add("clabeCuenta", getClabeCuenta()).add("titularCuenta", getTitularCuenta())
				.add("divisaCuenta", getDivisaCuenta()).add("idTipoCuenta", getIdTipoCuenta())
				.add("idProductoCuenta", getIdProductoCuenta())
				.add("descripcionProductoCuenta", getDescripcionProductoCuenta())
				.add("idSubProductoCuenta", getIdSubProductoCuenta());
		if (getPagoMinimo() == null) {
			object.add("pagoMinimo", JsonValue.NULL);
		} else {
			object.add("pagoMinimo", getPagoMinimo());
		}
		if (getSaldoCorte() == null) {
			object.add("saldoCorte", JsonValue.NULL);
		} else {
			object.add("saldoCorte", getSaldoCorte());
		}
		if (getFechaCorte() == null) {
			object.add("fechaCorte", JsonValue.NULL);
		} else {
			object.add("fechaCorte", getFechaCorte().toString());
		}
		return object.build();
	}
  
}
