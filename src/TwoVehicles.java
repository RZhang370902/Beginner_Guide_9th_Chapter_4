// This program creates two Vehicle objects.

/*
class Vehicle {
	int passengers; // number of passengers
	int fuelcap; // fuel capacity in gallons
	int mpg; // fuel consumption in miles per gallon
}
*/

public class TwoVehicles {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		/*
		 * Vehicle minivan; // declare reference to object minivan = new Vehicle(); //
		 * allocate a Vehicle object
		 */
		Vehicle sportscar = new Vehicle(); // minivan and sportscar refer to separate objects

		int range1, range2;

		// assign values to fields in minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		// assign values to fields in sprotscar
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;

		range1 = minivan.fuelcap * minivan.mpg;
		range2 = sportscar.fuelcap * sportscar.mpg;

		System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range1);

		System.out.println("Sportscar can carry " + sportscar.passengers + " with a range of " + range2);

	}
}
