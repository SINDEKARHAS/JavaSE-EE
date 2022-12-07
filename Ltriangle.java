package javase;

public class Ltriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//outer loop
		//two inner loop first for total number of stars
		//total number of integers

		int n=5;
		for(int i=1;i<=n;i++) {
			//inner loop ->space print
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			//inner loop ->star print
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
