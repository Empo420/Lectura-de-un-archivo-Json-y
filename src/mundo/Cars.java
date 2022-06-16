package mundo;

public class Cars {

	private String name;
	private String miles_per_Gallon;
	private String cylinders;
	private String displacement;
	private String horsepower;
	private String weight_in_lbs;
	private String acceleration;
	private String year;
	private String origin;

	public Cars(String name, String miles_per_Gallon, String cylinders, String displacement, String horsepower,
			String weight_in_lbs, String acceleration, String year, String origin) {

		this.name = name;
		this.miles_per_Gallon = miles_per_Gallon;
		this.cylinders = cylinders;
		this.displacement = displacement;
		this.horsepower = horsepower;
		this.weight_in_lbs = weight_in_lbs;
		this.acceleration = acceleration;
		this.year = year;
		this.origin = origin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMiles_per_Gallon() {
		return miles_per_Gallon;
	}

	public void setMiles_per_Gallon(String miles_per_Gallon) {
		this.miles_per_Gallon = miles_per_Gallon;
	}

	public String getCylinders() {
		return cylinders;
	}

	public void setCylinders(String cylinders) {
		this.cylinders = cylinders;
	}

	public String getDisplacement() {
		return displacement;
	}

	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}

	public String getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(String horsepower) {
		this.horsepower = horsepower;
	}

	public String getWeight_in_lbs() {
		return weight_in_lbs;
	}

	public void setWeight_in_lbs(String weight_in_lbs) {
		this.weight_in_lbs = weight_in_lbs;
	}

	public String getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(String acceleration) {
		this.acceleration = acceleration;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	@Override
	public String toString() {
		return "Cars [name=" + name + ", miles_per_Gallon=" + miles_per_Gallon + ", cylinders=" + cylinders
				+ ", displacement=" + displacement + ", horsepower=" + horsepower + ", weight_in_lbs=" + weight_in_lbs
				+ ", acceleration=" + acceleration + ", year=" + year + ", origin=" + origin + "]";
	}

}
