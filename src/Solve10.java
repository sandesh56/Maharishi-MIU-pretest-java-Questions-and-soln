import java.util.*;

public class Solve10 {
  static int factor(int n) {
    int fact = 1;
    while (n > 1) {
      fact *= n;
      n--;
    }
    return fact;
  }

  static int[] solve10() {
    int solve[] = new int[2];
    int fact10 = factor(10);
    for (int i = 1, j = 9; i <= j; i++, j--) {
      if (factor(i) + factor(j) == fact10) {
        solve[0] = i;
        solve[1] = j;
      }
    }
    return solve;

  }

  static int isEqual(int[] a, int n) {
    if (a.length == 0)
      return 0;
    for (int i = a.length - 1, temp = n; i >= 0; i--, temp /= 10) {
      int rem = temp % 10;
      if (rem != a[i])
        return 0;
    }
    return 1;
  }

  static int centered15(int[] a) {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }
    if (sum == 15)
      return 1;
    for (int i = 0, j = a.length - 1; i < j; i++, j--) {
      sum = sum - (a[i] + a[j]);
      if (sum == 15)
        return 1;
    }
    return 0;
  }

  static int checkDepth(int n) {
    boolean checkArray[] = new boolean[10];
    int multiplier = 1;
    while (multiplier <= 10) {
      int num = n * multiplier;
      int i = 0;
      while (num > 0) {
        int rem = num % 10;
        if (!checkArray[rem]) {
          checkArray[rem] = true;
        }
        num /= 10;
      }
      for (i = 0; i < checkArray.length; i++) {
        if (!checkArray[i])
          break;
      }
      if (i == checkArray.length)
        break;
      multiplier++;
    }
    return multiplier;

  }

  static int isTriavalent(int[] a) {
    int[] checkArr = new int[a.length];
    for (int i = 0; i < a.length; i++) {
      int subtractor = 0;
      for (int j = 0; j < i; j++) {
        if (a[i] == a[j])
          subtractor = 1;
      }
      checkArr[i] = 1 - subtractor;

    }
    int sum = 0;
    for (int k = 0; k < checkArr.length; k++) {
      sum += checkArr[k];
    }
    if (sum == 3)
      return 1;
    return 0;
  }

  public static void main(String[] args) {
    int[] result = solve10();
    int arr[] = { 2147483647, 1, 1, -2147483647 };
    int res = isTriavalent(arr);
    System.out.println(res);
  }
}
