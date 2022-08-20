public class ClosestFibonaci {

  private static int closestFibonaci(int n) {

    if (n < 1)
      return 0;

    int fib1 = 0;
    int fib2 = 1;
    while (true) {
      int nextFib = fib1 + fib2;

      if (nextFib == n) {
        return nextFib;
      } else if (nextFib > n)
        return fib2;
      fib1 = fib2;
      fib2 = nextFib;
    }

  }

  public static void main(String[] args) {
    int result = closestFibonaci(13);
    System.out.println(result);
  }
}
