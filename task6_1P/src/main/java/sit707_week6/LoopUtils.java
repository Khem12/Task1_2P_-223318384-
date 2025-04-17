package sit707_week6;

public class LoopUtils {
	// Loop with simple statement
	public static int sumUpTo(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	// Loop with conditional inside
	public static int countEvenNumbers(int[] arr) {
		int count = 0;
		for (int num : arr) {
			if (num % 2 == 0) {
				count++;
			}
		}
		return count;
	}
}
