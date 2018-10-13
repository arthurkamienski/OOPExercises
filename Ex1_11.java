public class Ex1_11 {
	public static void squaresFrom(int start, int end) {
		for(int i=start; i<end; i++)
			System.out.print(i*i + " ");
		System.out.println(end*end);
	}

	public static void main(String[] args) {
		squaresFrom(1, 1000);
	}
}