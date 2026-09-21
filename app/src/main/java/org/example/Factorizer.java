package org.example;

import java.util.ArrayList;

public class Factorizer {

  public ArrayList<Integer> primeFactors(Integer n) {
    ArrayList<Integer> factors = new ArrayList<>();

    //no factors to find
    if (n <= 1) {
      return factors;
    }

    //initial test factor
    int factor = 2;

    //will check for more factors
    while (n > 1) {
      if (n % factor == 0) {
        factors.add(factor);
        n = n / factor;
      } else {
        factor++;
      }
    }

    return factors;
  }
}