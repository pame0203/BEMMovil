package io.swagger.model;

import io.swagger.model.Autorizador;
import io.swagger.model.TransferenciaVDetalle;
import io.swagger.model.TransferenciaVGeneral;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class Transferencia   {
  
  private String idTransferencia = null;
  private List<Autorizador> autorizadores = new ArrayList<Autorizador>();
  private TransferenciaVDetalle vistaDetalle = null;
  private TransferenciaVGeneral vistaGeneral = null;
  private Boolean enEsperaAutorizacion = false;

  /**
   **/
  public Transferencia idTransferencia(String idTransferencia) {
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
  public Transferencia autorizadores(List<Autorizador> autorizadores) {
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
  public Transferencia vistaDetalle(TransferenciaVDetalle vistaDetalle) {
    this.vistaDetalle = vistaDetalle;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public TransferenciaVDetalle getVistaDetalle() {
    return vistaDetalle;
  }
  public void setVistaDetalle(TransferenciaVDetalle vistaDetalle) {
    this.vistaDetalle = vistaDetalle;
  }

  /**
   **/
  public Transferencia vistaGeneral(TransferenciaVGeneral vistaGeneral) {
    this.vistaGeneral = vistaGeneral;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public TransferenciaVGeneral getVistaGeneral() {
    return vistaGeneral;
  }
  public void setVistaGeneral(TransferenciaVGeneral vistaGeneral) {
    this.vistaGeneral = vistaGeneral;
  }

  /**
   **/
  public Transferencia enEsperaAutorizacion(Boolean enEsperaAutorizacion) {
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
    Transferencia transferencia = (Transferencia) o;
    return Objects.equals(idTransferencia, transferencia.idTransferencia) &&
        Objects.equals(autorizadores, transferencia.autorizadores) &&
        Objects.equals(vistaDetalle, transferencia.vistaDetalle) &&
        Objects.equals(vistaGeneral, transferencia.vistaGeneral) &&
        Objects.equals(enEsperaAutorizacion, transferencia.enEsperaAutorizacion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTransferencia, autorizadores, vistaDetalle, vistaGeneral, enEsperaAutorizacion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transferencia {\n");
    
    sb.append("    idTransferencia: ").append(toIndentedString(idTransferencia)).append("\n");
    sb.append("    autorizadores: ").append(toIndentedString(autorizadores)).append("\n");
    sb.append("    vistaDetalle: ").append(toIndentedString(vistaDetalle)).append("\n");
    sb.append("    vistaGeneral: ").append(toIndentedString(vistaGeneral)).append("\n");
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
}
