public class BunkerNumber {
  static int isBunkerNumber(int n) {
    if (n < 0)
      return 0;
    int prev1 = 1;
    int index = 0;
    while (true) {
      int nextNum = prev1 + index;
      if (nextNum == n)
        return 1;
      else if (nextNum > n)
        break;
      prev1 = nextNum;
      index++;
    }
    return 0;
  }

  public static void main(String[] args) {
    int result = isBunkerNumber(21);
    System.out.println(result);
  }
}
