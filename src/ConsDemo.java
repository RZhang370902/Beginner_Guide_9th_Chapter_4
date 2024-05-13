// A simple constructor

class MyClass_1 {
	int x;

	MyClass_1() {
		x = 10;
	}
}

public class ConsDemo {
	public static void main(String[] args) {
		MyClass_1 t1 = new MyClass_1();
		MyClass_1 t2 = new MyClass_1();

		System.out.println("t1.x: " + t1.x + " " + "t2.x: " + t2.x);
	}

}
