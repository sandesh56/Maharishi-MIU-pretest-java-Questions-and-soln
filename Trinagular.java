public class Trinagular {
  private static int isTriangular(int n) {
    if (n < 1)
      return 0;
    int sum = 0;
    int number = 1;
    while (true) {
      sum += number;
      if (sum == n)
        return 1;
      else if (sum > n)
        break;
      number++;
    }
    return 0;
  }

  public static void main(String[] args) {
    int result = isTriangular(10);
    System.out.println(result);
  }
}
