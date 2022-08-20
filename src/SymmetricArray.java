public class SymmetricArray {
  static int isSymmetricArray(int[] a) {
    if (a.length < 1)
      return 0;
    for (int i = 0, j = a.length - 1; i <= j; i++, j--) {
      if (a[i] % 2 == 0) {
        if (a[j] % 2 != 0)
          return 0;
      } else {
        if (a[j] % 2 == 0)
          return 0;
      }
    }
    return 1;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 7, 8, 9, 11, 13, 10 };
    int result = isSymmetricArray(arr);
    System.out.println(result);
  }
}
