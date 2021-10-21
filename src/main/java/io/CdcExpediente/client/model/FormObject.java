package io.CdcExpediente.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;


public class FormObject {
  @SerializedName("nombreFormulario")
  private String nombreFormulario = null;
  @SerializedName("secciones")
  private List<SectionObject> secciones = new ArrayList<SectionObject>();
  public FormObject nombreFormulario(String nombreFormulario) {
    this.nombreFormulario = nombreFormulario;
    return this;
  }
   
  
  public String getNombreFormulario() {
    return nombreFormulario;
  }
  public void setNombreFormulario(String nombreFormulario) {
    this.nombreFormulario = nombreFormulario;
  }
  public FormObject secciones(List<SectionObject> secciones) {
    this.secciones = secciones;
    return this;
  }
  public FormObject addSeccionesItem(SectionObject seccionesItem) {
    this.secciones.add(seccionesItem);
    return this;
  }
   
  
  public List<SectionObject> getSecciones() {
    return secciones;
  }
  public void setSecciones(List<SectionObject> secciones) {
    this.secciones = secciones;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormObject formObject = (FormObject) o;
    return Objects.equals(this.nombreFormulario, formObject.nombreFormulario) &&
        Objects.equals(this.secciones, formObject.secciones);
  }
  @Override
  public int hashCode() {
    return Objects.hash(nombreFormulario, secciones);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormObject {\n");
    
    sb.append("    nombreFormulario: ").append(toIndentedString(nombreFormulario)).append("\n");
    sb.append("    secciones: ").append(toIndentedString(secciones)).append("\n");
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
