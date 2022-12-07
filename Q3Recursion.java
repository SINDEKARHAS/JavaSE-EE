package javase;

public class Q3Recursion {
	public static void numsum(int i, int n, int sum) {
		if(i == n) {
		sum +=i;
		System.out.println(sum);
			return;
			}
		sum +=i;
		numsum( i+1, n,  sum);
		System.out.println(i);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q: print sum of the n natural numbers:
	numsum(1, 9, 0);	
	}

}
