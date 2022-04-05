public class BEQnumber {
  static int findSamallestBEQnumber() {
    int num = 1;
    while (true) {
      int sixCount = 0;
      int cubeNumber = num * num * num;
      while (cubeNumber > 0) {
        int rem = cubeNumber % 10;
        if (rem == 6)
          sixCount++;
        cubeNumber /= 10;
      }
      if (sixCount == 4)
        return num;
      num++;
    }
  }

  public static void main(String[] args) {
    int result = findSamallestBEQnumber();
    System.out.println(result);
  }
}
