public class recursive {


  public static double newtonsroot(double n) {
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

  public static void main(String[] args) {
    System.out.println(newtonsroot(100));
    System.out.println(newtonsroot(2));
  }



}
