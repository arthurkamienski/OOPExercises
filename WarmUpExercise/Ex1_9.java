import java.util.concurrent.ThreadLocalRandom;

public class Ex1_9 {
	public static void shuffle(int[] array) {
		// random swaps
		for (int i = 0; i < array.length; i++) {
			// random number in [0,length[ converted to int
			int rnd = (int) (Math.random()*array.length);
			// swap
			swap(array, i, rnd);
		}
	}

	public static int[] createNewArray(int size) {
		int[] array = new int[size];

		for(int i=0; i<size; i++)
			array[i] = i;

		return array;
	}	

	public static void swap(int[] array, int i, int j) {
		int aux = array[i];
		array[i] = array[j];
		array[j] = aux;
	}

	public static void printArray(int[] array) {
		for (int i=0; i<array.length-1; i++)
			System.out.print(array[i] + " ");
		System.out.println(array[array.length-1]);
	}

	public static void bubbleSort(int[] array) {
		for (int i=0; i < array.length; i++)
			for (int j=0; j < array.length-1; j++)
				if(array[j]>array[j+1])
					swap(array, j, j+1);
	}

	public static void selectionSort(int[] array) {
		for (int i=0; i < array.length; i++) {
			int lowest = i;
			
			for (int j=i; j < array.length; j++)
				if(array[j] < array[lowest])
					lowest = j;

			swap(array, i, lowest);
		}
	}

	public static void insertionSort(int[] array) {
		for (int i=0; i < array.length-1; i++) {
			for (int j=i+1; j>0 && array[j]<array[j-1]; j--)
				swap(array, j, j-1);
		}
	}

	public static void merge(int[] array, int s, int e, int m) {
		int[] aux = new int[e-s+1];
		int i = s, j = m+1, k=0;

		while(i<m+1 && j<e+1) {
			aux[k++] = (array[i] <= array[j])? array[i++] : array[j++];
		}

		while(i<m+1)
			aux[k++] = array[i++];

		while(j<e+1)
			aux[k++] = array[j++];

		for(int l=0; l<k; l++)
			array[l+s] = aux[l];
	}

	public static void mergeSort(int[] array, int s, int e) {
		int m = (e+s)/2;

		if(s < e) {
			mergeSort(array, s, m);
			mergeSort(array, m+1, e);
			merge(array, s, e, m);
		}
	}

	public static int partition(int[] array, int s, int e) {
		int p = array[e], i = s;

		for(int j=s; j<e+1; j++)
			if(array[j]<p)
				swap(array, i++, j);

		swap(array, i, e);

		return i;
	}

	public static void quickSort(int[] array, int s, int e) {
		if(s < e) {
			int p = partition(array, s, e);
			quickSort(array, s, p-1);
			quickSort(array, p+1, e);
		}
	}

	public static void countingSort(int[] array) {
		int[] aux = new int[array.length];

		int largest = array[0];

		for(int i : array)
			largest = Math.max(largest, i);

		int[] count = new int[largest+1];

		for(int i : array)
			count[i]++;

		for(int i=1; i<count.length; i++)
			count[i] += count[i-1];

		for(int i : array)
			aux[--count[i]] = i;

		for(int i=0; i < array.length; i++)
			array[i] = aux[i];
	}

	public static void main(String[] args) {
		int size = 30;
		int[] array = createNewArray(size);

		shuffle(array);

		System.out.println("Shuffled array:");
		printArray(array);


		// choose as you like
		// bubbleSort(array);
		// selectionSort(array);
		// insertionSort(array);
		// mergeSort(array, 0, array.length-1);
		// quickSort(array, 0, array.length-1);
		// countingSort(array);

		System.out.println("Sorted array:");
		printArray(array);
	}
}