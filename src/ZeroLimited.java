public class ZeroLimited {
  static int isZeroLimited(int[] a) {

    // int lowerIndex = 0;
    // int n = 0;
    // while ((3 * n + 1) < a.length) {
    // int nextIndex = 3 * n + 1;
    // if (a[nextIndex] != 0)
    // return 0;

    // for (int i = lowerIndex; i <= nextIndex; i++) {
    // if (i != nextIndex && a[i] == 0)
    // return 0;
    // if (i == nextIndex) {
    // lowerIndex = nextIndex + 1;
    // }
    // }
    // n++;
    // }
    // return 1;
    // for (int x = 1; x < a.length; x += 3) { // x = 3 * n + 1 = 1, 4, 7, 10, ...

    for (int i = 0; i < a.length; i++) {
      if (a[i] == 0) {
        boolean hasFlag = false;
        int n = 0;
        while (true) {
          int temp = 3 * n + 1;
          if (temp == i)
            hasFlag = true;
          if (temp > i)
            break;
          n++;
        }
        if (!hasFlag)
          return 0;
      }
    }
    return 1;
  }

  public static void main(String[] args) {
    int[] arr = {};
    int result = isZeroLimited(arr);
    System.out.println(result);
  }
}