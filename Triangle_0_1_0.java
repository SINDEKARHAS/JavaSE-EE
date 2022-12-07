package javase;

public class Triangle_0_1_0 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	//print as per matrix notations
		//
		int n=6;
		//outer loop
		for(int i=1; i<=n; i++) {
			//inner loop
			for(int j=1; j<=i; j++) {
				int sum = i+j;
				if(sum%2 == 0) {
					//for even numbers
					System.out.print("1");
				}
				else {
					System.out.print(0);
					
				}
			}
			System.out.println();
		}
		}
	}
