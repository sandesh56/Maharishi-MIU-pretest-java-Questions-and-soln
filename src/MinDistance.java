public class MinDistance {
  static int minimumDistance(int n) {
    int minDistance = Integer.MAX_VALUE;
    int factor1 = 0;
    int factor2 = 0;
    int divider = 1;
    boolean factorFound = false;
    while (divider <= n) {
      if (n % divider == 0) {
        if (factorFound) {
          factor2 = divider;
          factorFound = false;
        } else {
          factor1 = divider;
          factorFound = true;
        }
      }
      if (factor1 > 0 && factor2 > 0) {
        int diff = Math.abs(factor1 - factor2);
        if (diff < minDistance) {
          minDistance = diff;
        }
      }
      divider++;
    }
    return minDistance;
  }

  public static void main(String[] args) {
    int result = minimumDistance(25);
    System.out.println(result);
  }
}
