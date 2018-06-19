package io.swagger.model;

import io.swagger.model.Cuenta;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonValue;


public class TipoCuenta   {
  
  private List<Cuenta> cuentas = new ArrayList<Cuenta>();
  private Double saldoTipoCuentaMXN = null;
  private Double saldoTipoCuentaUSD = null;
  private String idTipoCuenta = null;
  
  

  public TipoCuenta(List<Cuenta> cuentas, Double saldoTipoCuentaMXN, Double saldoTipoCuentaUSD, String idTipoCuenta) {
	super();
	this.cuentas = cuentas;
	this.saldoTipoCuentaMXN = saldoTipoCuentaMXN;
	this.saldoTipoCuentaUSD = saldoTipoCuentaUSD;
	this.idTipoCuenta = idTipoCuenta;
}


/**
   **/
  public TipoCuenta cuentas(List<Cuenta> cuentas) {
    this.cuentas = cuentas;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<Cuenta> getCuentas() {
    return cuentas;
  }
  public void setCuentas(List<Cuenta> cuentas) {
    this.cuentas = cuentas;
  }

  /**
   **/
  public TipoCuenta saldoTipoCuentaMXN(Double saldoTipoCuentaMXN) {
    this.saldoTipoCuentaMXN = saldoTipoCuentaMXN;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Double getSaldoTipoCuentaMXN() {
    return saldoTipoCuentaMXN;
  }
  public void setSaldoTipoCuentaMXN(Double saldoTipoCuentaMXN) {
    this.saldoTipoCuentaMXN = saldoTipoCuentaMXN;
  }

  /**
   **/
  public TipoCuenta saldoTipoCuentaUSD(Double saldoTipoCuentaUSD) {
    this.saldoTipoCuentaUSD = saldoTipoCuentaUSD;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Double getSaldoTipoCuentaUSD() {
    return saldoTipoCuentaUSD;
  }
  public void setSaldoTipoCuentaUSD(Double saldoTipoCuentaUSD) {
    this.saldoTipoCuentaUSD = saldoTipoCuentaUSD;
  }

  /**
   **/
  public TipoCuenta idTipoCuenta(String idTipoCuenta) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TipoCuenta tipoCuenta = (TipoCuenta) o;
    return Objects.equals(cuentas, tipoCuenta.cuentas) &&
        Objects.equals(saldoTipoCuentaMXN, tipoCuenta.saldoTipoCuentaMXN) &&
        Objects.equals(saldoTipoCuentaUSD, tipoCuenta.saldoTipoCuentaUSD) &&
        Objects.equals(idTipoCuenta, tipoCuenta.idTipoCuenta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cuentas, saldoTipoCuentaMXN, saldoTipoCuentaUSD, idTipoCuenta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoCuenta {\n");
    
    sb.append("    cuentas: ").append(toIndentedString(cuentas)).append("\n");
    sb.append("    saldoTipoCuentaMXN: ").append(toIndentedString(saldoTipoCuentaMXN)).append("\n");
    sb.append("    saldoTipoCuentaUSD: ").append(toIndentedString(saldoTipoCuentaUSD)).append("\n");
    sb.append("    idTipoCuenta: ").append(toIndentedString(idTipoCuenta)).append("\n");
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
	if(getCuentas() != null){
		JsonArrayBuilder cuentas = Json.createArrayBuilder();

		for(Cuenta cuenta : getCuentas()){
			cuentas.add(cuenta.toJsonObject());
		}		
		object.add("cuentas", cuentas.build());
	}else{
		object.add("cuentas", JsonValue.NULL);
	}
	object.add("saldoTipoCuentaMXN", getSaldoTipoCuentaMXN())
		.add("saldoTipoCuentaUSD", getSaldoTipoCuentaUSD())
		.add("idTipoCuenta", getIdTipoCuenta());
	return object.build();
  }
}
