package io.swagger.model;




import io.swagger.annotations.*;
import java.util.Objects;


public class TranTerceroVDetalle   {
  
  private String cuentaOrigen = null;
  private String razonSocial = null;
  private String divisaMoneda = null;
  private String idTercero = null;
  private String nombreBeneficiario = null;
  private String cuentaClabe = null;
  private String titularCuenta = null;
  private String importe = null;
  private String iva = null;
  private String fechaAplicacion = null;
  private String numeroReferencia = null;
  private String conceptoPago = null;
  private String confirmacionTransferencia = null;
  private String usuarioCapturo = null;
  private String fechaCapturo = null;
  private String usuarioEjecuto = null;
  private String fechaEjecuto = null;
  private String estatusRegistro = null;
  private String bancoDestino = null;

  /**
   **/
  public TranTerceroVDetalle cuentaOrigen(String cuentaOrigen) {
    this.cuentaOrigen = cuentaOrigen;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getCuentaOrigen() {
    return cuentaOrigen;
  }
  public void setCuentaOrigen(String cuentaOrigen) {
    this.cuentaOrigen = cuentaOrigen;
  }

  /**
   **/
  public TranTerceroVDetalle razonSocial(String razonSocial) {
    this.razonSocial = razonSocial;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getRazonSocial() {
    return razonSocial;
  }
  public void setRazonSocial(String razonSocial) {
    this.razonSocial = razonSocial;
  }

  /**
   **/
  public TranTerceroVDetalle divisaMoneda(String divisaMoneda) {
    this.divisaMoneda = divisaMoneda;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getDivisaMoneda() {
    return divisaMoneda;
  }
  public void setDivisaMoneda(String divisaMoneda) {
    this.divisaMoneda = divisaMoneda;
  }

  /**
   **/
  public TranTerceroVDetalle idTercero(String idTercero) {
    this.idTercero = idTercero;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getIdTercero() {
    return idTercero;
  }
  public void setIdTercero(String idTercero) {
    this.idTercero = idTercero;
  }

  /**
   **/
  public TranTerceroVDetalle nombreBeneficiario(String nombreBeneficiario) {
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
  public TranTerceroVDetalle cuentaClabe(String cuentaClabe) {
    this.cuentaClabe = cuentaClabe;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getCuentaClabe() {
    return cuentaClabe;
  }
  public void setCuentaClabe(String cuentaClabe) {
    this.cuentaClabe = cuentaClabe;
  }

  /**
   **/
  public TranTerceroVDetalle titularCuenta(String titularCuenta) {
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
  public TranTerceroVDetalle importe(String importe) {
    this.importe = importe;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getImporte() {
    return importe;
  }
  public void setImporte(String importe) {
    this.importe = importe;
  }

  /**
   **/
  public TranTerceroVDetalle iva(String iva) {
    this.iva = iva;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getIva() {
    return iva;
  }
  public void setIva(String iva) {
    this.iva = iva;
  }

  /**
   **/
  public TranTerceroVDetalle fechaAplicacion(String fechaAplicacion) {
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
  public TranTerceroVDetalle numeroReferencia(String numeroReferencia) {
    this.numeroReferencia = numeroReferencia;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getNumeroReferencia() {
    return numeroReferencia;
  }
  public void setNumeroReferencia(String numeroReferencia) {
    this.numeroReferencia = numeroReferencia;
  }

  /**
   **/
  public TranTerceroVDetalle conceptoPago(String conceptoPago) {
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
  public TranTerceroVDetalle confirmacionTransferencia(String confirmacionTransferencia) {
    this.confirmacionTransferencia = confirmacionTransferencia;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getConfirmacionTransferencia() {
    return confirmacionTransferencia;
  }
  public void setConfirmacionTransferencia(String confirmacionTransferencia) {
    this.confirmacionTransferencia = confirmacionTransferencia;
  }

  /**
   **/
  public TranTerceroVDetalle usuarioCapturo(String usuarioCapturo) {
    this.usuarioCapturo = usuarioCapturo;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getUsuarioCapturo() {
    return usuarioCapturo;
  }
  public void setUsuarioCapturo(String usuarioCapturo) {
    this.usuarioCapturo = usuarioCapturo;
  }

  /**
   **/
  public TranTerceroVDetalle fechaCapturo(String fechaCapturo) {
    this.fechaCapturo = fechaCapturo;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getFechaCapturo() {
    return fechaCapturo;
  }
  public void setFechaCapturo(String fechaCapturo) {
    this.fechaCapturo = fechaCapturo;
  }

  /**
   **/
  public TranTerceroVDetalle usuarioEjecuto(String usuarioEjecuto) {
    this.usuarioEjecuto = usuarioEjecuto;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getUsuarioEjecuto() {
    return usuarioEjecuto;
  }
  public void setUsuarioEjecuto(String usuarioEjecuto) {
    this.usuarioEjecuto = usuarioEjecuto;
  }

  /**
   **/
  public TranTerceroVDetalle fechaEjecuto(String fechaEjecuto) {
    this.fechaEjecuto = fechaEjecuto;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getFechaEjecuto() {
    return fechaEjecuto;
  }
  public void setFechaEjecuto(String fechaEjecuto) {
    this.fechaEjecuto = fechaEjecuto;
  }

  /**
   **/
  public TranTerceroVDetalle estatusRegistro(String estatusRegistro) {
    this.estatusRegistro = estatusRegistro;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getEstatusRegistro() {
    return estatusRegistro;
  }
  public void setEstatusRegistro(String estatusRegistro) {
    this.estatusRegistro = estatusRegistro;
  }

  /**
   **/
  public TranTerceroVDetalle bancoDestino(String bancoDestino) {
    this.bancoDestino = bancoDestino;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getBancoDestino() {
    return bancoDestino;
  }
  public void setBancoDestino(String bancoDestino) {
    this.bancoDestino = bancoDestino;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranTerceroVDetalle tranTerceroVDetalle = (TranTerceroVDetalle) o;
    return Objects.equals(cuentaOrigen, tranTerceroVDetalle.cuentaOrigen) &&
        Objects.equals(razonSocial, tranTerceroVDetalle.razonSocial) &&
        Objects.equals(divisaMoneda, tranTerceroVDetalle.divisaMoneda) &&
        Objects.equals(idTercero, tranTerceroVDetalle.idTercero) &&
        Objects.equals(nombreBeneficiario, tranTerceroVDetalle.nombreBeneficiario) &&
        Objects.equals(cuentaClabe, tranTerceroVDetalle.cuentaClabe) &&
        Objects.equals(titularCuenta, tranTerceroVDetalle.titularCuenta) &&
        Objects.equals(importe, tranTerceroVDetalle.importe) &&
        Objects.equals(iva, tranTerceroVDetalle.iva) &&
        Objects.equals(fechaAplicacion, tranTerceroVDetalle.fechaAplicacion) &&
        Objects.equals(numeroReferencia, tranTerceroVDetalle.numeroReferencia) &&
        Objects.equals(conceptoPago, tranTerceroVDetalle.conceptoPago) &&
        Objects.equals(confirmacionTransferencia, tranTerceroVDetalle.confirmacionTransferencia) &&
        Objects.equals(usuarioCapturo, tranTerceroVDetalle.usuarioCapturo) &&
        Objects.equals(fechaCapturo, tranTerceroVDetalle.fechaCapturo) &&
        Objects.equals(usuarioEjecuto, tranTerceroVDetalle.usuarioEjecuto) &&
        Objects.equals(fechaEjecuto, tranTerceroVDetalle.fechaEjecuto) &&
        Objects.equals(estatusRegistro, tranTerceroVDetalle.estatusRegistro) &&
        Objects.equals(bancoDestino, tranTerceroVDetalle.bancoDestino);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cuentaOrigen, razonSocial, divisaMoneda, idTercero, nombreBeneficiario, cuentaClabe, titularCuenta, importe, iva, fechaAplicacion, numeroReferencia, conceptoPago, confirmacionTransferencia, usuarioCapturo, fechaCapturo, usuarioEjecuto, fechaEjecuto, estatusRegistro, bancoDestino);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranTerceroVDetalle {\n");
    
    sb.append("    cuentaOrigen: ").append(toIndentedString(cuentaOrigen)).append("\n");
    sb.append("    razonSocial: ").append(toIndentedString(razonSocial)).append("\n");
    sb.append("    divisaMoneda: ").append(toIndentedString(divisaMoneda)).append("\n");
    sb.append("    idTercero: ").append(toIndentedString(idTercero)).append("\n");
    sb.append("    nombreBeneficiario: ").append(toIndentedString(nombreBeneficiario)).append("\n");
    sb.append("    cuentaClabe: ").append(toIndentedString(cuentaClabe)).append("\n");
    sb.append("    titularCuenta: ").append(toIndentedString(titularCuenta)).append("\n");
    sb.append("    importe: ").append(toIndentedString(importe)).append("\n");
    sb.append("    iva: ").append(toIndentedString(iva)).append("\n");
    sb.append("    fechaAplicacion: ").append(toIndentedString(fechaAplicacion)).append("\n");
    sb.append("    numeroReferencia: ").append(toIndentedString(numeroReferencia)).append("\n");
    sb.append("    conceptoPago: ").append(toIndentedString(conceptoPago)).append("\n");
    sb.append("    confirmacionTransferencia: ").append(toIndentedString(confirmacionTransferencia)).append("\n");
    sb.append("    usuarioCapturo: ").append(toIndentedString(usuarioCapturo)).append("\n");
    sb.append("    fechaCapturo: ").append(toIndentedString(fechaCapturo)).append("\n");
    sb.append("    usuarioEjecuto: ").append(toIndentedString(usuarioEjecuto)).append("\n");
    sb.append("    fechaEjecuto: ").append(toIndentedString(fechaEjecuto)).append("\n");
    sb.append("    estatusRegistro: ").append(toIndentedString(estatusRegistro)).append("\n");
    sb.append("    bancoDestino: ").append(toIndentedString(bancoDestino)).append("\n");
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
