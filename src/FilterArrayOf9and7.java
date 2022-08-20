public class FilterArrayOf9and7 {
  static int isFilteredArray(int[] a) {
    for (int i = 0; i < a.length; i++) {
      boolean hasFlag = false;
      if (a[i] == 7) {
        for (int j = 0; j < a.length; j++) {
          if (a[j] == 13) {
            hasFlag = true;
            break;
          }
        }
        if (hasFlag)
          return 0;
      }
      if (a[i] == 9) {
        for (int j = 0; j < a.length; j++) {
          if (a[j] == 11) {
            hasFlag = true;
            break;
          }
        }
        if (!hasFlag)
          return 0;
      }
    }
    return 1;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 10, 11, 13 };
    int result = isFilteredArray(arr);
    System.out.println(result);
  }
}
