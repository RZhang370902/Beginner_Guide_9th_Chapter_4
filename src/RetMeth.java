//Use a return value
public class RetMeth {

	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();

		int range1, range2;

		// assign values to fields in minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		// assign values to fields in sprotscar
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;

		// get the ranges

		range1 = minivan.range();
		range2 = sportscar.range();

		System.out.println("Minivan can carry " + minivan.passengers + " with range of " + range1 + " miles");

		minivan.range_1(); // display range of minivan

		System.out.println("Sportscar can carry " + sportscar.passengers + "with range of " + range2 + " miles");

		sportscar.range_1(); // display range of sportscar

		System.out.println();
		System.out.println("Directly call method");
		System.out.println("Minivan can carry " + minivan.passengers + " with range of " + minivan.range() + " miles");

		if (minivan.range() > sportscar.range())
			System.out.println("Minivan has greater range");
		else
			System.out.println("Sportscar has greater range");

	}
}