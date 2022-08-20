import java.util.*;

public class EncodeNumber {
  static boolean isPrime(int n) {
    if (n < 2)
      return false;
    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0)
        return false;
    }
    return true;
  }

  static int[] encodeNumber(int n) {
    if (n <= 1)
      return null;
    int primeFactorCount = 0;
    int divider = 2;
    while (divider <= n) {
      int temp = n;
      if (isPrime(divider)) {
        while (true) {
          if (temp % divider == 0) {
            primeFactorCount++;
            temp /= divider;
          } else {
            break;
          }
        }
      }
      divider++;
    }
    int[] newArray = new int[primeFactorCount];
    int index = 0;
    divider = 2;
    while (divider <= n) {
      int temp = n;
      if (isPrime(divider)) {
        while (true) {
          if (temp % divider == 0) {
            newArray[index] = divider;
            index++;
            temp /= divider;
          } else {
            break;
          }
        }
      }
      divider++;
    }
    return newArray;
  }

  public static void main(String[] args) {
    int result[] = encodeNumber(6936);
    System.out.println(Arrays.toString(result));
  }
}
