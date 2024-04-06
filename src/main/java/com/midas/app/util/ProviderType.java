package com.midas.app.util;

public enum ProviderType {
  STRIPE("STRIPE");
  private String value;

  ProviderType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
