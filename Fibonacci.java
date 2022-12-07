package javase;

public class Fibonacci {
	public static void printfab(int n,  int m, int k) {
		if(k==0) {
			return;
		}
		int j = n+m;
		System.out.println(j);
		printfab(j,k,k-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q: print the fibonacci series?
		
		int n=0,m=1;
		System.out.println(n);
		System.out.println(m);
		int k=8;
		printfab(n, m, k-2);
	}

}
