package javase;

import java.util.Scanner;

public class Quize {

	public static void main(String[] args) {
		// print sum of 1 to 10 using for loop
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int sum = 0;
		for(int i=0;i<=n;i++) {
			sum = sum+i;
			
			
		}
		System.out.println(sum);
	}

}
