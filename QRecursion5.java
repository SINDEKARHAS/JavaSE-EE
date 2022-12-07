package javase;

public class QRecursion5 {
	public static int calpower(int x, int y) {
		if(y == 0) {
			return 1;
		}
		if(x == 0) {
			return 0;
		}
		if(y%2 == 0) {
			return  calpower(x,y/2) * calpower(x,y/2);
			
		}
		else {
			return calpower(x,y/2) * calpower(x,y/2)*x;
		}
	}
	public static void main(String[] args) {
		int x=2, y=5;
		int ans = calpower(x,y);
		System.out.println(ans);
		// TODO Auto-generated method stub
		//Print x^n (stack height =log(n))
		
	}

}
