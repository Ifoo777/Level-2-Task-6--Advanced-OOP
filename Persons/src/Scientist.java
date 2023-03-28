//Extend the person class
//Scientist class Creating attributes 
public class Scientist extends Person {

	private String labCoatColor;
	private String typeOfScientist;

	// Create a constructor // This method is used to initialize the attributes to
	// the values that we
	// specify for each object
	public Scientist(int height, String hairColor, boolean ageGreater18, String labCoatColor) {
		super(height, hairColor, ageGreater18);
		this.labCoatColor = labCoatColor;
		identifyTypeOfScientist();
	}

	// Add a method in this class to use the lab coat color to detemine type of
	// scientist.
	private void identifyTypeOfScientist() {

		switch (this.labCoatColor) {
			case "green":
				typeOfScientist = "Biologist";
				break;
			case "purple":
				typeOfScientist = "Physics";
				break;
			case "white":
				typeOfScientist = "Pharmacist";
				break;
			case "blue":
				typeOfScientist = "Climatologist";
				break;
			case "yellow":
				typeOfScientist = "Genetacist";
				break;
			case "red":
				typeOfScientist = "Zoologist";
			default:
				break;
		}

	}

	// Implementing the applicable getters for this class

	public String getLabCoatColor() {
		return labCoatColor;
	}

	public String getTypeOfScientist() {
		return typeOfScientist;
	}

	// Overiding to string method.
	@Override
	public String toString() {
		return "\nHair Color: " + this.getHairColor() +
				"\nHeight: " + this.getHeight() +
				"\nIs Eighteen Years Old: " + this.isAgeGreater18() +
				"\nType of scientist: " + this.typeOfScientist +
				"\nLab Coat Color: " + this.labCoatColor;
	}

}
