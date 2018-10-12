import javax.swing.JOptionPane;
import java.util.Scanner;

public class Ex1_2 {

	public static int getGreater(int a, int b) {
		/*
			This is the same as 
			if (a >= b) {
				return a;
			}
			else
				return b;
		*/

		return (a >= b)? a : b;
	}

	public static int readNumber() {
		int num;

		//The way the prof wants it
		String input = JOptionPane.showInputDialog(null, "Type a number:");
		num = Integer.parseInt(input);

		//The way you should do it
		// num = (new Scanner(System.in)).nextInt();

		return num;
	}

	public static void main(String[] args) {
		
		int a = readNumber();
		int b = readNumber();

		int greater = getGreater(a, b);
	
		System.out.println(greater + " is greater than " + ((greater == a)? b : a));
	}
}