public class Nupcount {
  static int nupcount(int[] a, int n) {
    int sum = 0;
    int upCount = 0;
    for (int i = 0; i < a.length; i++) {
      if (sum <= n && sum + a[i] > n) {
        upCount++;
      }
      sum += a[i];
    }
    return upCount;
  }

  public static void main(String[] args) {
    int arr[] = { 6, 3, 1 };
    int result = nupcount(arr, 6);
    System.out.println(result);
  }
}
