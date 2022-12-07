package DefaultFSD;
import java.util.Scanner;


public class FirstSTS 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int a, b, c;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3 Numbers !: ");
		 
		 a = sc.nextInt();
		 b = sc.nextInt();
		 c = sc.nextInt();
		 
		 //(condition) ? true statement :false statement
		 
		  
		 		System.out.println((( a>b && a>c ) ? "A is Greater" :
		 										
		 			( b>c && b>a ) ? "B is Greater" :
		 																		
		 					(c>a && c>b ) ? "C is Greater": "Nothing is Greater" ));
		 					
		 			
		 			
			  
		 
		 
		 
	
	
	}

}
