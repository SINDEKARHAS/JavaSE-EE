package javase;

import java.util.Scanner;

public class AdditionFunction {
public static int calculation(int a, int b) {
	int sum = a+b;
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = calculation(a,b);
		System.out.print("Sum of 2 numbers is : "+ sum);
	}

}
