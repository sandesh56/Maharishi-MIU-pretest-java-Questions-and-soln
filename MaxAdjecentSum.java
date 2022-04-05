public class MaxAdjecentSum {

  private static int maximumAdjecentSum(int[] a) {

    int maxSum = Integer.MIN_VALUE;

    for (int i = 0; i < a.length - 1; i++) {
      int sum = a[i] + a[i + 1];
      if (sum > maxSum) {
        maxSum = sum;
      }
    }

    return maxSum;

  }

  public static void main(String[] args) {
    int arr[] = { 1, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1 };
    int result = maximumAdjecentSum(arr);
    System.out.println(result);
  }

}
