package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class FactorizerTest {

  @Test
  void testZero() {
    Factorizer factorizer = new Factorizer();

    assertEquals(new ArrayList<Integer>(), factorizer.primeFactors(0));
  }

  //tests 1
  @Test
  void testsOne() {
    Factorizer factorizer = new Factorizer();

    assertEquals(new ArrayList<Integer>(), factorizer.primeFactors(1));
  }

  //tests empty list 
  @Test
  void testsAnEmptyListForNegativeNumbers() {
    Factorizer factorizer = new Factorizer();

    assertEquals(new ArrayList<Integer>(), factorizer.primeFactors(-5));
  }

  //tests if prime number (7) 
  @Test
  void TestSeven() {
    Factorizer factorizer = new Factorizer();

    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(7);

    assertEquals(expected, factorizer.primeFactors(7));
  }

  //tests 9
  @Test
  void itReturnsTwoFactorsForNine() {
    Factorizer factorizer = new Factorizer();

    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(3);
    expected.add(3);

    assertEquals(expected, factorizer.primeFactors(9));
  }

  //tests 10
  @Test
  void itReturnsTwoFactorsForTen() {
    Factorizer factorizer = new Factorizer();

    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(2);
    expected.add(5);

    assertEquals(expected, factorizer.primeFactors(10));
  }

  @Test
  void itReturnsFourFactorsForOneHundred() {
    Factorizer factorizer = new Factorizer();

    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(2);
    expected.add(2);
    expected.add(5);
    expected.add(5);

    assertEquals(expected, factorizer.primeFactors(100));
  }

  @Test
  void itReturnsThreeFactorsForTwelve() {
    Factorizer factorizer = new Factorizer();

    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(2);
    expected.add(2);
    expected.add(3);

    assertEquals(expected, factorizer.primeFactors(12));
  }
}