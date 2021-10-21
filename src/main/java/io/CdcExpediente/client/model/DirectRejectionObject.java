package io.CdcExpediente.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class DirectRejectionObject {
  @SerializedName("descripcion")
  private String descripcion = null;

  public DirectRejectionObject descripcion(String descripcion) {
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
    DirectRejectionObject directRejectionObject = (DirectRejectionObject) o;
    return Objects.equals(this.descripcion, directRejectionObject.descripcion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descripcion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectRejectionObject {\n");

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
