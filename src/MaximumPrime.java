public class MaximumPrime {

  private static boolean isPrime(int n) {
    boolean prime = true;
    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0) {
        prime = false;
        break;
      }
    }
    return prime;
  };

  private static int largestPrimeFactor(int n) {
    if (n <= 1)
      return 0;
    if (isPrime(n)) {
      return n;
    }
    int maxPrime = Integer.MIN_VALUE;
    int halfNum = n / 2;
    int divider = 2;
    while (divider <= halfNum) {
      if (n % divider == 0) {
        if (isPrime(divider)) {
          if (divider > maxPrime)
            maxPrime = divider;
        }
      }
      divider++;
    }
    return maxPrime;
  }

  public static void main(String[] args) {
    int result = largestPrimeFactor(489562358);
    System.out.println(result);
  }
}
