public class MeeraArray {
  static int isMeeraArray(int[] a) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        if (a[i] == 2 * a[j])
          return 0;
      }
    }
    return 1;
  }

  public static void main(String[] args) {
    int arr[] = { 10, 8, 6 };
    int result = isMeeraArray(arr);
    System.out.println(result);
  }
}
