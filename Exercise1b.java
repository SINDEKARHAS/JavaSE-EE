package javase;

import java.util.Scanner;

public class Exercise1b {
	
	public static int Greater(int a, int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("The Greatest number among them is: ");
		System.out.println(Greater(a,b));
	}

}
