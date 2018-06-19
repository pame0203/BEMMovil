package io.swagger.model;

import io.swagger.model.AltaCuentaTerceroVDetalle;
import io.swagger.model.AltaCuentaTerceroVGeneral;
import io.swagger.model.Autorizador;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class AltaCuentaTercero   {
  
  private AltaCuentaTerceroVGeneral vistaGeneral = null;
  private AltaCuentaTerceroVDetalle vistaDetalle = null;
  private List<Autorizador> autorizadores = new ArrayList<Autorizador>();
  private Long idTercero = null;
  private Long idCuentaTercero = null;
  private Long cuentaTercero = null;
  private String idTransferencia = null;
  private Boolean enEsperaAutorizacion = false;

  /**
   **/
  public AltaCuentaTercero vistaGeneral(AltaCuentaTerceroVGeneral vistaGeneral) {
    this.vistaGeneral = vistaGeneral;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public AltaCuentaTerceroVGeneral getVistaGeneral() {
    return vistaGeneral;
  }
  public void setVistaGeneral(AltaCuentaTerceroVGeneral vistaGeneral) {
    this.vistaGeneral = vistaGeneral;
  }

  /**
   **/
  public AltaCuentaTercero vistaDetalle(AltaCuentaTerceroVDetalle vistaDetalle) {
    this.vistaDetalle = vistaDetalle;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public AltaCuentaTerceroVDetalle getVistaDetalle() {
    return vistaDetalle;
  }
  public void setVistaDetalle(AltaCuentaTerceroVDetalle vistaDetalle) {
    this.vistaDetalle = vistaDetalle;
  }

  /**
   **/
  public AltaCuentaTercero autorizadores(List<Autorizador> autorizadores) {
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
  public AltaCuentaTercero idTercero(Long idTercero) {
    this.idTercero = idTercero;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getIdTercero() {
    return idTercero;
  }
  public void setIdTercero(Long idTercero) {
    this.idTercero = idTercero;
  }

  /**
   **/
  public AltaCuentaTercero idCuentaTercero(Long idCuentaTercero) {
    this.idCuentaTercero = idCuentaTercero;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getIdCuentaTercero() {
    return idCuentaTercero;
  }
  public void setIdCuentaTercero(Long idCuentaTercero) {
    this.idCuentaTercero = idCuentaTercero;
  }

  /**
   **/
  public AltaCuentaTercero cuentaTercero(Long cuentaTercero) {
    this.cuentaTercero = cuentaTercero;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getCuentaTercero() {
    return cuentaTercero;
  }
  public void setCuentaTercero(Long cuentaTercero) {
    this.cuentaTercero = cuentaTercero;
  }

  /**
   **/
  public AltaCuentaTercero idTransferencia(String idTransferencia) {
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
  public AltaCuentaTercero enEsperaAutorizacion(Boolean enEsperaAutorizacion) {
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
    AltaCuentaTercero altaCuentaTercero = (AltaCuentaTercero) o;
    return Objects.equals(vistaGeneral, altaCuentaTercero.vistaGeneral) &&
        Objects.equals(vistaDetalle, altaCuentaTercero.vistaDetalle) &&
        Objects.equals(autorizadores, altaCuentaTercero.autorizadores) &&
        Objects.equals(idTercero, altaCuentaTercero.idTercero) &&
        Objects.equals(idCuentaTercero, altaCuentaTercero.idCuentaTercero) &&
        Objects.equals(cuentaTercero, altaCuentaTercero.cuentaTercero) &&
        Objects.equals(idTransferencia, altaCuentaTercero.idTransferencia) &&
        Objects.equals(enEsperaAutorizacion, altaCuentaTercero.enEsperaAutorizacion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vistaGeneral, vistaDetalle, autorizadores, idTercero, idCuentaTercero, cuentaTercero, idTransferencia, enEsperaAutorizacion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AltaCuentaTercero {\n");
    
    sb.append("    vistaGeneral: ").append(toIndentedString(vistaGeneral)).append("\n");
    sb.append("    vistaDetalle: ").append(toIndentedString(vistaDetalle)).append("\n");
    sb.append("    autorizadores: ").append(toIndentedString(autorizadores)).append("\n");
    sb.append("    idTercero: ").append(toIndentedString(idTercero)).append("\n");
    sb.append("    idCuentaTercero: ").append(toIndentedString(idCuentaTercero)).append("\n");
    sb.append("    cuentaTercero: ").append(toIndentedString(cuentaTercero)).append("\n");
    sb.append("    idTransferencia: ").append(toIndentedString(idTransferencia)).append("\n");
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
