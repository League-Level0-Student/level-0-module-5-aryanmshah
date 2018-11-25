package nested_loops;

public class forloopgauntlet {
	public static void main(String[] args) {

		for (int i = 0; i < 101; i++) {

			System.out.println(i);

		}

		for (int j = 100; j > 0; j--) {

			System.out.println(j);

		}

		for (int l = 2; l < 101; l++) {

			if (l % 2 == 0) {
				System.out.println(l);
			} else {
			}
		}

		for (int j = 100; j > 0; j--) {

			System.out.println(j);

		}

		for (int i = 1; i < 99; i++) {

			if (i % 2 == 0) {

			} else {

				System.out.println(i);
			}

		}

		for (int j = 100; j > 0; j--) {

			System.out.println(j);

		}

		for (int h = 1; h < 501; h++) {

			if (h % 2 == 0) {
				System.out.println(h + " is even");
			} else {

				System.out.println(h + " is odd");
			}
		}

		for (int y = 0; y < 777; y++) {

			if (y % 7 == 0) {
				System.out.println(y);
			} else {

			}
		}

		for (int a = 0; a < 3; a++) {

			for (int t = 0; t < 3; t++) {
				System.out.println(t + " " + a);
			}

		}
		System.out.println("break-");

		for (int p = 0; p < 9; p+=3) {

			for (int t = 1; t < 4; t++) {
				System.out.print(t +p +" ") ;
			
			
			}
			System.out.println();
			
		}
		
		
		for (int p = 0; p < 100; p+=10) {

			for (int t = 1; t < 11; t++) {
				System.out.print(t +p +" ") ;
			
			
			}
			System.out.println();
			
		}
		
		
		for (int p = 0; p < 7; p+=1) {

			for (int t = 0; t < p; t++) {
				System.out.print("* ") ;
			
			
			}
			System.out.println();
			
		}

	}

}
