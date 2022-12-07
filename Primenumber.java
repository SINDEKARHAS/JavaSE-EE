package javase;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 67;
		 isPrime(n);
	}
	private static void isPrime(int n) {
		int count = 0;
		 if(n<2)
			 	System.out.println("The given number is prime "+n+" is not a prime number");
		 for(int i=1; i<=n; i++){
		 if(n%i==0)
		 count +=1;
			}
		 if(count>2)
			 System.out.println("The given number is prime "+n+" is not a prime number");
		 else
			 System.out.println("The given number is prime "+n+" is not a prime number");
	}
}
