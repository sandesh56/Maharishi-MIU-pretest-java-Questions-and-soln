import java.util.*;

public class NbasedIntegerRounding {
  static int[] nbasedIntegerRounding(int[] a, int n) {
    if (n <= 0)
      return a;

    for (int i = 0; i < a.length; i++) {
      if (a[i] > 0) {
        int fact1 = 0, fact2 = 0;
        int k = 0;
        while (true) {
          int multiple = n * k;
          if (multiple < a[i]) {
            fact1 = multiple;
          } else {
            fact2 = multiple;
            break;
          }
          k++;
        }
        if ((a[i] - fact1) < (fact2 - a[i])) {
          a[i] = fact1;
        } else {
          a[i] = fact2;
        }
      }
    }
    return a;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    int[] result = nbasedIntegerRounding(arr, 100);
    System.out.println(Arrays.toString(result));
  }
}
