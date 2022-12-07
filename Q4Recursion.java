package javase;

public class Q4Recursion {
	public static int CalFacto(int n) {
		if(n==1 || n==0) {
			return 1;
		}
		
		int fact_nm1 = CalFacto(n-1);
		int fact_n = n*fact_nm1;
		return fact_n;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q: print sum of first n natural numbers
		int n =5;
		int ans = CalFacto(n);
		System.out.println(ans);
		
		
	}

}
