public class HollowArray {
  static int isHollow(int[] a) {
    if (a.length == 0)
      return 0;
    int zeroCount = 0;
    boolean zeroStarted = false;
    for (int i = 0, j = a.length - 1; i <= j; i++, j--) {
      if (a[i] == 0 || a[j] == 0) {
        zeroStarted = true;
        if (i == j) {
          zeroCount++;
        } else {
          zeroCount += 2;
        }
      }
      if (zeroStarted) {
        if (a[i] != 0 || a[j] != 0)
          return 0;
      }
    }
    if (zeroCount < 3)
      return 0;
    return 1;
  }

  public static void main(String[] args) {
    int[] arr = { 0, 1, 2, 0, 0, 0, 3, 4 };
    int result = isHollow(arr);
    System.out.println(result);
  }
}
