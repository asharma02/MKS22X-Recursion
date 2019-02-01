public class recursive {

//NEWTONS SQRT METHOD
  public static double sqrt(double n) {
    return newtonshelper(n, 1);
  }

  public static double newtonshelper(double n, double guess) {
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

    }












//tester
  public static void main(String[] args) {
    System.out.println(sqrt(100));
    System.out.println(sqrt(2));
  }



}
