public class TwinPrime {
  static boolean isPrime(int n) {
    if (n < 2)
      return false;
    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0)
        return false;
    }
    return true;
  }

  static int isTwinPrime(int n) {
    if (!isPrime(n))
      return 0;
    int nextNum = n + 2;
    int prevNum = n - 2;
    if (isPrime(nextNum) || isPrime(prevNum))
      return 1;
    return 0;
  }

  public static void main(String[] args) {
    int result = isTwinPrime(23);
    System.out.println(result);
  }
}
