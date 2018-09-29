package com.walking.techie;

import com.walking.techie.config.ErrorCodeConfig;
import com.walking.techie.model.ErrorDetails;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Map;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
    ErrorCodeConfig propertiesFileBean = applicationContext.getBean(ErrorCodeConfig.class);
    Map<String, ErrorDetails> keyValuePair = propertiesFileBean.getErrorDescriptionMapping();
    for (String key : keyValuePair.keySet()) {
      System.out.println("Key:: " + key + " value:: " + keyValuePair.get(key));
    }
  }
}
