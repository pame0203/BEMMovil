package io.swagger.model;




import io.swagger.annotations.*;
import java.util.Objects;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;


public class PropiasVDetalle   {
  
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
  
  

  public PropiasVDetalle(String cuentaOrigen, String razonSocial, String divisaMoneda, String idTercero,
		String nombreBeneficiario, String cuentaClabe, String titularCuenta, String importe, String iva,
		String fechaAplicacion, String numeroReferencia, String conceptoPago, String confirmacionTransferencia,
		String usuarioCapturo, String fechaCapturo, String usuarioEjecuto, String fechaEjecuto, String estatusRegistro,
		String bancoDestino) {
	super();
	this.cuentaOrigen = cuentaOrigen;
	this.razonSocial = razonSocial;
	this.divisaMoneda = divisaMoneda;
	this.idTercero = idTercero;
	this.nombreBeneficiario = nombreBeneficiario;
	this.cuentaClabe = cuentaClabe;
	this.titularCuenta = titularCuenta;
	this.importe = importe;
	this.iva = iva;
	this.fechaAplicacion = fechaAplicacion;
	this.numeroReferencia = numeroReferencia;
	this.conceptoPago = conceptoPago;
	this.confirmacionTransferencia = confirmacionTransferencia;
	this.usuarioCapturo = usuarioCapturo;
	this.fechaCapturo = fechaCapturo;
	this.usuarioEjecuto = usuarioEjecuto;
	this.fechaEjecuto = fechaEjecuto;
	this.estatusRegistro = estatusRegistro;
	this.bancoDestino = bancoDestino;
}


/**
   **/
  public PropiasVDetalle cuentaOrigen(String cuentaOrigen) {
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
  public PropiasVDetalle razonSocial(String razonSocial) {
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
  public PropiasVDetalle divisaMoneda(String divisaMoneda) {
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
  public PropiasVDetalle idTercero(String idTercero) {
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
  public PropiasVDetalle nombreBeneficiario(String nombreBeneficiario) {
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
  public PropiasVDetalle cuentaClabe(String cuentaClabe) {
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
  public PropiasVDetalle titularCuenta(String titularCuenta) {
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
  public PropiasVDetalle importe(String importe) {
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
  public PropiasVDetalle iva(String iva) {
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
  public PropiasVDetalle fechaAplicacion(String fechaAplicacion) {
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
  public PropiasVDetalle numeroReferencia(String numeroReferencia) {
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
  public PropiasVDetalle conceptoPago(String conceptoPago) {
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
  public PropiasVDetalle confirmacionTransferencia(String confirmacionTransferencia) {
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
  public PropiasVDetalle usuarioCapturo(String usuarioCapturo) {
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
  public PropiasVDetalle fechaCapturo(String fechaCapturo) {
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
  public PropiasVDetalle usuarioEjecuto(String usuarioEjecuto) {
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
  public PropiasVDetalle fechaEjecuto(String fechaEjecuto) {
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
  public PropiasVDetalle estatusRegistro(String estatusRegistro) {
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
  public PropiasVDetalle bancoDestino(String bancoDestino) {
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
    PropiasVDetalle propiasVDetalle = (PropiasVDetalle) o;
    return Objects.equals(cuentaOrigen, propiasVDetalle.cuentaOrigen) &&
        Objects.equals(razonSocial, propiasVDetalle.razonSocial) &&
        Objects.equals(divisaMoneda, propiasVDetalle.divisaMoneda) &&
        Objects.equals(idTercero, propiasVDetalle.idTercero) &&
        Objects.equals(nombreBeneficiario, propiasVDetalle.nombreBeneficiario) &&
        Objects.equals(cuentaClabe, propiasVDetalle.cuentaClabe) &&
        Objects.equals(titularCuenta, propiasVDetalle.titularCuenta) &&
        Objects.equals(importe, propiasVDetalle.importe) &&
        Objects.equals(iva, propiasVDetalle.iva) &&
        Objects.equals(fechaAplicacion, propiasVDetalle.fechaAplicacion) &&
        Objects.equals(numeroReferencia, propiasVDetalle.numeroReferencia) &&
        Objects.equals(conceptoPago, propiasVDetalle.conceptoPago) &&
        Objects.equals(confirmacionTransferencia, propiasVDetalle.confirmacionTransferencia) &&
        Objects.equals(usuarioCapturo, propiasVDetalle.usuarioCapturo) &&
        Objects.equals(fechaCapturo, propiasVDetalle.fechaCapturo) &&
        Objects.equals(usuarioEjecuto, propiasVDetalle.usuarioEjecuto) &&
        Objects.equals(fechaEjecuto, propiasVDetalle.fechaEjecuto) &&
        Objects.equals(estatusRegistro, propiasVDetalle.estatusRegistro) &&
        Objects.equals(bancoDestino, propiasVDetalle.bancoDestino);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cuentaOrigen, razonSocial, divisaMoneda, idTercero, nombreBeneficiario, cuentaClabe, titularCuenta, importe, iva, fechaAplicacion, numeroReferencia, conceptoPago, confirmacionTransferencia, usuarioCapturo, fechaCapturo, usuarioEjecuto, fechaEjecuto, estatusRegistro, bancoDestino);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropiasVDetalle {\n");
    
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
  
  public JsonObject toJsonObject() {
	JsonObjectBuilder object = Json.createObjectBuilder();
	object.add("cuentaOrigen", getCuentaOrigen())
		.add("razonSocial", getRazonSocial())
		.add("divisaMoneda", getDivisaMoneda())
		.add("idTercero", getIdTercero())
		.add("nombreBeneficiario", getNombreBeneficiario())
		.add("cuentaClabe", getCuentaClabe())
		.add("titularCuenta", getTitularCuenta())
		.add("importe", getImporte())
		.add("iva", getIva())
		.add("fechaAplicacion", getFechaAplicacion())
		.add("numeroReferencia", getNumeroReferencia())
		.add("conceptoPago", getConceptoPago())
		.add("confirmacionTransferencia", getConfirmacionTransferencia())
		.add("usuarioCapturo", getUsuarioCapturo())
		.add("fechaCapturo", getFechaCapturo())
		.add("usuarioEjecuto", getUsuarioEjecuto())
		.add("fechaEjecuto", getFechaEjecuto())
		.add("estatusRegistro", getEstatusRegistro())
		.add("bancoDestino", getBancoDestino());
		
	return object.build();
  }
}
