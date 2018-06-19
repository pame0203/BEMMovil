package io.swagger.model;




import io.swagger.annotations.*;
import java.util.Objects;


public class AltaCuentaTerceroVGeneral   {
  
  private String fechaActual = null;
  private String nombreProveedor = null;
  private String numeroCuenta = null;
  private String bancoReceptor = null;
  private String fechaAcordeon = null;

  /**
   **/
  public AltaCuentaTerceroVGeneral fechaActual(String fechaActual) {
    this.fechaActual = fechaActual;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getFechaActual() {
    return fechaActual;
  }
  public void setFechaActual(String fechaActual) {
    this.fechaActual = fechaActual;
  }

  /**
   **/
  public AltaCuentaTerceroVGeneral nombreProveedor(String nombreProveedor) {
    this.nombreProveedor = nombreProveedor;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getNombreProveedor() {
    return nombreProveedor;
  }
  public void setNombreProveedor(String nombreProveedor) {
    this.nombreProveedor = nombreProveedor;
  }

  /**
   **/
  public AltaCuentaTerceroVGeneral numeroCuenta(String numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getNumeroCuenta() {
    return numeroCuenta;
  }
  public void setNumeroCuenta(String numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
  }

  /**
   **/
  public AltaCuentaTerceroVGeneral bancoReceptor(String bancoReceptor) {
    this.bancoReceptor = bancoReceptor;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getBancoReceptor() {
    return bancoReceptor;
  }
  public void setBancoReceptor(String bancoReceptor) {
    this.bancoReceptor = bancoReceptor;
  }

  /**
   **/
  public AltaCuentaTerceroVGeneral fechaAcordeon(String fechaAcordeon) {
    this.fechaAcordeon = fechaAcordeon;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getFechaAcordeon() {
    return fechaAcordeon;
  }
  public void setFechaAcordeon(String fechaAcordeon) {
    this.fechaAcordeon = fechaAcordeon;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AltaCuentaTerceroVGeneral altaCuentaTerceroVGeneral = (AltaCuentaTerceroVGeneral) o;
    return Objects.equals(fechaActual, altaCuentaTerceroVGeneral.fechaActual) &&
        Objects.equals(nombreProveedor, altaCuentaTerceroVGeneral.nombreProveedor) &&
        Objects.equals(numeroCuenta, altaCuentaTerceroVGeneral.numeroCuenta) &&
        Objects.equals(bancoReceptor, altaCuentaTerceroVGeneral.bancoReceptor) &&
        Objects.equals(fechaAcordeon, altaCuentaTerceroVGeneral.fechaAcordeon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fechaActual, nombreProveedor, numeroCuenta, bancoReceptor, fechaAcordeon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AltaCuentaTerceroVGeneral {\n");
    
    sb.append("    fechaActual: ").append(toIndentedString(fechaActual)).append("\n");
    sb.append("    nombreProveedor: ").append(toIndentedString(nombreProveedor)).append("\n");
    sb.append("    numeroCuenta: ").append(toIndentedString(numeroCuenta)).append("\n");
    sb.append("    bancoReceptor: ").append(toIndentedString(bancoReceptor)).append("\n");
    sb.append("    fechaAcordeon: ").append(toIndentedString(fechaAcordeon)).append("\n");
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
