public class LargestEvenDifference {

  private static int largestEvenDifference(int[] a) {
    if (a.length == 0)
      return 0;
    int evenCount = 0;
    int largestDifference = 0;

    for (int first = 0; first < a.length; first++) {
      if (a[first] % 2 == 0) {
        evenCount++;
      }
      for (int second = first + 1; second < a.length; second++) {
        if (a[first] % 2 == 0 && a[second] % 2 == 0) {
          int diff = Math.abs(a[first] - a[second]);
          if (diff > largestDifference) {
            largestDifference = diff;
          }
        }
      }
    }
    if (evenCount < 2)
      return -1;
    return largestDifference;
  }

  public static void main(String[] args) {
    int[] arr = { 1 };
    int result = largestEvenDifference(arr);
    System.out.println(result);
  }
}
