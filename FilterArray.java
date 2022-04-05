import java.util.*;

public class FilterArray {

  private static int[] filterArray(int[] a, int n) {
    if (n == 0)
      return new int[] {};
    int oneCount = 0;
    int temp = n;
    while (temp > 0) {
      int rem = temp % 2;
      if (rem == 1)
        oneCount++;
      temp /= 2;
    }
    int[] filterArray = new int[oneCount];
    int index = 0;
    int newIndex = 0;
    while (n > 0) {
      int rem = n % 2;
      if (rem == 1) {
        if (index >= a.length)
          return null;
        else {
          filterArray[newIndex] = a[index];
          newIndex++;
        }
      }
      index++;
      n /= 2;
    }
    return filterArray;

  }

  public static void main(String[] args) {
    int arr[] = { 9, -9, 5 };
    int[] result = filterArray(arr, 3);
    System.out.println(Arrays.toString(result));
  }
}
