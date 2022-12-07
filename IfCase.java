package DefaultFSD;

import java.util.Scanner;

public class IfCase {

	public static void main(String[] args) {
		



		// find out which number is greater or equal 
				int a,b,c;
				
				Scanner obj = new Scanner(System.in);
				
				System.out.println("Enter value 1: ");
				a = obj.nextInt();
				
				System.out.println("Enter value 2: ");
				b = obj.nextInt();	
				
				System.out.println("Enter value 3: ");
				c = obj.nextInt();
				
				
				//nested if condition
				
				if( a== b && a==c)
				{
					System.out.println("Equals");
				}
				else
				{			
						if(a > b && a>c)
							{
							System.out.println("A is greater" +a);			
							}
						if(b > c && b> a) {
							System.out.println("B is greater: "+b);
						}
						else
							{
							System.out.println("C is greater" +c);				
							}
				}
								
			}

		
		/*
			syntax: 
						
					if(condition+logical operators(&& || !))
						{
							true logical
						}
					else
						{
							false logical 
						}
					
		*/
		// TODO Auto-generated method stub

	}


