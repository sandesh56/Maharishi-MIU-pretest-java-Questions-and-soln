public class GetExponent {
  static int getExponent(int n, int p) {
    if (p <= 1)
      return -1;
    int absNum = Math.abs(n);
    int power = 0;
    int maxPower = 0;
    while (true) {
      double powerNum = Math.pow(p, power);
      if (powerNum > absNum)
        break;
      if (absNum % powerNum == 0) {
        double quotient = absNum / powerNum;
        if (quotient % 2 == 0 && power > maxPower)
          maxPower = power;
      }
      power++;
    }
    return maxPower;
  }

  public static void main(String[] args) {
    int result = getExponent(128, 4);
    System.out.println(result);
  }
}
