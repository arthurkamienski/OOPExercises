public class Arithmetic {

	Arithmetic() {}

	public static int sum(int a, int b) {
		return a+b;
	}

	public static int sub(int a, int b) {
		return a-b;
	}

	public static int mult(int a, int b) {
		return a*b;
	}

	public static double div(int a, int b) throws ArithmeticException {
		return a/b;
	}

	public static void main(String[] args) {
		System.out.println(sum(10, 0));
		System.out.println(sub(10, 0));
		System.out.println(mult(10, 0));

		try {
			System.out.println(div(10, 0));
		} catch (ArithmeticException e) {
			System.out.println("Division by zero.");
		}
	}
}