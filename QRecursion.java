package javase;

public class QRecursion {
public static void printnumb(int n) {
		if(n==6) {
			return;
		}
		System.out.println(n);
		printnumb(n+1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =1;
		printnumb(n);
	}
}
