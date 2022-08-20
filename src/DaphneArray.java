public class DaphneArray {
  static int isDaphneArray(int[] a) {
    int oddCount = 0;
    boolean oddFlag = false;
    for (int i = 0, j = a.length - 1; i <= j; i++, j--) {
      if (!oddFlag) {
        if (a[i] % 2 == 0) {
          if (a[j] % 2 != 0)
            return 0;
        } else {
          if (a[j] % 2 == 0)
            return 0;
          oddCount += 2;
          oddFlag = true;
        }
      }
    }
    if (oddCount < 1)
      return 0;
    return 1;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 8, 7, -4, 6 };
    int result = isDaphneArray(arr);
    System.out.println(result);
  }
}
