import java.util.stream.*;

public class Ex1_5 {

	public static int getArraySum(int[] array) {
		//the simple way

		int sum = 0;

		for(int i=0; i < array.length; i++)
			sum += array[i];

		/*
			the pretty way

			for(int i : array)
				sum += i;
		*/

		/*
			another way

			sum = IntStream.of(array).sum();
		*/


		return sum;
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6};

		System.out.println(getArraySum(array));
	}
}