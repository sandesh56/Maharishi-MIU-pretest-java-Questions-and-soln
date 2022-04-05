public class PairedN {
  private static int isPairedN(int[] a, int n) {
    if (n <= 0 || a.length <= 1)
      return 0;
    int l = a.length - 1;
    if (n > l * 2)
      return 0;

    for (int first = 0; first < a.length; first++) {
      for (int second = first + 1; second < a.length; second++) {
        if (a[first] + a[second] == n && first + second == n) {
          return 1;
        }
      }
    }
    return 0;
  };

  public static void main(String[] args) {
    int[] arr = { 0 };
    int result = isPairedN(arr, 4);
    System.out.println(result);
  }
}
