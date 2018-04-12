package com.example.demo.bitcoin;

import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("standard-miner")
@RunWith(SpringRunner.class)
public class BitcoinMinerServiceTest2 {

  @Autowired
  private BitcoinMinerService bitcoinMinerService;

  @Test
  public void shouldNotIsExperimentalMiner() {
    //given
    //when
    //then
    assertFalse(bitcoinMinerService.isExperimentalMiner());
  }
}