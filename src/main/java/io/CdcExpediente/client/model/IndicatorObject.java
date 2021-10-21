package io.CdcExpediente.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class IndicatorObject {
  @SerializedName("nombreIndicador")
  private String nombreIndicador = null;
  @SerializedName("valor")
  private String valor = null;

  public IndicatorObject nombreIndicador(String nombreIndicador) {
    this.nombreIndicador = nombreIndicador;
    return this;
  }

  public String getNombreIndicador() {
    return nombreIndicador;
  }

  public void setNombreIndicador(String nombreIndicador) {
    this.nombreIndicador = nombreIndicador;
  }

  public IndicatorObject valor(String valor) {
    this.valor = valor;
    return this;
  }

  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndicatorObject indicatorObject = (IndicatorObject) o;
    return Objects.equals(this.nombreIndicador, indicatorObject.nombreIndicador)
        && Objects.equals(this.valor, indicatorObject.valor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombreIndicador, valor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndicatorObject {\n");

    sb.append("    nombreIndicador: ").append(toIndentedString(nombreIndicador)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
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
