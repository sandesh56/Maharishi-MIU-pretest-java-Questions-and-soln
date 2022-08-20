public class NextPerfectSquare {
  static int nextPerfectSquare(int n) {

    double squareRoot = Math.sqrt(n);
    double floorInt = Math.floor(squareRoot);
    int sqare = ((int) floorInt + 1) * ((int) floorInt + 1);
    return sqare;

  }

  public static void main(String[] args) {
    int result = nextPerfectSquare(4);
    System.out.println(result);
  }
}
