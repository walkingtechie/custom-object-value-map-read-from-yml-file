package com.walking.techie.config;

import com.walking.techie.model.ErrorDetails;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "error-code-meaning")
@PropertySource("application.yml")
public class ErrorCodeConfig {
  private Map<String, ErrorDetails> errorDescriptionMapping;

  public Map<String, ErrorDetails> getErrorDescriptionMapping() {
    return errorDescriptionMapping;
  }

  public void setErrorDescriptionMapping(Map<String, ErrorDetails> errorDescriptionMapping) {
    this.errorDescriptionMapping = errorDescriptionMapping;
  }
}
