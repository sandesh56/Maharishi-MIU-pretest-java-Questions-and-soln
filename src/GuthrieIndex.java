public class GuthrieIndex {
  static int findGuthrieIndex(int n) {
    if (n <= 0)
      return 0;
    int count = 0;
    while (n > 1) {
      if (n % 2 == 0) {
        n = n / 2;
      } else {
        n = n * 3 + 1;
      }
      count++;
    }
    return count;
  }

  public static void main(String[] args) {
    int result = findGuthrieIndex(7);
    System.out.println(result);
  }
}
