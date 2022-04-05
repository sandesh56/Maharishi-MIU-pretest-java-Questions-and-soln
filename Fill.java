import java.util.*;

public class Fill {
  static int[] fill(int[] a, int k, int n) {
    if (a.length < k)
      return null;
    if (k < 1 || n < 1)
      return null;
    int[] newArr = new int[n];
    int newArryIndex = 0;
    int oldArrayIndex = 0;
    while (newArryIndex < n) {
      if (oldArrayIndex >= k) {
        oldArrayIndex = 0;
      }
      newArr[newArryIndex] = a[oldArrayIndex];
      newArryIndex++;
      oldArrayIndex++;
    }
    return newArr;
  }

  public static void main(String[] args) {
    int arr[] = { 10, 5, 5 };
    int[] result = fill(arr, 4, 10);
    System.out.println(Arrays.toString(result));
  }
}
