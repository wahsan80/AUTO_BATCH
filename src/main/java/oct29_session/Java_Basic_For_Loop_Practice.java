package oct29_session;

public class Java_Basic_For_Loop_Practice {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 20*2; i++) {
			if (i%2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		for (int j = 1; j <= 10; j++) {
			System.out.print(j*5 + " ");
		}
		System.out.println();
		
		for (int k = 100; k >= 50; k--) {
			System.out.print(k + " ");
		}
		System.out.println();
		/*
		for (int m = 1; m <= 10; j++) {
			System.out.print(j*5 + " ");
		}
		System.out.println();
		*/
	}

}
