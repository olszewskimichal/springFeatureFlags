package com.example.demo.bitcoin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfiledMiningConfig {
 
    @Bean
    @Profile("!experimental-miner")
    public BitcoinMiner defaultMiner() {
        return new DefaultBitcoinMiner();
    }
 
    @Bean
    @Profile("experimental-miner")
    public BitcoinMiner experimentalMiner() {
        return new ExperimentalBitcoinMiner();
    }
}