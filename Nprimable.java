public class Nprimable {
  private static boolean isPrime(int n) {
    if (n < 2)
      return false;
    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0)
        return false;
    }
    return true;
  };

  private static int isNPrimable(int[] a, int n) {
    if (a.length == 0)
      return 1;
    for (int i = 0; i < a.length; i++) {
      if (!isPrime(a[i] + n))
        return 0;
    }
    return 1;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 5, 1, 1, 1, 1, 1 };
    int result = isNPrimable(arr, 4);
    System.out.println(result);
  }
}
