package edu.cnm.deepdive.euclid;

/**
 * Implements the classic Euclid alogorithm for finding the GCD of 2
 * integers.   When run as a Java apllication.
 *
 * @author cyeef
 */

public class Euclid {
  /**Format string used for disply of input values and GCD. */

  public static final String DISPLAY_FORMAT = "GCD(%,d, %,d)) = %,d%n";

  public static void main(String[]args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int gcd = gcd(a, b);
    System.out.printf(DISPLAY_FORMAT, a, b, gcd);

  }

  /**
   * modular division form of Euclid algorithim
   *
   * @param a
   * @param b
   * @return GCD of <code>a</code> and <code>b</code>
   */
  public static int gcd(int a, int b) {
    // modular math format */
    a = Math.abs(a);
    b = Math.abs(b);
    int c = Math.max(a, b);
    b = Math.min(a, b);
    a= c;
    while (b > 0) {
      c = a % b;
      a = b;
      b = c;
    }
    //Below code is for the classical Euclid algorithms with a if and while statement.
    /*if (a == 0 || b == 0) {
      return Math.max(a,b);

    }
    while (a !=b) {
     if (a >b){
       a-=b;
      }else{
        b-=a;
      }
    }*/
    return a;
    }
  }