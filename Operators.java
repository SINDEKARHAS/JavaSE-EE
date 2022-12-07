package javase;
import java.util.*;
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number1: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter the number2: ");
		int b =sc.nextInt();
		
		//operators: arithmetic operators: +_%*/
		int sum = a+b;
		int divide = a%b;
		System.out.println("The devision is:");
		System.out.println(divide);
		System.out.println("The addition is: ");
		System.out.println(sum);
		//increment, decrement operator ++,--
		//they perform on one operand so they are unary
		int x = b++;
		int y = a--;
		System.out.println("The incremented and decremented values are: ");
		System.out.println(b++);
		System.out.println(a--);
		//
	}

}
