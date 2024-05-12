/*
 * Reference Variables an Assignment
 */
public class ThreeCars {
	public static void main(String[] args) {
		Vehicle car1 = new Vehicle();
		Vehicle car2 = car1;

		car1.mpg = 26;

		System.out.println(car1.mpg);
		System.out.println(car2.mpg);
		System.out.println();

		Vehicle car3 = new Vehicle();

		car2 = car3;
		System.out.println(car1.mpg);
		System.out.println(car2.mpg);

	}

}
