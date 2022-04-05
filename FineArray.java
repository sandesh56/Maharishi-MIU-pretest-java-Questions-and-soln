public class FineArray {
  static boolean isPrime(int n) {
    if (n < 2)
      return false;
    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0)
        return false;
    }
    return true;
  }

  static int isFineArray(int[] a) {
    boolean hasTwinPrime = false;
    for (int i : a) {
      if (isPrime(i)) {
        for (int j : a) {
          if (isPrime(j)) {
            if (j == i - 2 || j == i + 2) {
              hasTwinPrime = true;
              break;
            }
          }
        }
        if (!hasTwinPrime)
          return 0;
      }
    }
    return 1;
  }

  public static void main(String[] args) {
    int arr[] = { 4, 7, 9, 6 };
    int result = isFineArray(arr);
    System.out.println(result);
  }
}
