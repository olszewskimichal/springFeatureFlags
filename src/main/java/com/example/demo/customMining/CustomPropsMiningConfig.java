package com.example.demo.customMining;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomPropsMiningConfig {

  @Bean
  @ConditionalOnProperty(
      name = "features.experimental", havingValue = "false", matchIfMissing = true)
  public CustomBitcoinMiner customDefaultMiner() {
    return new CustomDefaultBitcoinMiner();
  }

  @Bean
  @ConditionalOnProperty(
      name = "features.experimental", havingValue = "true")
  public CustomBitcoinMiner customExperimentalMiner() {
    return new CustomExperimentalBitcoinMiner();
  }
}