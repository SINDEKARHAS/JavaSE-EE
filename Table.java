package javase;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		//print the desired table
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<11; i++)
		{
			System.out.println(i*n);
		}
	}

}
