// A program that uses the Vehicle class.

class Vehicle {
	int passengers; // number of passengers
	int fuelcap; // fuel capacity in gallons
	int mpg; // fuel consumption in miles per gallon

	// Display the range.
	void range_1() {
		System.out.println("Range is " + fuelcap * mpg);
	}

	int range() {
		return mpg * fuelcap;
	}

	// Compute fuel needed for a given distance.
	double fuelNeeded(int miles) {
		return (double) miles / mpg; // casting into double
	}

}

// This class declares an object of type vehicle

class VehicleDemo {

	public static void main(String[] args) {

		Vehicle minivan = new Vehicle();
		int range;

		// assign values to fields in minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16; // <--Notice the use of the dot operator to access a member
		minivan.mpg = 21;

		// compute the range assuming a full tank of gas
		range = minivan.fuelcap * minivan.mpg;
		System.out.println(
				"Minivan can carry " + minivan.passengers + " passengers with a range of " + range + " miles.");

		// System.out.println("Test.");
	}
}