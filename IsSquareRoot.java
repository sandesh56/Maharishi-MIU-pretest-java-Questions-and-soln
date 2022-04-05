public class IsSquareRoot {
  static int isSquare(int n) {
    if (n < 0)
      return 0;

    int num = 0;
    while (true) {
      int square = num * num;
      if (square == n)
        return 1;
      else if (square > n)
        break;
      num++;
    }
    return 0;
  }

  public static void main(String[] args) {

    int result = isSquare(900);
    System.out.println(result);
  }
}
