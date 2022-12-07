package DefaultFSD;

import java.util.Scanner;


public class Exercise_01 

{
public static void main(String[] args) {
	
	
	int Hr,w = 0;
	System.out.println("Enter the Number of Working Hours : ");
	Scanner sc =new Scanner(System.in);
	Hr = sc.nextInt();
	

	if(Hr<=8)
		w =Hr+100;
	else if(Hr>=8 && Hr<=12) {
		w=Hr+200;
	System.out.println("Wages: "+w);
	}
	else if(Hr>=12 && Hr<=16) {
		w =Hr+400;
	System.out.println("Wages: "+w);
	}
	else if (Hr>=16 && Hr<=18) {
		w =Hr+500;
		System.out.println("Wages :" +w);
		
	}
}
}



	
	
	