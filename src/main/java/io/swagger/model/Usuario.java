package io.swagger.model;




import io.swagger.annotations.*;
import java.util.Objects;


public class Usuario   {
  
  private String nombreUsuario = null;
  private String idUsuario = null;
  private String fraseUsuario = null;
  private String rutaImagen = null;
  private String tipoTokenUsuario = null;
  private String sesionUsuario = null;
  private String mensajeUsuario = null;
  private String perfilUsuario = null;
  private String canalUsuario = null;
  private String nombreCompleto = null;
  private String idTipoUsuario = null;
  private Boolean accesoExitoso = false;
  private Boolean usuarioDispositivoRSA = false;
  private Boolean usuarioRequiereToken = false;
  private Boolean usuarioBloqueado = false;
  private Boolean usuarioEnrolado = false;
  private String ultimoAccesoUsuario = null;
  private String empresaUsuario = null;
  private String idEmpresaUsuario = null;
  private String idSesionH = null;

  /**
   **/
  public Usuario nombreUsuario(String nombreUsuario) {
    this.nombreUsuario = nombreUsuario;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getNombreUsuario() {
    return nombreUsuario;
  }
  public void setNombreUsuario(String nombreUsuario) {
    this.nombreUsuario = nombreUsuario;
  }

  /**
   **/
  public Usuario idUsuario(String idUsuario) {
    this.idUsuario = idUsuario;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(String idUsuario) {
    this.idUsuario = idUsuario;
  }

  /**
   **/
  public Usuario fraseUsuario(String fraseUsuario) {
    this.fraseUsuario = fraseUsuario;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getFraseUsuario() {
    return fraseUsuario;
  }
  public void setFraseUsuario(String fraseUsuario) {
    this.fraseUsuario = fraseUsuario;
  }

  /**
   **/
  public Usuario rutaImagen(String rutaImagen) {
    this.rutaImagen = rutaImagen;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getRutaImagen() {
    return rutaImagen;
  }
  public void setRutaImagen(String rutaImagen) {
    this.rutaImagen = rutaImagen;
  }

  /**
   **/
  public Usuario tipoTokenUsuario(String tipoTokenUsuario) {
    this.tipoTokenUsuario = tipoTokenUsuario;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTipoTokenUsuario() {
    return tipoTokenUsuario;
  }
  public void setTipoTokenUsuario(String tipoTokenUsuario) {
    this.tipoTokenUsuario = tipoTokenUsuario;
  }

  /**
   **/
  public Usuario sesionUsuario(String sesionUsuario) {
    this.sesionUsuario = sesionUsuario;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getSesionUsuario() {
    return sesionUsuario;
  }
  public void setSesionUsuario(String sesionUsuario) {
    this.sesionUsuario = sesionUsuario;
  }

  /**
   **/
  public Usuario mensajeUsuario(String mensajeUsuario) {
    this.mensajeUsuario = mensajeUsuario;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getMensajeUsuario() {
    return mensajeUsuario;
  }
  public void setMensajeUsuario(String mensajeUsuario) {
    this.mensajeUsuario = mensajeUsuario;
  }

  /**
   **/
  public Usuario perfilUsuario(String perfilUsuario) {
    this.perfilUsuario = perfilUsuario;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getPerfilUsuario() {
    return perfilUsuario;
  }
  public void setPerfilUsuario(String perfilUsuario) {
    this.perfilUsuario = perfilUsuario;
  }

  /**
   **/
  public Usuario canalUsuario(String canalUsuario) {
    this.canalUsuario = canalUsuario;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getCanalUsuario() {
    return canalUsuario;
  }
  public void setCanalUsuario(String canalUsuario) {
    this.canalUsuario = canalUsuario;
  }

  /**
   **/
  public Usuario nombreCompleto(String nombreCompleto) {
    this.nombreCompleto = nombreCompleto;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getNombreCompleto() {
    return nombreCompleto;
  }
  public void setNombreCompleto(String nombreCompleto) {
    this.nombreCompleto = nombreCompleto;
  }

  /**
   **/
  public Usuario idTipoUsuario(String idTipoUsuario) {
    this.idTipoUsuario = idTipoUsuario;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getIdTipoUsuario() {
    return idTipoUsuario;
  }
  public void setIdTipoUsuario(String idTipoUsuario) {
    this.idTipoUsuario = idTipoUsuario;
  }

  /**
   **/
  public Usuario accesoExitoso(Boolean accesoExitoso) {
    this.accesoExitoso = accesoExitoso;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAccesoExitoso() {
    return accesoExitoso;
  }
  public void setAccesoExitoso(Boolean accesoExitoso) {
    this.accesoExitoso = accesoExitoso;
  }

  /**
   **/
  public Usuario usuarioDispositivoRSA(Boolean usuarioDispositivoRSA) {
    this.usuarioDispositivoRSA = usuarioDispositivoRSA;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Boolean getUsuarioDispositivoRSA() {
    return usuarioDispositivoRSA;
  }
  public void setUsuarioDispositivoRSA(Boolean usuarioDispositivoRSA) {
    this.usuarioDispositivoRSA = usuarioDispositivoRSA;
  }

  /**
   **/
  public Usuario usuarioRequiereToken(Boolean usuarioRequiereToken) {
    this.usuarioRequiereToken = usuarioRequiereToken;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Boolean getUsuarioRequiereToken() {
    return usuarioRequiereToken;
  }
  public void setUsuarioRequiereToken(Boolean usuarioRequiereToken) {
    this.usuarioRequiereToken = usuarioRequiereToken;
  }

  /**
   **/
  public Usuario usuarioBloqueado(Boolean usuarioBloqueado) {
    this.usuarioBloqueado = usuarioBloqueado;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Boolean getUsuarioBloqueado() {
    return usuarioBloqueado;
  }
  public void setUsuarioBloqueado(Boolean usuarioBloqueado) {
    this.usuarioBloqueado = usuarioBloqueado;
  }

  /**
   **/
  public Usuario usuarioEnrolado(Boolean usuarioEnrolado) {
    this.usuarioEnrolado = usuarioEnrolado;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Boolean getUsuarioEnrolado() {
    return usuarioEnrolado;
  }
  public void setUsuarioEnrolado(Boolean usuarioEnrolado) {
    this.usuarioEnrolado = usuarioEnrolado;
  }

  /**
   **/
  public Usuario ultimoAccesoUsuario(String ultimoAccesoUsuario) {
    this.ultimoAccesoUsuario = ultimoAccesoUsuario;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getUltimoAccesoUsuario() {
    return ultimoAccesoUsuario;
  }
  public void setUltimoAccesoUsuario(String ultimoAccesoUsuario) {
    this.ultimoAccesoUsuario = ultimoAccesoUsuario;
  }

  /**
   **/
  public Usuario empresaUsuario(String empresaUsuario) {
    this.empresaUsuario = empresaUsuario;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getEmpresaUsuario() {
    return empresaUsuario;
  }
  public void setEmpresaUsuario(String empresaUsuario) {
    this.empresaUsuario = empresaUsuario;
  }

  /**
   **/
  public Usuario idEmpresaUsuario(String idEmpresaUsuario) {
    this.idEmpresaUsuario = idEmpresaUsuario;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getIdEmpresaUsuario() {
    return idEmpresaUsuario;
  }
  public void setIdEmpresaUsuario(String idEmpresaUsuario) {
    this.idEmpresaUsuario = idEmpresaUsuario;
  }

  /**
   **/
  public Usuario idSesionH(String idSesionH) {
    this.idSesionH = idSesionH;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getIdSesionH() {
    return idSesionH;
  }
  public void setIdSesionH(String idSesionH) {
    this.idSesionH = idSesionH;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Usuario usuario = (Usuario) o;
    return Objects.equals(nombreUsuario, usuario.nombreUsuario) &&
        Objects.equals(idUsuario, usuario.idUsuario) &&
        Objects.equals(fraseUsuario, usuario.fraseUsuario) &&
        Objects.equals(rutaImagen, usuario.rutaImagen) &&
        Objects.equals(tipoTokenUsuario, usuario.tipoTokenUsuario) &&
        Objects.equals(sesionUsuario, usuario.sesionUsuario) &&
        Objects.equals(mensajeUsuario, usuario.mensajeUsuario) &&
        Objects.equals(perfilUsuario, usuario.perfilUsuario) &&
        Objects.equals(canalUsuario, usuario.canalUsuario) &&
        Objects.equals(nombreCompleto, usuario.nombreCompleto) &&
        Objects.equals(idTipoUsuario, usuario.idTipoUsuario) &&
        Objects.equals(accesoExitoso, usuario.accesoExitoso) &&
        Objects.equals(usuarioDispositivoRSA, usuario.usuarioDispositivoRSA) &&
        Objects.equals(usuarioRequiereToken, usuario.usuarioRequiereToken) &&
        Objects.equals(usuarioBloqueado, usuario.usuarioBloqueado) &&
        Objects.equals(usuarioEnrolado, usuario.usuarioEnrolado) &&
        Objects.equals(ultimoAccesoUsuario, usuario.ultimoAccesoUsuario) &&
        Objects.equals(empresaUsuario, usuario.empresaUsuario) &&
        Objects.equals(idEmpresaUsuario, usuario.idEmpresaUsuario) &&
        Objects.equals(idSesionH, usuario.idSesionH);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombreUsuario, idUsuario, fraseUsuario, rutaImagen, tipoTokenUsuario, sesionUsuario, mensajeUsuario, perfilUsuario, canalUsuario, nombreCompleto, idTipoUsuario, accesoExitoso, usuarioDispositivoRSA, usuarioRequiereToken, usuarioBloqueado, usuarioEnrolado, ultimoAccesoUsuario, empresaUsuario, idEmpresaUsuario, idSesionH);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Usuario {\n");
    
    sb.append("    nombreUsuario: ").append(toIndentedString(nombreUsuario)).append("\n");
    sb.append("    idUsuario: ").append(toIndentedString(idUsuario)).append("\n");
    sb.append("    fraseUsuario: ").append(toIndentedString(fraseUsuario)).append("\n");
    sb.append("    rutaImagen: ").append(toIndentedString(rutaImagen)).append("\n");
    sb.append("    tipoTokenUsuario: ").append(toIndentedString(tipoTokenUsuario)).append("\n");
    sb.append("    sesionUsuario: ").append(toIndentedString(sesionUsuario)).append("\n");
    sb.append("    mensajeUsuario: ").append(toIndentedString(mensajeUsuario)).append("\n");
    sb.append("    perfilUsuario: ").append(toIndentedString(perfilUsuario)).append("\n");
    sb.append("    canalUsuario: ").append(toIndentedString(canalUsuario)).append("\n");
    sb.append("    nombreCompleto: ").append(toIndentedString(nombreCompleto)).append("\n");
    sb.append("    idTipoUsuario: ").append(toIndentedString(idTipoUsuario)).append("\n");
    sb.append("    accesoExitoso: ").append(toIndentedString(accesoExitoso)).append("\n");
    sb.append("    usuarioDispositivoRSA: ").append(toIndentedString(usuarioDispositivoRSA)).append("\n");
    sb.append("    usuarioRequiereToken: ").append(toIndentedString(usuarioRequiereToken)).append("\n");
    sb.append("    usuarioBloqueado: ").append(toIndentedString(usuarioBloqueado)).append("\n");
    sb.append("    usuarioEnrolado: ").append(toIndentedString(usuarioEnrolado)).append("\n");
    sb.append("    ultimoAccesoUsuario: ").append(toIndentedString(ultimoAccesoUsuario)).append("\n");
    sb.append("    empresaUsuario: ").append(toIndentedString(empresaUsuario)).append("\n");
    sb.append("    idEmpresaUsuario: ").append(toIndentedString(idEmpresaUsuario)).append("\n");
    sb.append("    idSesionH: ").append(toIndentedString(idSesionH)).append("\n");
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
