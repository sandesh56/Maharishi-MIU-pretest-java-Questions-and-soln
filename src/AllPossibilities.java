public class AllPossibilities {
  static int isAllPossibilities(int[] a) {
    if (a.length == 0)
      return 0;
    int n = 0;
    while (n < a.length) {
      boolean found = false;
      for (int i = 0; i < a.length; i++) {
        if (a[i] == n) {
          found = true;
          break;
        }
      }
      if (!found)
        return 0;
      n++;
    }
    return 1;
  }

  public static void main(String[] args) {
    int arr[] = { 1 };
    int result = isAllPossibilities(arr);
    System.out.println(result);
  }
}
