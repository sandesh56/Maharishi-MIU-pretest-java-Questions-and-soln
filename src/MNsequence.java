public class MNsequence {

  private static int isSequencedArray(int[] a, int m, int n) {
    if (m > n || a.length == 0)
      return 0;

    if (a[0] != m || a[a.length - 1] != n)
      return 0;
    for (int i = 0; i < a.length - 1; i++) {
      if (a[i] < m || a[i] > n)
        return 0;
      if (a[i] != a[i + 1]) {
        int diff = a[i + 1] - a[i];
        if (diff != 1)
          return 0;
      }
    }
    return 1;
  }

  public static void main(String[] args) {
    int arr[] = { -5, -5, -5, -4, -4, -3, -2, -1, 1, 2, 3 };
    int result = isSequencedArray(arr, -5, 3);
    System.out.println(result);
  }

}
