package javase;

public class Countpath {
public static int Count(int i, int j, int n, int m) {
	if(i==n || j==m) {
		return 0;
	}
	
	if(i==n-1 && j == n-1) {
	 return 1;
	
}
	int dounpath = Count(i+1,j,n,m);
	
	int rightpath = Count(i,j+1,n,m);
	return dounpath + rightpath;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q: count total paths in maze to move 
		//from (0,0) to (n,m)
		int n=3, m=3;
		int totalpath =Count(0,0,n,m);
		System.out.println(totalpath);
		
	}

}
