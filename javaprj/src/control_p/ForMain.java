package control_p;

public class ForMain {

	public static void main(String[] args) {
		System.out.println("아기상어");
		System.out.println();
		System.out.println("엄마상어");
		
		System.out.print("상어");
		System.out.print("고래");
//		System.out.print();
		System.out.print("문어");
		System.out.println();
		
		// 1
		for(int i=0; i<5; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		*
//		**
//		***
//		****
//		*****
		
		System.out.println();
		
		// 2
		for (int i=0; i<5; i++) {
			for (int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		*****
//		****
//		***
//		**
//		*
		
		System.out.println();
		
		// 3
		for (int i=0; i<5; i++) {
			for (int j=4; j>i; j--) {
				System.out.print(" ");
			}
			for (int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//	     *
//	    **
//	   ***
//	  ****
//	 *****
		
		System.out.println();
		
		// 4
		for (int i=0; i<5; i++) {
			for (int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for (int k=5; k>i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
		System.out.println();
		
		// 5
		for (int i=0; i<5; i++) {
			for (int j=4; j>i; j--) {
				System.out.print(" ");
			}
			for (int k=0; k<=i*2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//	     *
//	    ***
//	   *****
//	  *******
//	 *********
		
		System.out.println();
		
		// 6
		for (int i=0; i<5; i++) {
			for (int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for (int k=0; k<(5-i)*2-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		*********
//		 *******
//		  *****
//		   ***
//		    *
		
		System.out.println();
		
		// 블랙 다이아몬드
		for (int i=0; i<9; i++) {
			for (int j=5; j>i; j--) {
				System.out.print("*");
			}
			for (int k=0; k<=i*2; k++) {
				if (i < 5) {
					System.out.print(" ");
				}
			}
			for (int j=5; j>i; j--) {
				System.out.print("*");
			}
			if (i > 4) {
				
				for (int m=0; m<=i-4; m++) {
					System.out.print("*");
				}
				for (int k=0; k<(9-i)*2-1; k++) {
					System.out.print(" ");
				}
				for (int n=0; n<=i-4; n++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
//		***** *****
//		****   ****
//		***     ***
//		**       **
//		*         *
//		**       **
//		***     ***
//		****   ****
//		***** *****
		
		
	}

}
