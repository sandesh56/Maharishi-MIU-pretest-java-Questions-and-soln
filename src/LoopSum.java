public class LoopSum {
  static int loopSum(int[] a, int n) {
    int sum = 0;
    int trackNum = 0;
    int index = 0;
    int len = a.length - 1;

    while (trackNum < n) {
      if (index > len) {
        index = 0;
      }
      sum += a[index];
      trackNum++;
      index++;
    }
    return sum;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 4, 5, 6 };
    int result = loopSum(arr, 4);
    System.out.println(result);
  }
}
