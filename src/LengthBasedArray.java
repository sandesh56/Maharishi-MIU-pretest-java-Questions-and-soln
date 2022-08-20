import java.util.*;

public class LengthBasedArray {
  static char[] lengthBasedArray(char[] a, int start, int n) {
    if (a.length == 0 || n <= 0 || start < 0 || (start + n) > a.length)
      return null;

    char[] newArray = new char[n];
    for (int i = start, index = 0; i < start + n; i++, index++) {
      newArray[index] = a[i];
    }
    return newArray;
  }

  public static void main(String[] args) {
    char[] arr = { 'a', 'b', 'c', 'd' };
    char[] result = lengthBasedArray(arr, 0, 3);
    System.out.println(Arrays.toString(result));
  }
}
