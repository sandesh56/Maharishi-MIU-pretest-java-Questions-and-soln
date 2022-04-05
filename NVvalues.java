public class NVvalues {
  static boolean hasElement(int[] a, int item) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] == item)
        return true;
    }
    return false;
  };

  static int hasNVvalue(int[] a, int n) {
    if (n > a.length)
      return 0;

    int count = 0;
    for (int i = 0; i < a.length; i++) {
      boolean hasSame = false;
      for (int j = 0; j < i; j++) {
        if (a[i] == a[j]) {
          hasSame = true;
          break;
        }
      }
      if (!hasSame) {
        count++;
      }
    }
    if (count != n)
      return 0;
    return 1;

  }

  public static void main(String[] args) {
    int[] arr = { 1 };
    int result = hasNVvalue(arr, 2);
    System.out.println(result);
  }
}
