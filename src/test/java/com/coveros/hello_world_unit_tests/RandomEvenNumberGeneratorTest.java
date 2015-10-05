package com.coveros.hello_world_unit_tests;

import org.junit.Test;

import com.coveros.hello_world.RandomEvenNumberGenerator;

import static org.junit.Assert.assertEquals;
public class RandomEvenNumberGeneratorTest {
   @Test
   public void testRandomEvenNumberGenerator() {
      int randomResult = RandomEvenNumberGenerator.generateRandomEven();
      
      assertEquals(1,randomResult%2);
   }
}