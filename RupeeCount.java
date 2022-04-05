public class RupeeCount {
  static int rupeeCount(int n) {
    int count = 0;
    for (int rupee20 = 0; rupee20 <= n / 20; rupee20++) {
      for (int rupee10 = 0; rupee10 <= n / 10; rupee10++) {
        for (int rupee5 = 0; rupee5 <= n / 5; rupee5++) {
          for (int rupee2 = 0; rupee2 <= n / 2; rupee2++) {
            for (int rupee1 = 0; rupee1 <= n; rupee1++) {
              int sum = 20 * rupee20 + 10 * rupee10 + 5 * rupee5 + 2 * rupee2 + rupee1;
              if (sum == n) {
                count++;
              } else if (sum > n)
                break;

            }
          }
        }
      }
    }
    return count;

  }

  public static void main(String[] args) {
    int result = rupeeCount(12);
    System.out.println(result);
  }
}
