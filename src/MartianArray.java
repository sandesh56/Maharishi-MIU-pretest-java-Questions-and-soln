public class MartianArray {
  private static int isMartianArray(int[] a) {
    if (a.length == 0)
      return 0;
    int oneCount = 0;
    int twoCount = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] == 1)
        oneCount++;
      if (a[i] == 2)
        twoCount++;
      if (i != a.length - 1 && a[i] == a[i + 1])
        return 0;
    }
    if (oneCount <= twoCount)
      return 0;
    return 1;
  }

  public static void main(String[] args) {
    int[] arr = {};
    int result = isMartianArray(arr);
    System.out.println(result);
  }
}
