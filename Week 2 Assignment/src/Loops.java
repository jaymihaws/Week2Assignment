
public class Loops {

	public static void main(String[] args) {

		// a
		int x = -1;
		while (x++ <= 100) {
			if (x % 2 == 0) {
				System.out.println(x);
			}

			// b
			int b = 100;
			while (b >= 0) {
				System.out.println(b);
				b -= 3;
			}

			// c
			for (int i = 1; i <= 100; i += 2) {
				System.out.println(i);
			}

			// d
			for (int I = 0; I <= 100; I++) {

				if (I % 3 == 0 && I % 5 == 0) {
					System.out.println("Hell0World");
				} else if (I % 3 == 0) {
					System.out.println("Hello");
				} else if (I % 5 == 0) {
					System.out.println("World");
				} else {
					System.out.println(I);
				}
			}
		}
	}
}
