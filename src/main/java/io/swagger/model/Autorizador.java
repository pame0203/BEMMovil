package io.swagger.model;




import io.swagger.annotations.*;
import java.util.Objects;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonValue;


public class Autorizador   {
  
  private Integer idAutorizador = null;
  private String nombreAutorizador = null;
  private String fechaAutorizacion = null;

  /**
   **/
  public Autorizador idAutorizador(Integer idAutorizador) {
    this.idAutorizador = idAutorizador;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Integer getIdAutorizador() {
    return idAutorizador;
  }
  public void setIdAutorizador(Integer idAutorizador) {
    this.idAutorizador = idAutorizador;
  }

  /**
   **/
  public Autorizador nombreAutorizador(String nombreAutorizador) {
    this.nombreAutorizador = nombreAutorizador;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getNombreAutorizador() {
    return nombreAutorizador;
  }
  public void setNombreAutorizador(String nombreAutorizador) {
    this.nombreAutorizador = nombreAutorizador;
  }

  /**
   **/
  public Autorizador fechaAutorizacion(String fechaAutorizacion) {
    this.fechaAutorizacion = fechaAutorizacion;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getFechaAutorizacion() {
    return fechaAutorizacion;
  }
  public void setFechaAutorizacion(String fechaAutorizacion) {
    this.fechaAutorizacion = fechaAutorizacion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Autorizador autorizador = (Autorizador) o;
    return Objects.equals(idAutorizador, autorizador.idAutorizador) &&
        Objects.equals(nombreAutorizador, autorizador.nombreAutorizador) &&
        Objects.equals(fechaAutorizacion, autorizador.fechaAutorizacion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idAutorizador, nombreAutorizador, fechaAutorizacion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Autorizador {\n");
    
    sb.append("    idAutorizador: ").append(toIndentedString(idAutorizador)).append("\n");
    sb.append("    nombreAutorizador: ").append(toIndentedString(nombreAutorizador)).append("\n");
    sb.append("    fechaAutorizacion: ").append(toIndentedString(fechaAutorizacion)).append("\n");
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
	object.add("idAutorizador", getIdAutorizador())
		.add("nombreAutorizador", getNombreAutorizador())
		.add("fechaAutorizacion", getFechaAutorizacion());
	return object.build();
  }
}
