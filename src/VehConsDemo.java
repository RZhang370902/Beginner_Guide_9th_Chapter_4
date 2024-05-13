// Add a constructor.
class Veh {
	int passengers; // number of passengers
	int fuelcap; // fuel capacity in gallons
	int mpg; // fuel consumption in miles per gallon

	// This is a constructor for Veh.

	Veh(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}

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

public class VehConsDemo {
	public static void main(String[] args) {

		// construct complete vehicles
		Veh minivan = new Veh(7, 16, 21);
		Veh sportscar = new Veh(2, 14, 12);
		double gallons;
		int dist = 252;

		gallons = minivan.fuelNeeded(dist);

		System.out.println("To go" + dist + " miles minivan needs " + gallons + " Gallons of fuel");

		gallons = sportscar.fuelNeeded(dist);

		System.out.println("To go" + dist + " miles sportscar needs " + gallons + " Gallons of fuel");

	}

}
