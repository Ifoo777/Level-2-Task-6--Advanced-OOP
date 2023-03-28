// Create a Doctor Class with the following attributes

public class Doctor extends Person {

	private String ranking;
	private int yearsOfExp;

	// Create a constructor // This method is used to initialize the attributes to
	// the values that we
	// specify for each object
	public Doctor(int height, String hairColor, boolean ageGreater18, int yearsOfExp) {
		super(height, hairColor, ageGreater18);
		this.yearsOfExp = yearsOfExp;
		identifyRanking();
	}

	// Create a method to determine the doctors ranking in years
	public void identifyRanking() {
		if (this.yearsOfExp >= 0 && this.yearsOfExp < 6)
			this.ranking = "Medical Student";
		else if (this.yearsOfExp >= 7 && this.yearsOfExp <= 8)
			this.ranking = "Intern";
		else if (this.yearsOfExp >= 9 && this.yearsOfExp <= 16)
			this.ranking = "Resident";
		else if (this.yearsOfExp >= 17 && this.yearsOfExp <= 20)
			this.ranking = "Fellow";
		else if (this.yearsOfExp >= 21)
			this.ranking = "Attending";
		else
			System.out.println("Invalid years of experience");
	}

	// Write a method that will print out the description of a doctor object

	public int getYearsOfExp() {
		return yearsOfExp;
	}

	public String getidentifyRanking() {
		return ranking;
	}

	// define a method to display the contents of
	// each variable
	@Override
	public String toString() {
		return "\nHair Color: " + this.getHairColor() + "\nHeight: " + this.getHeight() + "\nYears of experience: "
				+ this.getYearsOfExp() + "\nRanking: " + this.ranking;
	}

}