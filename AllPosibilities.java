public class AllPosibilities {
  static int isAllPossibilities(int[] a) {
    if (a.length == 0)
      return 0;
    int l = a.length;
    for (int i = 0; i < l; i++) {
      boolean flag = false;
      for (int item : a) {
        if (item >= l)
          return 0;
        if (i == item) {
          flag = true;
          break;
        }
      }
      if (!flag)
        return 0;
    }
    return 1;
  }

  public static void main(String[] args) {
    int[] arr = { 4, 0, 1, 2, 3, 1 };
    int result = isAllPossibilities(arr);
    System.out.println(result);
  }
}
