package io.CdcExpediente.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class ReasonObject {
  @SerializedName("clave")
  private String clave = null;
  @SerializedName("descripcion")
  private String descripcion = null;

  public ReasonObject clave(String clave) {
    this.clave = clave;
    return this;
  }

  public String getClave() {
    return clave;
  }

  public void setClave(String clave) {
    this.clave = clave;
  }

  public ReasonObject descripcion(String descripcion) {
    this.descripcion = descripcion;
    return this;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReasonObject reasonObject = (ReasonObject) o;
    return Objects.equals(this.clave, reasonObject.clave) && Objects.equals(this.descripcion, reasonObject.descripcion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clave, descripcion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReasonObject {\n");

    sb.append("    clave: ").append(toIndentedString(clave)).append("\n");
    sb.append("    descripcion: ").append(toIndentedString(descripcion)).append("\n");
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
