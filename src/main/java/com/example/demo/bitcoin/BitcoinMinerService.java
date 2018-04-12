package com.example.demo.bitcoin;

import org.springframework.stereotype.Service;

@Service
public class BitcoinMinerService {

  private final BitcoinMiner bitcoinMiner;

  public BitcoinMinerService(BitcoinMiner bitcoinMiner) {
    this.bitcoinMiner = bitcoinMiner;
  }

  public boolean isExperimentalMiner() {
    return bitcoinMiner instanceof ExperimentalBitcoinMiner;
  }
}
