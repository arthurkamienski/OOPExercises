public class Ex1_4 {

	public static boolean isDivisibleBy7(int n) {
		return n%7 == 0;
	}

	public static void printDivisibleBy7UpTo(int n) {
		for (int i=0; i <= n; i++) {
			if(isDivisibleBy7(i))
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		printDivisibleBy7UpTo(100);
	}
}