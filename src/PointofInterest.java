public class PointofInterest {
  static int findPointOfInterest(int[] a) {
    if (a.length < 3)
      return -1;

    for (int i = 0; i < a.length; i++) {
      int sum1 = 0;
      int sum2 = 0;
      for (int j = 0; j < i; j++) {
        sum1 += a[j];
      }
      for (int k = i + 1; k < a.length; k++) {
        sum2 += a[k];
      }
      if (sum1 == sum2)
        return i;
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 1, 1, 1, 2, 1, 7 };
    int result = findPointOfInterest(arr);
    System.out.println(result);
  }
}
