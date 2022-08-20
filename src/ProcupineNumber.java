public class ProcupineNumber {
  static boolean isPrime(int n) {
    if (n < 2)
      return false;
    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0)
        return false;
    }
    return true;
  }

  static int findPorcupineNumber(int n) {
    int num = n + 1;
    int prevPrime = 0;
    while (true) {
      if (isPrime(num)) {
        if (prevPrime % 10 == 9 && num % 10 == 9)
          return prevPrime;
        else
          prevPrime = num;
      }
      num++;
    }
  }

  public static void main(String[] args) {
    int result = findPorcupineNumber(139);
    System.out.println(result);
  }
}
