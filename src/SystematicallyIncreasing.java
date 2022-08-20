public class SystematicallyIncreasing {

  private static int isSystematicallyIncreasing(int[] a) {

    int n = 0;
    /** Array length must be equal to n*(n+1)/2 for any n */
    while (true) {
      int num = n * (n + 1) / 2;
      if (num == a.length)
        break;
      if (num > a.length)
        return 0;
      n++;
    }
    int index = 0;
    for (int i = 1; i <= n; i++) {
      int len = 1;
      while (len <= i) {
        if (a[index] != len)
          return 0;
        index++;
        len++;
      }
    }
    return 1;
  }

  public static void main(String[] arg) {
    int arr[] = { 1, 1, 2, 1, 2, 3 };
    int result = isSystematicallyIncreasing(arr);
    System.out.println(result);
  }

}
