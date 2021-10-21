package io.CdcExpediente.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class SectionObject {
  @SerializedName("nombreSeccion")
  private String nombreSeccion = null;
  @SerializedName("preguntas")
  private List<QuestionObject> preguntas = new ArrayList<QuestionObject>();

  public SectionObject nombreSeccion(String nombreSeccion) {
    this.nombreSeccion = nombreSeccion;
    return this;
  }

  public String getNombreSeccion() {
    return nombreSeccion;
  }

  public void setNombreSeccion(String nombreSeccion) {
    this.nombreSeccion = nombreSeccion;
  }

  public SectionObject preguntas(List<QuestionObject> preguntas) {
    this.preguntas = preguntas;
    return this;
  }

  public SectionObject addPreguntasItem(QuestionObject preguntasItem) {
    this.preguntas.add(preguntasItem);
    return this;
  }

  public List<QuestionObject> getPreguntas() {
    return preguntas;
  }

  public void setPreguntas(List<QuestionObject> preguntas) {
    this.preguntas = preguntas;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SectionObject sectionObject = (SectionObject) o;
    return Objects.equals(this.nombreSeccion, sectionObject.nombreSeccion)
        && Objects.equals(this.preguntas, sectionObject.preguntas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombreSeccion, preguntas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SectionObject {\n");

    sb.append("    nombreSeccion: ").append(toIndentedString(nombreSeccion)).append("\n");
    sb.append("    preguntas: ").append(toIndentedString(preguntas)).append("\n");
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
