public class IsolatedNum {
  static int isIsolated(long n) {
    if (n < 1 || n > 2097151)
      return -1;
    long square = n * n;
    long cube = square * n;
    while (square > 0) {
      int squareRem = (int) square % 10;
      while (cube > 0) {
        int cubeRem = (int) cube % 10;
        if (cubeRem == squareRem)
          return 0;
        cube /= 10;
      }
      square /= 10;
    }
    return 1;
  }

  public static void main(String[] args) {
    int result = isIsolated(63);
    System.out.println(result);
  }
}
