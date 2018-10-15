public class Ex1_3 {

	public static void whileLoop() {
		System.out.println("Beginning While loop");

		int number = 20;
		
		while (number > 5) {
			System.out.println(number);
			number = number - 1;
		}

		System.out.println();
	}

	public static void doWhileLoop() {
		System.out.println("Beginning Do-While loop");

		int number = 20;

		do {
			System.out.println(number);
			number = number - 1;
		}
		while(number > 5);

		System.out.println();
	}

	public static void forLoop() {
		System.out.println("Beginning For loop");

		for(int number = 20; number > 5; number--)
			System.out.println(number);

		System.out.println();
	}

	public static void main(String[] args) {

		whileLoop();
		doWhileLoop();
		forLoop();
	}
}