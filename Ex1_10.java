public class Ex1_10 {
	public static double applyInterest(double interest, double money) {
		return money + money*interest/100;
	}

	public static double moneyInNYears(double money, double interest, int years) {
		for(int i=0; i<years; i++)
			money = applyInterest(interest, money);

		return money;
	}

	public static void main(String[] args) {
		int years = 100;
		double initialMoney = 100;
		double interest = 1.5; //in percent

		System.out.printf("%.2f\n", moneyInNYears(initialMoney, interest, years));
	}
}