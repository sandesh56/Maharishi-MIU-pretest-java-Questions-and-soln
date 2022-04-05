public class SameNumberOfFactors {
  static int sameNumberofFactors(int a, int b) {
    if (a < 0 || b < 0)
      return -1;
    if (a == 0 || b == 0)
      return 0;
    int greatestNumber;
    if (b > a) {
      greatestNumber = b;
    } else {
      greatestNumber = a;
    }
    int aFactor = 0;
    int bFactor = 0;
    int divider = 1;
    while (divider <= greatestNumber) {
      if (a % divider == 0) {
        aFactor++;
      }
      if (b % divider == 0) {
        bFactor++;
      }
      divider++;
    }
    if (aFactor == bFactor)
      return 1;
    return 0;
  }

  public static void main(String[] args) {
    int result = sameNumberofFactors(0, 0);
    System.out.println(result);
  }
}
