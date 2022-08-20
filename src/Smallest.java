
public class Smallest {

	private static int smallest(int n) {
		int number = 1;
		while (true) {
			int multiplier = 1;
			while (multiplier <= n) {
				int result = number * multiplier;
				boolean digitFlag = false;

				while (result > 0) {
					int remainder = result % 10;
					if (remainder == 2) {
						digitFlag = true;
						break;
					}
					result /= 10;
				}
				if (!digitFlag) {
					break;
				} else if (multiplier == n) {
					return number;
				}

				multiplier++;
			}
			number++;
		}
	};

	public static void main(String[] args) {
		int result = smallest(4);
		System.out.println(result);
	}

}
