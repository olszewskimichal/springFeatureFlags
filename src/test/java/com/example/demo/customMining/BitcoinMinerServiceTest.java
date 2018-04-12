package com.example.demo.customMining;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test1")
@RunWith(SpringRunner.class)
public class BitcoinMinerServiceTest {

  @Autowired
  private CustomBitcoinMinerService bitcoinMinerService;

  @Test
  public void shouldIsExperimentalMiner() {
    //given
    //when
    //then
    assertTrue(bitcoinMinerService.isExperimentalMiner());
  }
}