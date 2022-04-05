public class PrimeHappy {

  private static boolean isPrime(int n) {
    boolean flag = true;
    if (n <= 1)
      flag = false;
    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0) {
        flag = false;
      }
    }
    return flag;
  }

  private static int isPrimeHappy(int n) {
    int sum = 0;
    if (n <= 2)
      return 0;
    for (int i = 2; i < n; i++) {
      if (isPrime(i)) {
        sum += i;
      }
    }

    if (sum % n == 0) {
      int quotient = sum / n;
      if (quotient % 2 == 0)
        return 1;
      else
        return 0;
    }
    return 0;

  }

  public static void main(String[] args) {
    int arr[] = {};
    int result = isPrimeHappy(3);
    System.out.println(result);
  }
}
