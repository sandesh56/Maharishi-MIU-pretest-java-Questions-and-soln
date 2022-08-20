public class EvenSubset {
  static int isEvenSubset(int m, int n) {
    if (n % 2 != 0 || n % 2 != 0)
      return 0;
    int factor = 2;
    while (factor < m) {
      if (factor % 2 == 0 && m % factor == 0) {
        if (n % factor != 0)
          return 0;
      }
      factor += 2;
    }
    return 1;
  }

  public static void main(String[] args) {
    int result = isEvenSubset(18, 12);
    System.out.println(result);
  }
}
