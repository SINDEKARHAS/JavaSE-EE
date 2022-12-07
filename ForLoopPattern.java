package DefaultFSD;

import java.util.Scanner;

public class ForLoopPattern {

	public static void main(String[] args) {
		
		int r;
		// TODO Auto-generated method stub

		
		
		
		System.out.println("Enter the last row to print");
		
		Scanner sc = new Scanner(System.in);
		r =sc.nextInt();
		
		
		
		int a = 65;
		for(int i=1; i<=r; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print((char)a);
				a++;
				
				
			}
			System.out.println();
			
		}
		
		

	}

}
