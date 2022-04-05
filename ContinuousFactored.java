public class ContinuousFactored {
  static int isContinuousFactored(int n) {
    int fact1 = 0;
    int fact2 = 0;
    boolean foundFactor = false;
    int divider = 2;
    while (divider <= n / 2) {
      if (n % divider == 0) {
        if (foundFactor) {
          fact2 = divider;
          foundFactor = false;
        } else {
          fact1 = divider;
          foundFactor = true;
        }
      }
      if (fact1 > 0 && fact2 > 0 && Math.abs(fact1 - fact2) == 1)
        return 1;
      divider++;
    }
    return 0;
  }

  public static void main(String[] args) {
    int result = isContinuousFactored(4);
    System.out.println(result);
  }
}
