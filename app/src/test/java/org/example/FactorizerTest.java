package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class FactorizerTest {

  //tests 0 should be []
  @Test
  void testZero() {
    Factorizer factorizer = new Factorizer();

    assertEquals(new ArrayList<Integer>(), factorizer.primeFactors(0));
  }

  //tests 1 should be []
  @Test
  void testsOne() {
    Factorizer factorizer = new Factorizer();

    assertEquals(new ArrayList<Integer>(), factorizer.primeFactors(1));
  }

  //tests if prime number (7) should be [7]
  @Test
  void TestSeven() {
    Factorizer factorizer = new Factorizer();

    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(7);

    assertEquals(expected, factorizer.primeFactors(7));
  }

  //tests if prime number (71) should be [71]
  @Test
  void TestSeventyOne() {
    Factorizer factorizer = new Factorizer();

    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(71);

    assertEquals(expected, factorizer.primeFactors(71));
  }

  //tests 9 should be [3,3]
  @Test
  void testsNine() {
    Factorizer factorizer = new Factorizer();

    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(3);
    expected.add(3);

    assertEquals(expected, factorizer.primeFactors(9));
  }

  //tests 10 should be [2,5]
  @Test
  void itReturnsTwoFactorsForTen() {
    Factorizer factorizer = new Factorizer();

    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(2);
    expected.add(5);

    assertEquals(expected, factorizer.primeFactors(10));
  }

  //tests 100 should be [2,2,5,5]
  @Test
  void testsOneHundred() {
    Factorizer factorizer = new Factorizer();

    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(2);
    expected.add(2);
    expected.add(5);
    expected.add(5);

    assertEquals(expected, factorizer.primeFactors(100));
  }

  //should be [2,2,3]
  @Test
  void testsTwelve() {
    Factorizer factorizer = new Factorizer();

    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(2);
    expected.add(2);
    expected.add(3);

    assertEquals(expected, factorizer.primeFactors(12));
  }

  @Test
  void itReturnsAnEmptyListForNegativeNumbers() {
    Factorizer factorizer = new Factorizer();

    assertEquals(new ArrayList<Integer>(), factorizer.primeFactors(-5)); }
}

