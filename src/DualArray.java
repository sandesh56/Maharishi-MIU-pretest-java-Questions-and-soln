public class DualArray {
  static int isDualArray(int[] a) {
    if (a.length % 2 != 0)
      return 0;
    int sum = 0;
    for (int i = 0; i < a.length - 1; i += 2) {
      if (i == 0)
        sum = a[i] + a[i + 1];
      if (i != 0) {
        if (a[i] + a[i + 1] != sum)
          return 0;
      }
    }
    return 1;
  }

  public static void main(String[] args) {
    int[] arr = {};
    int result = isDualArray(arr);
    System.out.println(result);
  }
}
