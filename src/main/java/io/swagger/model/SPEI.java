package io.swagger.model;

import io.swagger.model.Autorizador;
import io.swagger.model.SPEIVDetalle;
import io.swagger.model.SPEIVGeneral;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class SPEI   {
  
  private String idTransferencia = null;
  private List<Autorizador> autorizadores = new ArrayList<Autorizador>();
  private SPEIVGeneral vistaGeneral = null;
  private SPEIVDetalle vistaDetalle = null;
  private Boolean enEsperaAutorizacion = false;

  /**
   **/
  public SPEI idTransferencia(String idTransferencia) {
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
  public SPEI autorizadores(List<Autorizador> autorizadores) {
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
  public SPEI vistaGeneral(SPEIVGeneral vistaGeneral) {
    this.vistaGeneral = vistaGeneral;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public SPEIVGeneral getVistaGeneral() {
    return vistaGeneral;
  }
  public void setVistaGeneral(SPEIVGeneral vistaGeneral) {
    this.vistaGeneral = vistaGeneral;
  }

  /**
   **/
  public SPEI vistaDetalle(SPEIVDetalle vistaDetalle) {
    this.vistaDetalle = vistaDetalle;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public SPEIVDetalle getVistaDetalle() {
    return vistaDetalle;
  }
  public void setVistaDetalle(SPEIVDetalle vistaDetalle) {
    this.vistaDetalle = vistaDetalle;
  }

  /**
   **/
  public SPEI enEsperaAutorizacion(Boolean enEsperaAutorizacion) {
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
    SPEI SPEI = (SPEI) o;
    return Objects.equals(idTransferencia, SPEI.idTransferencia) &&
        Objects.equals(autorizadores, SPEI.autorizadores) &&
        Objects.equals(vistaGeneral, SPEI.vistaGeneral) &&
        Objects.equals(vistaDetalle, SPEI.vistaDetalle) &&
        Objects.equals(enEsperaAutorizacion, SPEI.enEsperaAutorizacion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTransferencia, autorizadores, vistaGeneral, vistaDetalle, enEsperaAutorizacion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SPEI {\n");
    
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
}
