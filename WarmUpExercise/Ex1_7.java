import javax.swing.JOptionPane;

public class Ex1_7 {

	public static boolean isLeapYear(int year) {
		boolean isLeap = false;

		if(year % 4 == 0)
			if(year % 100 == 0) {
				if(year % 400 == 0)
					isLeap = true;
			}
			else
				isLeap = true;

		return isLeap;
	}

	public static void main(String[] args) {
		int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Type the year:"));

		System.out.println(year + " is " + (isLeapYear(year)? "" : "not ") + "a leap year");
	}
}
	
