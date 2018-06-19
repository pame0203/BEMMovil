package io.swagger.model;




import io.swagger.annotations.*;
import java.util.Objects;


public class TEFVDetalle   {
  
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
  public TEFVDetalle cuentaOrigen(String cuentaOrigen) {
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
  public TEFVDetalle razonSocial(String razonSocial) {
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
  public TEFVDetalle divisaMoneda(String divisaMoneda) {
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
  public TEFVDetalle idTercero(String idTercero) {
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
  public TEFVDetalle nombreBeneficiario(String nombreBeneficiario) {
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
  public TEFVDetalle cuentaClabe(String cuentaClabe) {
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
  public TEFVDetalle titularCuenta(String titularCuenta) {
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
  public TEFVDetalle importe(String importe) {
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
  public TEFVDetalle iva(String iva) {
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
  public TEFVDetalle fechaAplicacion(String fechaAplicacion) {
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
  public TEFVDetalle numeroReferencia(String numeroReferencia) {
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
  public TEFVDetalle conceptoPago(String conceptoPago) {
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
  public TEFVDetalle confirmacionTransferencia(String confirmacionTransferencia) {
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
  public TEFVDetalle usuarioCapturo(String usuarioCapturo) {
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
  public TEFVDetalle fechaCapturo(String fechaCapturo) {
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
  public TEFVDetalle usuarioEjecuto(String usuarioEjecuto) {
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
  public TEFVDetalle fechaEjecuto(String fechaEjecuto) {
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
  public TEFVDetalle estatusRegistro(String estatusRegistro) {
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
  public TEFVDetalle bancoDestino(String bancoDestino) {
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
    TEFVDetalle tEFVDetalle = (TEFVDetalle) o;
    return Objects.equals(cuentaOrigen, tEFVDetalle.cuentaOrigen) &&
        Objects.equals(razonSocial, tEFVDetalle.razonSocial) &&
        Objects.equals(divisaMoneda, tEFVDetalle.divisaMoneda) &&
        Objects.equals(idTercero, tEFVDetalle.idTercero) &&
        Objects.equals(nombreBeneficiario, tEFVDetalle.nombreBeneficiario) &&
        Objects.equals(cuentaClabe, tEFVDetalle.cuentaClabe) &&
        Objects.equals(titularCuenta, tEFVDetalle.titularCuenta) &&
        Objects.equals(importe, tEFVDetalle.importe) &&
        Objects.equals(iva, tEFVDetalle.iva) &&
        Objects.equals(fechaAplicacion, tEFVDetalle.fechaAplicacion) &&
        Objects.equals(numeroReferencia, tEFVDetalle.numeroReferencia) &&
        Objects.equals(conceptoPago, tEFVDetalle.conceptoPago) &&
        Objects.equals(confirmacionTransferencia, tEFVDetalle.confirmacionTransferencia) &&
        Objects.equals(usuarioCapturo, tEFVDetalle.usuarioCapturo) &&
        Objects.equals(fechaCapturo, tEFVDetalle.fechaCapturo) &&
        Objects.equals(usuarioEjecuto, tEFVDetalle.usuarioEjecuto) &&
        Objects.equals(fechaEjecuto, tEFVDetalle.fechaEjecuto) &&
        Objects.equals(estatusRegistro, tEFVDetalle.estatusRegistro) &&
        Objects.equals(bancoDestino, tEFVDetalle.bancoDestino);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cuentaOrigen, razonSocial, divisaMoneda, idTercero, nombreBeneficiario, cuentaClabe, titularCuenta, importe, iva, fechaAplicacion, numeroReferencia, conceptoPago, confirmacionTransferencia, usuarioCapturo, fechaCapturo, usuarioEjecuto, fechaEjecuto, estatusRegistro, bancoDestino);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TEFVDetalle {\n");
    
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
