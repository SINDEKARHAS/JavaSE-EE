package DefaultFSD;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		int p , sum=0,temp;
		System.out.println("Enter the Number: ");
		
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	
		temp=n;
		while(n>0) {
			p=n%10;
			sum=(sum*10)+p;
			n=n/10;
			
		}
		if(temp==sum) {
			System.out.println("Is a Palindrome number. ");
			
		}
		else {
			System.out.println("Not a Palindrome.");
			
		}
		
		// TODO Auto-generated method stub

	}

}
