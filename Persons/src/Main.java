public class Main {

	// Create an instance of an object Doctor and Scientist
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor docOne = new Doctor(20, "black", true, 15);
		Scientist scientistOne = new Scientist(50, "red", false, "red");

		// Display output
		System.out.println(docOne.toString());
		System.out.println(scientistOne.toString());

	}

}
