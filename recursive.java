import java.util.*;

public class recursive {


//NEWTONS SQRT METHOD
  public static double sqrt(double n) {
    return newtonshelper(n, 1);
  }

  private static double newtonshelper(double n, double guess) {
    if (n == 0) {
      return 0;
    }
    if ( Math.abs((((guess * guess - n) / n) * 100)) <= .001) {
      return guess;
    }
    return newtonshelper(n, ((n / guess + guess) / 2));
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
        return 1;
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







//tester
  public static void main(String[] args) {
    System.out.println(sqrt(100));
    System.out.println(sqrt(2));

    System.out.println(fib(0));
    System.out.println(fib(1));
    System.out.println(fib(5));
    System.out.println(fib(7));

    System.out.println(makeAllSums(1)); //return 0,1
    System.out.println(makeAllSums(2)); //return 0,1,2,3
    System.out.println(makeAllSums(3)); //return 0,1,2,3,3,4,5,6
    System.out.println(makeAllSums(4)); //return 0,1,2,3,3,4,5,6,4,5,6,7,7,8,9,10
    System.out.println(makeAllSums(0)); //return 0
  }



}
