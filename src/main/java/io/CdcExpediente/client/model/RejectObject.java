package io.CdcExpediente.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class RejectObject {
  @SerializedName("tipoRechazo")
  private String tipoRechazo = null;
  @SerializedName("descripcionRechazo")
  private String descripcionRechazo = null;
  @SerializedName("ingresado")
  private String ingresado = null;

  public RejectObject tipoRechazo(String tipoRechazo) {
    this.tipoRechazo = tipoRechazo;
    return this;
  }

  public String getTipoRechazo() {
    return tipoRechazo;
  }

  public void setTipoRechazo(String tipoRechazo) {
    this.tipoRechazo = tipoRechazo;
  }

  public RejectObject descripcionRechazo(String descripcionRechazo) {
    this.descripcionRechazo = descripcionRechazo;
    return this;
  }

  public String getDescripcionRechazo() {
    return descripcionRechazo;
  }

  public void setDescripcionRechazo(String descripcionRechazo) {
    this.descripcionRechazo = descripcionRechazo;
  }

  public RejectObject ingresado(String ingresado) {
    this.ingresado = ingresado;
    return this;
  }

  public String getIngresado() {
    return ingresado;
  }

  public void setIngresado(String ingresado) {
    this.ingresado = ingresado;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RejectObject rejectObject = (RejectObject) o;
    return Objects.equals(this.tipoRechazo, rejectObject.tipoRechazo)
        && Objects.equals(this.descripcionRechazo, rejectObject.descripcionRechazo)
        && Objects.equals(this.ingresado, rejectObject.ingresado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoRechazo, descripcionRechazo, ingresado);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RejectObject {\n");

    sb.append("    tipoRechazo: ").append(toIndentedString(tipoRechazo)).append("\n");
    sb.append("    descripcionRechazo: ").append(toIndentedString(descripcionRechazo)).append("\n");
    sb.append("    ingresado: ").append(toIndentedString(ingresado)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
