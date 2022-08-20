public class Vesuvian {
  /**
   * checks weather contains decimal points
   */
  private static boolean isPerfectSquare(int n) {
    if (n < 0)
      return false;
    int num = 0;
    while (true) {
      int square = num * num;
      if (square == n)
        return true;
      if (square > n)
        break;
      num++;
    }
    return false;
  }

  private static int isVesuvian(int n) {
    if (n < 0)
      return 0;
    int pairCount = 0;
    for (int first = 1, second = n - 1; first <= second; first++, second--) {
      int sum = first + second;
      if (sum == n) {
        if (isPerfectSquare(first) && isPerfectSquare(second)) {
          pairCount++;
        }
      }
    }
    if (pairCount >= 2)
      return 1;
    return 0;
  }

  public static void main(String[] args) {
    int result = isVesuvian(85);
    System.out.println(result);
  }
}
