import javax.swing.JOptionPane;

public class Ex1_8 {

	public static boolean isChar(String s) {
		return s.length() == 1;
	} 

	public static boolean isVocal(char c) {
		boolean vocal;

		//the bad way
		switch (c) {
			case 'a':
				vocal = true;
				break;
			case 'e':
				vocal = true;
				break;
			case 'i':
				vocal = true;
				break;
			case 'o':
				vocal = true;
				break;
			case 'u':
				vocal = true;
				break;
			default:
				vocal = false;
				break;				
		}

		// better
		// (c+"") converts char to string
		// vocal = "aeiou".contains(c + "");

		//best (using regular expressions)
		// vocal = (c + "").matches("[aeiou]");

		return vocal;
	}

	public static void main(String[] args) {
		
		// toLowerCase so that we dont have to worry about cases
		String input = JOptionPane.showInputDialog(null, "Type a character:").toLowerCase();

		if(isChar(input))
			System.out.println("Character is a " + (isVocal(input.charAt(0))? "vocal." : "consonant."));
		else
			System.out.println("Input is not a char.");
	}
}