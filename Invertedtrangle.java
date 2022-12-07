package javase;

public class Invertedtrangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//outer loop
 int n=8;
 for(int i=n; i>=1; i--) {
	 //inner loop
	 for(int j=1; j<=i; j++) {
		 System.out.print("*");
	 }
	 System.out.println();
 }

	}
}
