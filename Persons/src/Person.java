
public class Person {

	// Create a constructor to give the person class the following attributes
	private int height;
	private String hairColor;
	private boolean ageGreater18;

	// This method is used to initialize the attributes to the values that we
	// specify for each object

	public Person(int height, String hairColor, Boolean ageGreater18) {
		this.height = height;
		this.hairColor = hairColor;
		this.ageGreater18 = ageGreater18;
	}

	// Write a method that will print out the description of a person object

	public String getHairColor() {
		return hairColor;
	}

	public int getHeight() {
		return height;
	}

	public boolean isAgeGreater18() {
		return ageGreater18;
	}
}
