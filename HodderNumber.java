public class HodderNumber {
  /**
   * prime check
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

  private static int isHodderNumber(int n) {
    if (isPrime(n)) {
      int tempNum = n;
      while (tempNum > 0) {
        int result = (int) Math.pow(2, tempNum) - 1;
        if (result == n)
          return 1;
        tempNum--;
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    int result = isHodderNumber(127);
    System.out.println(result);
  }

}
