package io.CdcExpediente.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class RequestExportProceedings {
  @SerializedName("folio")
  private Long folio = null;

  public RequestExportProceedings folio(Long folio) {
    this.folio = folio;
    return this;
  }

  public Long getFolio() {
    return folio;
  }

  public void setFolio(Long folio) {
    this.folio = folio;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestExportProceedings requestExportProceedings = (RequestExportProceedings) o;
    return Objects.equals(this.folio, requestExportProceedings.folio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(folio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestExportProceedings {\n");

    sb.append("    folio: ").append(toIndentedString(folio)).append("\n");
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
