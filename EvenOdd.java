package DefaultFSD;

/* find Even sum and Odd Sum of the array elements*/

import java.util.Scanner;

public class EvenOdd
{
	public static void main(String... g)
	{
		int val,i;
		int even=0,odd=0;
		
		System.out.println("Enter location of an array: ");
		
		Scanner sc = new Scanner(System.in);
		val = sc.nextInt();

		int arr[]= new int[val];
		
		for(i=0 ;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();				
		}
		
		for(i=0 ; i<arr.length ; i++)
		{
			if(arr[i] % 2 == 0)
				even = even + arr[i];
			else
				odd = odd + arr[i];
		}
		
		System.out.println("even : "+even);
		System.out.println("odd : "+odd);
		
	}	
}

