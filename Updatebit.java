package javase;

import java.util.Scanner;

public class Updatebit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//update bit
		Scanner sc = new Scanner(System.in);
		int opr = sc.nextInt();
		int n =7;
		int pos = 1;
		int bitMask = 1<<pos;
		//set bit
		
		if(opr ==1) {
		int newNumber = bitMask | n;
		System.out.println(newNumber);
		}
		else {
			//clear bit
			
			int newbitMask = ~(bitMask);
			int newNumber = newbitMask & n;
			System.out.println(newNumber);
		}
	}

}
