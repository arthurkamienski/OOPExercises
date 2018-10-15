import javax.swing.JOptionPane;
import java.util.Scanner;

public class Ex1_1 {

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
	
		System.out.println("Result sum " + a + "+" + b + "=" + (a+b));
	}
}