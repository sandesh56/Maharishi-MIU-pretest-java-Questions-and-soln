public class BinaryOneCount {
  static int binaryCount(int n) {
    int oneCount = 0;
    while (n > 0) {
      int rem = n % 2;
      if (rem == 1)
        oneCount++;
      n /= 2;
    }
    return oneCount;
  }

  public static void main(String[] args) {
    int result = binaryCount(10000);
    System.out.println(result);
  }
}
