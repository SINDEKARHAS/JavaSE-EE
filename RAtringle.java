package javase;

public class RAtringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//the number of the total rows equal to the number of stars in the triangle
		//where i defines the upper limit i.e number of stars we were printing
		//j is an inner limit
		int n=6;
		for(int i=0;i<=n;i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
