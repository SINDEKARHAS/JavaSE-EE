package javase;

import java.util.Scanner;

public class greaterless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a%b == 0) {
			System.out.println("They both are same");
		}
		else if(a>b) {
			System.out.println("A is Greater ");
		}
			else {
				System.out.println("B is greater ");
			}
		}


	}


