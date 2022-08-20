public class FancyNum {
  static int isFancyNumber(int n) {
    if (n <= 0)
      return 0;
    if (n == 1)
      return 1;
    int prev1 = 1;
    int prev2 = 1;
    while (true) {
      int nextNum = (3 * prev2) + (2 * prev1);
      if (nextNum == n)
        return 1;
      else if (nextNum > n)
        break;
      prev1 = prev2;
      prev2 = nextNum;
    }
    return 0;
  }

  public static void main(String[] args) {
    int result = isFancyNumber(5);
    System.out.println(result);
  }
}
