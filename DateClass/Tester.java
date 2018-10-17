class Tester {
	public static void main(String[] args) {
		Date data;

		System.out.println("Number of dates created: " + Date.getNumberOfDateObjects());

		data = new Date(30, 12, 1970);
		System.out.println(data.toString());

		System.out.println("Number of dates created: " + Date.getNumberOfDateObjects());

		data = data.addDay();
		System.out.println(data);
		System.out.println("Number of dates created: " + Date.getNumberOfDateObjects());

		data = data.addDay();
		System.out.println(data);
		System.out.println("Number of dates created: " + Date.getNumberOfDateObjects());
	}
}