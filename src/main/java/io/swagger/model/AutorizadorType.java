package io.swagger.model;




import io.swagger.annotations.*;
import java.util.Objects;


public class AutorizadorType   {
  
  private String tranIdUsuarioOperativo = null;
  private javax.xml.datatype.XMLGregorianCalendar fechaAutorizacion = null;
  private String idAutorizador = null;

  /**
   **/
  public AutorizadorType tranIdUsuarioOperativo(String tranIdUsuarioOperativo) {
    this.tranIdUsuarioOperativo = tranIdUsuarioOperativo;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTranIdUsuarioOperativo() {
    return tranIdUsuarioOperativo;
  }
  public void setTranIdUsuarioOperativo(String tranIdUsuarioOperativo) {
    this.tranIdUsuarioOperativo = tranIdUsuarioOperativo;
  }

  /**
   **/
  public AutorizadorType fechaAutorizacion(javax.xml.datatype.XMLGregorianCalendar fechaAutorizacion) {
    this.fechaAutorizacion = fechaAutorizacion;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public javax.xml.datatype.XMLGregorianCalendar getFechaAutorizacion() {
    return fechaAutorizacion;
  }
  public void setFechaAutorizacion(javax.xml.datatype.XMLGregorianCalendar fechaAutorizacion) {
    this.fechaAutorizacion = fechaAutorizacion;
  }

  /**
   **/
  public AutorizadorType idAutorizador(String idAutorizador) {
    this.idAutorizador = idAutorizador;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getIdAutorizador() {
    return idAutorizador;
  }
  public void setIdAutorizador(String idAutorizador) {
    this.idAutorizador = idAutorizador;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutorizadorType autorizadorType = (AutorizadorType) o;
    return Objects.equals(tranIdUsuarioOperativo, autorizadorType.tranIdUsuarioOperativo) &&
        Objects.equals(fechaAutorizacion, autorizadorType.fechaAutorizacion) &&
        Objects.equals(idAutorizador, autorizadorType.idAutorizador);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tranIdUsuarioOperativo, fechaAutorizacion, idAutorizador);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutorizadorType {\n");
    
    sb.append("    tranIdUsuarioOperativo: ").append(toIndentedString(tranIdUsuarioOperativo)).append("\n");
    sb.append("    fechaAutorizacion: ").append(toIndentedString(fechaAutorizacion)).append("\n");
    sb.append("    idAutorizador: ").append(toIndentedString(idAutorizador)).append("\n");
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
