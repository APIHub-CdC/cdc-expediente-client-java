package io.CdcExpediente.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class FicoObject {
  @SerializedName("score")
  private Long score = null;
  @SerializedName("razones")
  private List<ReasonObject> razones = new ArrayList<ReasonObject>();

  public FicoObject score(Long score) {
    this.score = score;
    return this;
  }

  public Long getScore() {
    return score;
  }

  public void setScore(Long score) {
    this.score = score;
  }

  public FicoObject razones(List<ReasonObject> razones) {
    this.razones = razones;
    return this;
  }

  public FicoObject addRazonesItem(ReasonObject razonesItem) {
    this.razones.add(razonesItem);
    return this;
  }

  public List<ReasonObject> getRazones() {
    return razones;
  }

  public void setRazones(List<ReasonObject> razones) {
    this.razones = razones;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FicoObject ficoObject = (FicoObject) o;
    return Objects.equals(this.score, ficoObject.score) && Objects.equals(this.razones, ficoObject.razones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, razones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FicoObject {\n");

    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    razones: ").append(toIndentedString(razones)).append("\n");
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
