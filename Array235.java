public class Array235 {
  private static int is235Array(int[] a) {
    if (a.length == 0)
      return 1;
    int sum = 0;
    for (int item : a) {
      if (item % 2 == 0) {
        sum += 1;
      }
      if (item % 3 == 0) {
        sum += 1;
      }
      if (item % 5 == 0) {
        sum += 1;
      }
      if (item % 2 != 0 && item % 3 != 0 && item % 5 != 0) {
        sum += 1;
      }
    }

    if (sum == a.length)
      return 1;
    else
      return 0;
  }

  public static void main(String[] args) {
    int arr[] = { 7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7 };
    int result = is235Array(arr);
    System.out.println(result);
  }
}
