import java.util.Arrays;

public class EncodeArray {

  private static int[] encodeArray(int n) {

    int arrayLength = 0;
    int arrayIndex = 0;
    if (n < 0) {
      arrayLength = 1;
      arrayIndex = 1;
    }
    int absNumber = Math.abs(n);
    int temp = absNumber;
    while (temp > 0) {
      int remainder = temp % 10;
      arrayLength += (remainder + 1);
      temp /= 10;
    }
    String digits = Integer.toString(absNumber);
    int[] newArray = new int[arrayLength];

    for (int i = 0; i < digits.length(); i++) {
      if (n < 0) {
        newArray[0] = -1;
      }
      int k = Integer.parseInt(String.valueOf(digits.charAt(i)));
      int temp2 = 0;
      while (temp2 < k) {
        newArray[arrayIndex] = 0;
        temp2++;
        arrayIndex++;
      }
      newArray[arrayIndex] = 1;
      arrayIndex++;
    }
    return newArray;
  }

  public static void main(String[] args) {
    int[] result = encodeArray(459);
    System.out.println(Arrays.toString(result));
  }

}
