package org.example;

public class App {
  public static void main(String[] args) {
    Factorizer factorizer = new Factorizer();

    System.out.println(factorizer.primeFactors(0)); //will return array list []
    System.out.println(factorizer.primeFactors(1)); //will return arrat list []

    //(because 3 and 3 and both prime and they multiple to 9)
    System.out.println(factorizer.primeFactors(9)); //will return array list [3, 3] 
    System.out.println(factorizer.primeFactors(10)); //will return array list [2, 5]

    //(2*2*5*5=100)
    System.out.println(factorizer.primeFactors(100)); //will return array list [2, 2, 5, 5]
    System.out.println(factorizer.primeFactors(35)); //will return array list [5, 7]

    //will print 7 since there isn't a way to multiple to 7 
    //prime numbers just print themselves
    System.out.println(factorizer.primeFactors(7)); //will return [7]
    System.out.println(factorizer.primeFactors(71)); //winn return [71]

    //I'll have it return an empty string but I think negative numbers can also be factorized
    System.out.println(factorizer.primeFactors(-5)); //will return []
  }
}
