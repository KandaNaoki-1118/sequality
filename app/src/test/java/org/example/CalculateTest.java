package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {

  @Test
  public void testSumTwoNumbers() {
    Calculate calculate = new Calculate();
    assertEquals(5, calculate.sum(2, 3));
  }

  @Test
  public void testSumArray() {
    Calculate calculate = new Calculate();
    int[] numbers = { 1, 2, 3, 4, 5 };
    assertEquals(15, calculate.sum(numbers));
  }

  @Test
  public void testAverageArray() {
    Calculate calculate = new Calculate();
    int[] numbers = { 1, 2, 3, 4, 5 };
    assertEquals(3.0, calculate.average(numbers), 0.0001);
  }
}
