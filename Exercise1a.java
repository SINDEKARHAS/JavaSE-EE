package javase;

import java.util.Scanner;

public class Exercise1a {
	public static void sum(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			if(i%2 != 0) {
				sum = sum+1;
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("The odd numbers upto are: ");
		sum(n);		
			
		}
	}


