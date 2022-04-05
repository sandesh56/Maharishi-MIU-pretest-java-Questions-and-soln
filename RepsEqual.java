public class RepsEqual {
  static int isRepsequal(int[] a, int n) {
    // String digits = "";
    // for (int i = 0; i < a.length; i++) {
    // if (i != 0 && a[i] < 0) {
    // return 0;
    // }
    // digits += a[i];
    // }
    // if (Integer.parseInt(digits) == n)
    // return 1;
    // return 0;
    int num = Math.abs(n);
    for (int i = a.length - 1; i >= 0; i--) {
      int rem = num % 10;
      if (i == 0 && n < 0) {
        if (a[i] != -rem)
          return 0;
      } else if (a[i] != rem) {
        return 0;
      }
      num = num / 10;
    }
    if (num != 0)
      return 0;
    return 1;
  }

  public static void main(String[] args) {
    int[] arr = { 5, 6, 2, 3, 8, 9, 7 };
    int result = isRepsequal(arr, 5623897);
    System.out.println(result);
  }
}
