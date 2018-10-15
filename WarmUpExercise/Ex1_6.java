import javax.swing.JOptionPane;

public class Ex1_6 {
	public static void printOptions() {
		System.out.println("Please choose your meal!");
		System.out.println("a: Schnitzel with Pommes and Salad");
		System.out.println("b: Kaesespaetzle with Salad");
		System.out.println("c: Balls from vegetables");
	}

	public static void confirmChoice(String choice) {
		System.out.print("You selected ");

		if(choice.equals("a")) {
			System.out.println("option a: Schnitzel with Pommes and Salad");
		}
		else if(choice.equals("b")) {
			System.out.println("option b: Kaesespaetzle with Salad");
		}
		else if(choice.equals("c")) {
			System.out.println("option c: Balls from vegetables");
		}
		else
			System.out.println("an unavailable option.");

		/*
			switch(choice) {
				case "a":
					System.out.println("option a: Schnitzel with Pommes and Salad");
				break;
				case "b":
					System.out.println("option b: Kaesespaetzle with Salad");
				break;
				case "c":
					System.out.println("option c: Balls from vegetables");
				break;
				default:
					System.out.println("an unavailable option.");
				break;
			}
		*/
	}

	public static void main(String[] args) {
		printOptions();

		confirmChoice(JOptionPane.showInputDialog(null, "Choose a meal"));
	}
}