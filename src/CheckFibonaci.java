public class CheckFibonaci {
  static int isFibonaci(int n) {
    if (n < 0)
      return 0;
    int prev1 = 0;
    int prev2 = 1;
    while (true) {
      int nextFib = prev1 + prev2;
      prev1 = prev2;
      prev2 = nextFib;
      if (nextFib == n)
        return 1;
      else if (nextFib > n)
        break;
    }
    return 0;
  }

  public static void main(String[] args) {
    int result = isFibonaci(21);
    System.out.println(result);
  }
}
