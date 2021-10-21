package io.CdcExpediente.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class QuestionObject {
  @SerializedName("pregunta")
  private String pregunta = null;
  @SerializedName("respuesta")
  private String respuesta = null;

  public QuestionObject pregunta(String pregunta) {
    this.pregunta = pregunta;
    return this;
  }

  public String getPregunta() {
    return pregunta;
  }

  public void setPregunta(String pregunta) {
    this.pregunta = pregunta;
  }

  public QuestionObject respuesta(String respuesta) {
    this.respuesta = respuesta;
    return this;
  }

  public String getRespuesta() {
    return respuesta;
  }

  public void setRespuesta(String respuesta) {
    this.respuesta = respuesta;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionObject questionObject = (QuestionObject) o;
    return Objects.equals(this.pregunta, questionObject.pregunta)
        && Objects.equals(this.respuesta, questionObject.respuesta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pregunta, respuesta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionObject {\n");

    sb.append("    pregunta: ").append(toIndentedString(pregunta)).append("\n");
    sb.append("    respuesta: ").append(toIndentedString(respuesta)).append("\n");
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
