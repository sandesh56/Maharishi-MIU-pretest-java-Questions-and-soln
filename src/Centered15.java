public class Centered15 {
  static int isCentered15(int[] a) {
    for (int i = 0; i < a.length; i++) {
      int sum = 0;
      for (int j = i; j < a.length; j++) {
        sum += a[j];
        if (sum == 15) {
          if (i == a.length - j - 1)
            return 1;
        }
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 10, 4, 1, 6, 9 };
    int result = isCentered15(arr);
    System.out.println(result);
    ;

  }
}
