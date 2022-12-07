package javase;

public class Invertednumtrangle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//outer loop
	int n=6;
	for(int i=1; i<=n; i++) {
		//inner loop
		for(int j=1; j<=n-i+1; j++) {
			System.out.print(j+" ");
		}
	System.out.println();
	}

}
}

