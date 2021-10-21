package io.CdcExpediente.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class ResponseExportFile {
  @SerializedName("message")
  private MessageObject message = null;
  @SerializedName("numeroFolio")
  private String numeroFolio = null;
  @SerializedName("fechaRegistro")
  private String fechaRegistro = null;
  @SerializedName("urlZipFile")
  private String urlZipFile = null;
  @SerializedName("formularios")
  private List<FormObject> formularios = new ArrayList<FormObject>();
  @SerializedName("ficoScore")
  private FicoObject ficoScore = null;
  @SerializedName("indicadores")
  private List<IndicatorObject> indicadores = new ArrayList<IndicatorObject>();
  @SerializedName("rechazos")
  private List<RejectObject> rechazos = new ArrayList<RejectObject>();
  @SerializedName("rechazosDirectos")
  private List<DirectRejectionObject> rechazosDirectos = new ArrayList<DirectRejectionObject>();

  public ResponseExportFile message(MessageObject message) {
    this.message = message;
    return this;
  }

  public MessageObject getMessage() {
    return message;
  }

  public void setMessage(MessageObject message) {
    this.message = message;
  }

  public ResponseExportFile numeroFolio(String numeroFolio) {
    this.numeroFolio = numeroFolio;
    return this;
  }

  public String getNumeroFolio() {
    return numeroFolio;
  }

  public void setNumeroFolio(String numeroFolio) {
    this.numeroFolio = numeroFolio;
  }

  public ResponseExportFile fechaRegistro(String fechaRegistro) {
    this.fechaRegistro = fechaRegistro;
    return this;
  }

  public String getFechaRegistro() {
    return fechaRegistro;
  }

  public void setFechaRegistro(String fechaRegistro) {
    this.fechaRegistro = fechaRegistro;
  }

  public ResponseExportFile urlZipFile(String urlZipFile) {
    this.urlZipFile = urlZipFile;
    return this;
  }

  public String getUrlZipFile() {
    return urlZipFile;
  }

  public void setUrlZipFile(String urlZipFile) {
    this.urlZipFile = urlZipFile;
  }

  public ResponseExportFile formularios(List<FormObject> formularios) {
    this.formularios = formularios;
    return this;
  }

  public ResponseExportFile addFormulariosItem(FormObject formulariosItem) {
    this.formularios.add(formulariosItem);
    return this;
  }

  public List<FormObject> getFormularios() {
    return formularios;
  }

  public void setFormularios(List<FormObject> formularios) {
    this.formularios = formularios;
  }

  public ResponseExportFile ficoScore(FicoObject ficoScore) {
    this.ficoScore = ficoScore;
    return this;
  }

  public FicoObject getFicoScore() {
    return ficoScore;
  }

  public void setFicoScore(FicoObject ficoScore) {
    this.ficoScore = ficoScore;
  }

  public ResponseExportFile indicadores(List<IndicatorObject> indicadores) {
    this.indicadores = indicadores;
    return this;
  }

  public ResponseExportFile addIndicadoresItem(IndicatorObject indicadoresItem) {
    this.indicadores.add(indicadoresItem);
    return this;
  }

  public List<IndicatorObject> getIndicadores() {
    return indicadores;
  }

  public void setIndicadores(List<IndicatorObject> indicadores) {
    this.indicadores = indicadores;
  }

  public ResponseExportFile rechazos(List<RejectObject> rechazos) {
    this.rechazos = rechazos;
    return this;
  }

  public ResponseExportFile addRechazosItem(RejectObject rechazosItem) {
    this.rechazos.add(rechazosItem);
    return this;
  }

  public List<RejectObject> getRechazos() {
    return rechazos;
  }

  public void setRechazos(List<RejectObject> rechazos) {
    this.rechazos = rechazos;
  }

  public ResponseExportFile rechazosDirectos(List<DirectRejectionObject> rechazosDirectos) {
    this.rechazosDirectos = rechazosDirectos;
    return this;
  }

  public ResponseExportFile addRechazosDirectosItem(DirectRejectionObject rechazosDirectosItem) {
    this.rechazosDirectos.add(rechazosDirectosItem);
    return this;
  }

  public List<DirectRejectionObject> getRechazosDirectos() {
    return rechazosDirectos;
  }

  public void setRechazosDirectos(List<DirectRejectionObject> rechazosDirectos) {
    this.rechazosDirectos = rechazosDirectos;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseExportFile responseExportFile = (ResponseExportFile) o;
    return Objects.equals(this.message, responseExportFile.message)
        && Objects.equals(this.numeroFolio, responseExportFile.numeroFolio)
        && Objects.equals(this.fechaRegistro, responseExportFile.fechaRegistro)
        && Objects.equals(this.urlZipFile, responseExportFile.urlZipFile)
        && Objects.equals(this.formularios, responseExportFile.formularios)
        && Objects.equals(this.ficoScore, responseExportFile.ficoScore)
        && Objects.equals(this.indicadores, responseExportFile.indicadores)
        && Objects.equals(this.rechazos, responseExportFile.rechazos)
        && Objects.equals(this.rechazosDirectos, responseExportFile.rechazosDirectos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, numeroFolio, fechaRegistro, urlZipFile, formularios, ficoScore, indicadores, rechazos,
        rechazosDirectos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseExportFile {\n");

    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    numeroFolio: ").append(toIndentedString(numeroFolio)).append("\n");
    sb.append("    fechaRegistro: ").append(toIndentedString(fechaRegistro)).append("\n");
    sb.append("    urlZipFile: ").append(toIndentedString(urlZipFile)).append("\n");
    sb.append("    formularios: ").append(toIndentedString(formularios)).append("\n");
    sb.append("    ficoScore: ").append(toIndentedString(ficoScore)).append("\n");
    sb.append("    indicadores: ").append(toIndentedString(indicadores)).append("\n");
    sb.append("    rechazos: ").append(toIndentedString(rechazos)).append("\n");
    sb.append("    rechazosDirectos: ").append(toIndentedString(rechazosDirectos)).append("\n");
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
