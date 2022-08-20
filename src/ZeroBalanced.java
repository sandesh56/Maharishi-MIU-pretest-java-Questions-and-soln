public class ZeroBalanced {
  static int isZeroBalanced(int[] a) {
    if (a.length == 0)
      return 0;
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
      boolean foundFlag = false;
      for (int j = 0; j < a.length; j++) {
        if (a[i] == -a[j]) {
          foundFlag = true;
          break;
        }
      }
      if (!foundFlag)
        return 0;
    }
    if (sum != 0)
      return 0;
    return 1;
  }

  public static void main(String[] args) {
    int[] arr = { 0, 0, 0, 0, 0 };
    int result = isZeroBalanced(arr);
    System.out.println(result);
  }
}
