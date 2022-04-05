import java.util.*;

public class PairwiseSum {
  static int[] pairwiseSum(int[] a) {
    if (a.length == 0 || a.length % 2 != 0)
      return null;
    int[] sumArray = new int[a.length / 2];
    for (int i = 0, index = 0; i < a.length - 1; i = i + 2, index++) {
      int pairSum = a[i] + a[i + 1];
      sumArray[index] = pairSum;
    }
    return sumArray;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 4 };
    int result[] = pairwiseSum(arr);
    System.out.println(Arrays.toString(result));
  }
}
