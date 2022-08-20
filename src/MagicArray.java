public class MagicArray {
  static boolean isPrime(int n) {
    if (n < 2)
      return false;
    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0)
        return false;
    }
    return true;
  };

  static int isMagic(int[] a) {
    if (a.length < 1)
      return 0;
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      if (i != 0 && isPrime(a[i])) {
        sum += a[i];
      }
    }
    if (sum == 0 && (isPrime(a[0]) || a[0] == 0))
      return 1;
    else if (sum == a[0])
      return 1;
    else
      return 0;
  }

  public static void main(String[] args) {
    int arr[] = { 10, 5, 5 };
    int result = isMagic(arr);
    System.out.println(result);
  }
}
