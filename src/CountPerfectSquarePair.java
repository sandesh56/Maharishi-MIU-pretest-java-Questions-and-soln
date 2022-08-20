public class CountPerfectSquarePair {
  static boolean isPercectSquare(int n) {
    if (n < 0)
      return false;
    double num1 = Math.sqrt(n);
    double num2 = Math.floor(num1);
    if (num1 - num2 != 0)
      return false;
    return true;
  }

  static int findPerfectSquarePair(int[] a) {
    int count = 0;
    for (int item1 : a) {
      for (int item2 : a) {
        if (item1 > 0 && item2 > 0 && item1 > item2) {
          int sum = item1 + item2;
          if (isPercectSquare(sum)) {
            count++;
          }
        }
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int arr[] = { 9, 0, 2, -5, 7 };
    int result = findPerfectSquarePair(arr);
    System.out.println(result);
  }
}
