public class OninonArray {

  private static int isOnionArray(int[] a) {

    if (a.length == 0 || a.length == 1) {
      return 1;
    }
    for (int i = 0, j = a.length - 1; i < j && j > i; i++, j--) {
      if (a[i] + a[j] > 10)
        return 0;
    }

    return 1;
  }

  public static void main(String[] args) {
    int arr[] = {};
    int result = isOnionArray(arr);
    System.out.println(result);
  }
}
