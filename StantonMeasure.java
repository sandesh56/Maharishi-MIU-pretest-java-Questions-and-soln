public class StantonMeasure {
  static int stantonMeasure(int[] a) {
    if (a.length == 0)
      return 0;
    int oneCount = 0;
    int nCount = 0;
    for (int i : a) {
      if (i == 1)
        oneCount++;
    }
    for (int j : a) {
      if (oneCount == j)
        nCount++;
    }
    return nCount;
  }

  public static void main(String[] args) {
    int arr[] = { 8, 4, 1, 1, 1, 3, 7, 8, 9, 3, 7, 4, 5, 3, };
    int result = stantonMeasure(arr);
    System.out.println(result);
  }
}
