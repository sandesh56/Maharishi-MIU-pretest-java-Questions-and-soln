public class CubePerfect {
  static int isCubePerfect(int[] a) {
    for (int item : a) {
      int n = 1;
      while (n <= item) {
        int cube = n * n * n;
        if (cube == item)
          break;
        else if (cube > item)
          return 0;
        n++;
      }
    }
    return 1;
  }

  public static void main(String[] args) {
    int[] arr = { -1, 0, 1 };
    int result = isCubePerfect(arr);
    System.out.println(result);
  }
}
