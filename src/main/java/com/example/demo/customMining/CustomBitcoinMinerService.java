package com.example.demo.customMining;

import org.springframework.stereotype.Service;

@Service
public class CustomBitcoinMinerService {

  private final CustomBitcoinMiner customBitcoinMiner;

  public CustomBitcoinMinerService(CustomBitcoinMiner customBitcoinMiner) {
    this.customBitcoinMiner = customBitcoinMiner;
  }

  public boolean isExperimentalMiner() {
    return customBitcoinMiner instanceof CustomExperimentalBitcoinMiner;
  }
}
