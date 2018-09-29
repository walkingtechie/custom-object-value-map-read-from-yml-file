package com.walking.techie.model;

public class ErrorDetails {
  private String errorCode;
  private String meaning;
  private Integer httpStatusCode;

  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public String getMeaning() {
    return meaning;
  }

  public void setMeaning(String meaning) {
    this.meaning = meaning;
  }

  public Integer getHttpStatusCode() {
    return httpStatusCode;
  }

  public void setHttpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }

  @Override
  public String toString() {
    return "ErrorDetails{"
        + "errorCode='"
        + errorCode
        + '\''
        + ", meaning='"
        + meaning
        + '\''
        + ", httpStatusCode="
        + httpStatusCode
        + '}';
  }
}
