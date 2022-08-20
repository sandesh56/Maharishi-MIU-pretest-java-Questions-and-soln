public class FactorialPrime {
  /**
   * finding prime
   */
  private static boolean isPrime(int n) {
    boolean primeFlag = true;
    if (n < 2)
      primeFlag = false;
    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0) {
        primeFlag = false;
        break;
      }
    }

    return primeFlag;
  }

  /**
   * finding factorial
   */
  private static int factorial(int n) {
    if (n == 0)
      return 1;

    int factors = n * factorial(n - 1);
    return factors;
  }

  /**
   * 
   * checking factorial prime
   */
  private static int isFactorialPrime(int n) {

    if (isPrime(n)) {
      for (int i = 0; i <= n; i++) {
        int sum = factorial(i) + 1;
        if (sum == n) {
          return 1;
        } else if (sum > n)
          break;
      }
    }

    return 0;
  }

  public static void main(String[] args) {
    int result = isFactorialPrime(967);
    System.out.println(result);
  }

}
