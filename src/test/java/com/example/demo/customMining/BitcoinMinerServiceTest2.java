package com.example.demo.customMining;

import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test2")
@RunWith(SpringRunner.class)
public class BitcoinMinerServiceTest2 {

  @Autowired
  private CustomBitcoinMinerService bitcoinMinerService;

  @Test
  public void shouldNotIsExperimentalMiner() {
    //given
    //when
    //then
    assertFalse(bitcoinMinerService.isExperimentalMiner());
  }
}