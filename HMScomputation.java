import java.util.*;

public class HMScomputation {
  private static int[] computeHMS(int n) {
    int[] HMS = new int[3];

    int hour = n / 3600;
    HMS[0] = hour;
    n = n % 3600;
    int minute = n / 60;
    HMS[1] = minute;
    n = n % 60;
    int second = n;
    HMS[2] = second;
    return HMS;
  }

  public static void main(String[] args) {
    int result[] = computeHMS(3735);
    System.out.println(Arrays.toString(result));
  }
}
