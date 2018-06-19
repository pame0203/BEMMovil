package io.swagger.model;

import io.swagger.model.Autorizador;
import io.swagger.model.PagoServicioVDetalle;
import io.swagger.model.PagoServicioVGeneral;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class PagoServicio   {
  
  private String idTransferencia = null;
  private List<Autorizador> autorizadores = new ArrayList<Autorizador>();
  private PagoServicioVDetalle vistaDetalle = null;
  private PagoServicioVGeneral vistaGeneral = null;
  private String idFacturador = null;
  private Boolean enEsperaAutorizacion = false;

  /**
   **/
  public PagoServicio idTransferencia(String idTransferencia) {
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
  public PagoServicio autorizadores(List<Autorizador> autorizadores) {
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
  public PagoServicio vistaDetalle(PagoServicioVDetalle vistaDetalle) {
    this.vistaDetalle = vistaDetalle;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public PagoServicioVDetalle getVistaDetalle() {
    return vistaDetalle;
  }
  public void setVistaDetalle(PagoServicioVDetalle vistaDetalle) {
    this.vistaDetalle = vistaDetalle;
  }

  /**
   **/
  public PagoServicio vistaGeneral(PagoServicioVGeneral vistaGeneral) {
    this.vistaGeneral = vistaGeneral;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public PagoServicioVGeneral getVistaGeneral() {
    return vistaGeneral;
  }
  public void setVistaGeneral(PagoServicioVGeneral vistaGeneral) {
    this.vistaGeneral = vistaGeneral;
  }

  /**
   **/
  public PagoServicio idFacturador(String idFacturador) {
    this.idFacturador = idFacturador;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getIdFacturador() {
    return idFacturador;
  }
  public void setIdFacturador(String idFacturador) {
    this.idFacturador = idFacturador;
  }

  /**
   **/
  public PagoServicio enEsperaAutorizacion(Boolean enEsperaAutorizacion) {
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
    PagoServicio pagoServicio = (PagoServicio) o;
    return Objects.equals(idTransferencia, pagoServicio.idTransferencia) &&
        Objects.equals(autorizadores, pagoServicio.autorizadores) &&
        Objects.equals(vistaDetalle, pagoServicio.vistaDetalle) &&
        Objects.equals(vistaGeneral, pagoServicio.vistaGeneral) &&
        Objects.equals(idFacturador, pagoServicio.idFacturador) &&
        Objects.equals(enEsperaAutorizacion, pagoServicio.enEsperaAutorizacion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTransferencia, autorizadores, vistaDetalle, vistaGeneral, idFacturador, enEsperaAutorizacion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagoServicio {\n");
    
    sb.append("    idTransferencia: ").append(toIndentedString(idTransferencia)).append("\n");
    sb.append("    autorizadores: ").append(toIndentedString(autorizadores)).append("\n");
    sb.append("    vistaDetalle: ").append(toIndentedString(vistaDetalle)).append("\n");
    sb.append("    vistaGeneral: ").append(toIndentedString(vistaGeneral)).append("\n");
    sb.append("    idFacturador: ").append(toIndentedString(idFacturador)).append("\n");
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
