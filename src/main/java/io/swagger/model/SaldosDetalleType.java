package io.swagger.model;

import java.math.BigDecimal;



import io.swagger.annotations.*;
import java.util.Objects;


public class SaldosDetalleType   {
  
  private Long idCuentaUsuario = null;
  private String alias = null;
  private String tranNumeroCuenta = null;
  private String tranNumeroPlastico = null;
  private Integer tranTipoCuenta = null;
  private String tranTipoDivisa = null;
  private String descripcionDivisa = null;
  private String tranTipoProducto = null;
  private String tranTipoSubProducto = null;
  private String descripcionProducto = null;
  private Long idCuenta = null;
  private String clabe = null;
  private Integer tranNumeroPagare = null;
  private BigDecimal saldoActual = null;
  private BigDecimal saldoDisponible = null;
  private String titular = null;
  private String tranCuentaEje = null;
  private BigDecimal pagoMinimo = null;
  private BigDecimal saldoCorte = null;
  private javax.xml.datatype.XMLGregorianCalendar fechaCorte = null;

  /**
   **/
  public SaldosDetalleType idCuentaUsuario(Long idCuentaUsuario) {
    this.idCuentaUsuario = idCuentaUsuario;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getIdCuentaUsuario() {
    return idCuentaUsuario;
  }
  public void setIdCuentaUsuario(Long idCuentaUsuario) {
    this.idCuentaUsuario = idCuentaUsuario;
  }

  /**
   **/
  public SaldosDetalleType alias(String alias) {
    this.alias = alias;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getAlias() {
    return alias;
  }
  public void setAlias(String alias) {
    this.alias = alias;
  }

  /**
   **/
  public SaldosDetalleType tranNumeroCuenta(String tranNumeroCuenta) {
    this.tranNumeroCuenta = tranNumeroCuenta;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTranNumeroCuenta() {
    return tranNumeroCuenta;
  }
  public void setTranNumeroCuenta(String tranNumeroCuenta) {
    this.tranNumeroCuenta = tranNumeroCuenta;
  }

  /**
   **/
  public SaldosDetalleType tranNumeroPlastico(String tranNumeroPlastico) {
    this.tranNumeroPlastico = tranNumeroPlastico;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTranNumeroPlastico() {
    return tranNumeroPlastico;
  }
  public void setTranNumeroPlastico(String tranNumeroPlastico) {
    this.tranNumeroPlastico = tranNumeroPlastico;
  }

  /**
   **/
  public SaldosDetalleType tranTipoCuenta(Integer tranTipoCuenta) {
    this.tranTipoCuenta = tranTipoCuenta;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Integer getTranTipoCuenta() {
    return tranTipoCuenta;
  }
  public void setTranTipoCuenta(Integer tranTipoCuenta) {
    this.tranTipoCuenta = tranTipoCuenta;
  }

  /**
   **/
  public SaldosDetalleType tranTipoDivisa(String tranTipoDivisa) {
    this.tranTipoDivisa = tranTipoDivisa;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTranTipoDivisa() {
    return tranTipoDivisa;
  }
  public void setTranTipoDivisa(String tranTipoDivisa) {
    this.tranTipoDivisa = tranTipoDivisa;
  }

  /**
   **/
  public SaldosDetalleType descripcionDivisa(String descripcionDivisa) {
    this.descripcionDivisa = descripcionDivisa;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getDescripcionDivisa() {
    return descripcionDivisa;
  }
  public void setDescripcionDivisa(String descripcionDivisa) {
    this.descripcionDivisa = descripcionDivisa;
  }

  /**
   **/
  public SaldosDetalleType tranTipoProducto(String tranTipoProducto) {
    this.tranTipoProducto = tranTipoProducto;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTranTipoProducto() {
    return tranTipoProducto;
  }
  public void setTranTipoProducto(String tranTipoProducto) {
    this.tranTipoProducto = tranTipoProducto;
  }

  /**
   **/
  public SaldosDetalleType tranTipoSubProducto(String tranTipoSubProducto) {
    this.tranTipoSubProducto = tranTipoSubProducto;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTranTipoSubProducto() {
    return tranTipoSubProducto;
  }
  public void setTranTipoSubProducto(String tranTipoSubProducto) {
    this.tranTipoSubProducto = tranTipoSubProducto;
  }

  /**
   **/
  public SaldosDetalleType descripcionProducto(String descripcionProducto) {
    this.descripcionProducto = descripcionProducto;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getDescripcionProducto() {
    return descripcionProducto;
  }
  public void setDescripcionProducto(String descripcionProducto) {
    this.descripcionProducto = descripcionProducto;
  }

  /**
   **/
  public SaldosDetalleType idCuenta(Long idCuenta) {
    this.idCuenta = idCuenta;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getIdCuenta() {
    return idCuenta;
  }
  public void setIdCuenta(Long idCuenta) {
    this.idCuenta = idCuenta;
  }

  /**
   **/
  public SaldosDetalleType clabe(String clabe) {
    this.clabe = clabe;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getClabe() {
    return clabe;
  }
  public void setClabe(String clabe) {
    this.clabe = clabe;
  }

  /**
   **/
  public SaldosDetalleType tranNumeroPagare(Integer tranNumeroPagare) {
    this.tranNumeroPagare = tranNumeroPagare;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Integer getTranNumeroPagare() {
    return tranNumeroPagare;
  }
  public void setTranNumeroPagare(Integer tranNumeroPagare) {
    this.tranNumeroPagare = tranNumeroPagare;
  }

  /**
   **/
  public SaldosDetalleType saldoActual(BigDecimal saldoActual) {
    this.saldoActual = saldoActual;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getSaldoActual() {
    return saldoActual;
  }
  public void setSaldoActual(BigDecimal saldoActual) {
    this.saldoActual = saldoActual;
  }

  /**
   **/
  public SaldosDetalleType saldoDisponible(BigDecimal saldoDisponible) {
    this.saldoDisponible = saldoDisponible;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getSaldoDisponible() {
    return saldoDisponible;
  }
  public void setSaldoDisponible(BigDecimal saldoDisponible) {
    this.saldoDisponible = saldoDisponible;
  }

  /**
   **/
  public SaldosDetalleType titular(String titular) {
    this.titular = titular;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTitular() {
    return titular;
  }
  public void setTitular(String titular) {
    this.titular = titular;
  }

  /**
   **/
  public SaldosDetalleType tranCuentaEje(String tranCuentaEje) {
    this.tranCuentaEje = tranCuentaEje;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTranCuentaEje() {
    return tranCuentaEje;
  }
  public void setTranCuentaEje(String tranCuentaEje) {
    this.tranCuentaEje = tranCuentaEje;
  }

  /**
   **/
  public SaldosDetalleType pagoMinimo(BigDecimal pagoMinimo) {
    this.pagoMinimo = pagoMinimo;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getPagoMinimo() {
    return pagoMinimo;
  }
  public void setPagoMinimo(BigDecimal pagoMinimo) {
    this.pagoMinimo = pagoMinimo;
  }

  /**
   **/
  public SaldosDetalleType saldoCorte(BigDecimal saldoCorte) {
    this.saldoCorte = saldoCorte;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getSaldoCorte() {
    return saldoCorte;
  }
  public void setSaldoCorte(BigDecimal saldoCorte) {
    this.saldoCorte = saldoCorte;
  }

  /**
   **/
  public SaldosDetalleType fechaCorte(javax.xml.datatype.XMLGregorianCalendar fechaCorte) {
    this.fechaCorte = fechaCorte;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public javax.xml.datatype.XMLGregorianCalendar getFechaCorte() {
    return fechaCorte;
  }
  public void setFechaCorte(javax.xml.datatype.XMLGregorianCalendar fechaCorte) {
    this.fechaCorte = fechaCorte;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaldosDetalleType saldosDetalleType = (SaldosDetalleType) o;
    return Objects.equals(idCuentaUsuario, saldosDetalleType.idCuentaUsuario) &&
        Objects.equals(alias, saldosDetalleType.alias) &&
        Objects.equals(tranNumeroCuenta, saldosDetalleType.tranNumeroCuenta) &&
        Objects.equals(tranNumeroPlastico, saldosDetalleType.tranNumeroPlastico) &&
        Objects.equals(tranTipoCuenta, saldosDetalleType.tranTipoCuenta) &&
        Objects.equals(tranTipoDivisa, saldosDetalleType.tranTipoDivisa) &&
        Objects.equals(descripcionDivisa, saldosDetalleType.descripcionDivisa) &&
        Objects.equals(tranTipoProducto, saldosDetalleType.tranTipoProducto) &&
        Objects.equals(tranTipoSubProducto, saldosDetalleType.tranTipoSubProducto) &&
        Objects.equals(descripcionProducto, saldosDetalleType.descripcionProducto) &&
        Objects.equals(idCuenta, saldosDetalleType.idCuenta) &&
        Objects.equals(clabe, saldosDetalleType.clabe) &&
        Objects.equals(tranNumeroPagare, saldosDetalleType.tranNumeroPagare) &&
        Objects.equals(saldoActual, saldosDetalleType.saldoActual) &&
        Objects.equals(saldoDisponible, saldosDetalleType.saldoDisponible) &&
        Objects.equals(titular, saldosDetalleType.titular) &&
        Objects.equals(tranCuentaEje, saldosDetalleType.tranCuentaEje) &&
        Objects.equals(pagoMinimo, saldosDetalleType.pagoMinimo) &&
        Objects.equals(saldoCorte, saldosDetalleType.saldoCorte) &&
        Objects.equals(fechaCorte, saldosDetalleType.fechaCorte);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCuentaUsuario, alias, tranNumeroCuenta, tranNumeroPlastico, tranTipoCuenta, tranTipoDivisa, descripcionDivisa, tranTipoProducto, tranTipoSubProducto, descripcionProducto, idCuenta, clabe, tranNumeroPagare, saldoActual, saldoDisponible, titular, tranCuentaEje, pagoMinimo, saldoCorte, fechaCorte);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaldosDetalleType {\n");
    
    sb.append("    idCuentaUsuario: ").append(toIndentedString(idCuentaUsuario)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    tranNumeroCuenta: ").append(toIndentedString(tranNumeroCuenta)).append("\n");
    sb.append("    tranNumeroPlastico: ").append(toIndentedString(tranNumeroPlastico)).append("\n");
    sb.append("    tranTipoCuenta: ").append(toIndentedString(tranTipoCuenta)).append("\n");
    sb.append("    tranTipoDivisa: ").append(toIndentedString(tranTipoDivisa)).append("\n");
    sb.append("    descripcionDivisa: ").append(toIndentedString(descripcionDivisa)).append("\n");
    sb.append("    tranTipoProducto: ").append(toIndentedString(tranTipoProducto)).append("\n");
    sb.append("    tranTipoSubProducto: ").append(toIndentedString(tranTipoSubProducto)).append("\n");
    sb.append("    descripcionProducto: ").append(toIndentedString(descripcionProducto)).append("\n");
    sb.append("    idCuenta: ").append(toIndentedString(idCuenta)).append("\n");
    sb.append("    clabe: ").append(toIndentedString(clabe)).append("\n");
    sb.append("    tranNumeroPagare: ").append(toIndentedString(tranNumeroPagare)).append("\n");
    sb.append("    saldoActual: ").append(toIndentedString(saldoActual)).append("\n");
    sb.append("    saldoDisponible: ").append(toIndentedString(saldoDisponible)).append("\n");
    sb.append("    titular: ").append(toIndentedString(titular)).append("\n");
    sb.append("    tranCuentaEje: ").append(toIndentedString(tranCuentaEje)).append("\n");
    sb.append("    pagoMinimo: ").append(toIndentedString(pagoMinimo)).append("\n");
    sb.append("    saldoCorte: ").append(toIndentedString(saldoCorte)).append("\n");
    sb.append("    fechaCorte: ").append(toIndentedString(fechaCorte)).append("\n");
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
