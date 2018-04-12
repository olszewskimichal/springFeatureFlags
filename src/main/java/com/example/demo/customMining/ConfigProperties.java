package com.example.demo.customMining;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "features")
public class ConfigProperties {

  private boolean experimental = false;

  public boolean getExperimental() {
    return experimental;
  }

  public void setExperimental(boolean experimental) {
    this.experimental = experimental;
  }
}