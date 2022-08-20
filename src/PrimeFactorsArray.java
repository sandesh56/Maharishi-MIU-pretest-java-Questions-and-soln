import java.util.Arrays;

public class PrimeFactorsArray {

  /**
   * checking prime number
   */
  private static boolean isPrime(int number) {
    boolean flag = true;
    if (number <= 1)
      return false;
    for (int i = 2; i <= number / 2; i++) {
      if (number % i == 0) {
        flag = false;
        break;
      }
    }
    return flag;
  }

  /**
   * Prime factors Array
   */
  private static int[] encodeNumber(int n) {
    if (n <= 1)
      return null;
    if (isPrime(n)) {
      return new int[] { n };
    }

    int primeCount = 0;
    int divider = 2;
    while (divider <= n / 2) {
      if (isPrime(divider)) {
        if (n % divider == 0) {
          int temp = n;
          while (temp % divider == 0) {
            primeCount++;
            temp /= divider;
          }
        }
      }
      divider++;
    }

    int[] primeFactorArray = new int[primeCount];
    int dividerNumber = 2;
    int index = 0;
    while (dividerNumber <= n / 2) {

      if (isPrime(dividerNumber)) {
        if (n % dividerNumber == 0) {
          int temp = n;
          while (temp % dividerNumber == 0) {
            primeFactorArray[index] = dividerNumber;
            index++;
            temp /= dividerNumber;
          }
        }
      }

      dividerNumber++;
    }
    return primeFactorArray;
  }

  public static void main(String[] args) {
    int[] result = encodeNumber(85962);
    System.out.println(Arrays.toString(result));
  }
}
