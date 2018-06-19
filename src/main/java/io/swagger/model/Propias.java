package io.swagger.model;

import io.swagger.model.Autorizador;
import io.swagger.model.PropiasVDetalle;
import io.swagger.model.PropiasVGeneral;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonValue;


public class Propias   {
  
  private String idTransferencia = null;
  private List<Autorizador> autorizadores = new ArrayList<Autorizador>();
  private PropiasVGeneral vistaGeneral = null;
  private PropiasVDetalle vistaDetalle = null;
  private Boolean enEsperaAutorizacion = false;
  
  

  public Propias(String idTransferencia, List<Autorizador> autorizadores, PropiasVGeneral vistaGeneral,
		PropiasVDetalle vistaDetalle, Boolean enEsperaAutorizacion) {
	super();
	this.idTransferencia = idTransferencia;
	this.autorizadores = autorizadores;
	this.vistaGeneral = vistaGeneral;
	this.vistaDetalle = vistaDetalle;
	this.enEsperaAutorizacion = enEsperaAutorizacion;
}


/**
   **/
  public Propias idTransferencia(String idTransferencia) {
    this.idTransferencia = idTransferencia;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getIdTransferencia() {
    return idTransferencia;
  }
  public void setIdTransferencia(String idTransferencia) {
    this.idTransferencia = idTransferencia;
  }

  /**
   **/
  public Propias autorizadores(List<Autorizador> autorizadores) {
    this.autorizadores = autorizadores;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<Autorizador> getAutorizadores() {
    return autorizadores;
  }
  public void setAutorizadores(List<Autorizador> autorizadores) {
    this.autorizadores = autorizadores;
  }

  /**
   **/
  public Propias vistaGeneral(PropiasVGeneral vistaGeneral) {
    this.vistaGeneral = vistaGeneral;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public PropiasVGeneral getVistaGeneral() {
    return vistaGeneral;
  }
  public void setVistaGeneral(PropiasVGeneral vistaGeneral) {
    this.vistaGeneral = vistaGeneral;
  }

  /**
   **/
  public Propias vistaDetalle(PropiasVDetalle vistaDetalle) {
    this.vistaDetalle = vistaDetalle;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public PropiasVDetalle getVistaDetalle() {
    return vistaDetalle;
  }
  public void setVistaDetalle(PropiasVDetalle vistaDetalle) {
    this.vistaDetalle = vistaDetalle;
  }

  /**
   **/
  public Propias enEsperaAutorizacion(Boolean enEsperaAutorizacion) {
    this.enEsperaAutorizacion = enEsperaAutorizacion;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Boolean getEnEsperaAutorizacion() {
    return enEsperaAutorizacion;
  }
  public void setEnEsperaAutorizacion(Boolean enEsperaAutorizacion) {
    this.enEsperaAutorizacion = enEsperaAutorizacion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Propias propias = (Propias) o;
    return Objects.equals(idTransferencia, propias.idTransferencia) &&
        Objects.equals(autorizadores, propias.autorizadores) &&
        Objects.equals(vistaGeneral, propias.vistaGeneral) &&
        Objects.equals(vistaDetalle, propias.vistaDetalle) &&
        Objects.equals(enEsperaAutorizacion, propias.enEsperaAutorizacion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTransferencia, autorizadores, vistaGeneral, vistaDetalle, enEsperaAutorizacion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Propias {\n");
    
    sb.append("    idTransferencia: ").append(toIndentedString(idTransferencia)).append("\n");
    sb.append("    autorizadores: ").append(toIndentedString(autorizadores)).append("\n");
    sb.append("    vistaGeneral: ").append(toIndentedString(vistaGeneral)).append("\n");
    sb.append("    vistaDetalle: ").append(toIndentedString(vistaDetalle)).append("\n");
    sb.append("    enEsperaAutorizacion: ").append(toIndentedString(enEsperaAutorizacion)).append("\n");
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
	 
	 object.add("idTransferencia", getIdTransferencia());
	 
	 if(getAutorizadores() != null){
		 JsonArrayBuilder autorizadores = Json.createArrayBuilder();

		 for(Autorizador autorizador : getAutorizadores()){
			 autorizadores.add(autorizador.toJsonObject());
		 }		
		 object.add("autorizadores", autorizadores.build());
	}else{
		object.add("autorizadores", JsonValue.NULL);
	}
	 
	object.add("vistaGeneral", getVistaGeneral().toJsonObject())
		.add("vistaDetalle", getVistaDetalle().toJsonObject())
		.add("enEsperaAutorizacion", getEnEsperaAutorizacion());
	return object.build();
  }
}
