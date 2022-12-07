package javase;

import java.util.Scanner;

public class FEArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int[][] numbers = new int[rows][cols];
		
		//input
		//rows
		for(int i=0; i<rows; i++) {
			//columns
			for(int j=0; j<cols; j++) {
				numbers[i][j] = sc.nextInt();
				
			}
		}
		int x = sc.nextInt();
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				//Compare
				if(numbers[i][j]==x) {
					System.out.println(" X found at location ("+i+ ", "+j+")");
				}
				
			}
		}
		
	}

}
