package javase;

public class CountBtracking {
	public static int Btrack(int n, int m) {
		if(n==m) {
			return 2;
		}
		if(n<m) {
			return 1;
		}
		int verplacements = Btrack(n-m, m);
		
		int horplacements = Btrack(n-1, m);
		
		return verplacements + horplacements;
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	// Q: place tiles of size n*m in a floor ods size n*m
	//  
		
		int n=3, m=3;
	
	System.out.println(Btrack(n,m));
	
	}

}
