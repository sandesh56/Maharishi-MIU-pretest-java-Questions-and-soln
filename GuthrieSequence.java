public class GuthrieSequence {
  static int isGuthrieSequence(int[] a) {
    if (a[0] <= 0 || a[a.length - 1] != 1 || a.length == 0)
      return 0;
    for (int i = 0; i < a.length - 1; i++) {
      if (a[i] % 2 == 0) {
        int num = a[i] / 2;
        if (a[i + 1] != num)
          return 0;
      } else {
        int num = a[i] * 3 + 1;
        if (num != a[i + 1])
          return 0;
      }
    }
    return 1;
  }

  public static void main(String[] args) {
    int arr[] = { 8, 4, 1 };
    int result = isGuthrieSequence(arr);
    System.out.println(result);
  }
}
