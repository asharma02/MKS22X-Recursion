import java.util.*;

public class recursion {


//NEWTONS SQRT METHOD
  public static double sqrt(double n, double tolerance) {
    return newtonshelper(n, 1, tolerance);
  }

  private static double newtonshelper(double n, double guess, double tolerance) {
    if (n == 0) {
      return 0;
    }
    if ( Math.abs((((guess * guess - n) / n) * 100)) <= tolerance) {
      return guess;
    }
    return newtonshelper(n, ((n / guess + guess) / 2), tolerance);
  }



//fib
/*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
      return fibhelper(n, 0, 1);
    }

    private static int fibhelper(int n, int h, int k){
      if (n == 0) {
        return h;
      }
      if (n == 1) {
        return k;
      }
      return fibhelper(n-1, k, k + h); //params = counter, the first sum, then the second sum added
    }

    public static ArrayList<Integer> makeAllSums(int n){
      ArrayList<Integer> sum = new ArrayList<Integer>();
      makesumshelper(n, 0, sum);
      return sum;
   }

   private static void makesumshelper(int n, int sumcurrent, ArrayList<Integer> sum) {
     if (n == 0) {
       sum.add(sumcurrent);
     }
     else {
       makesumshelper(n - 1, sumcurrent, sum);
       makesumshelper(n - 1, sumcurrent + n, sum);
     }
   }
}
