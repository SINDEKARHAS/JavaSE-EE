package javase;

import java.util.Scanner;

public class Recursion {
	public static void printnumb(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		
		printnumb(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//class 1
		//recursion :-functions calls its inner function pass some value 
		//it calculate that value and return it to the function
		//prerequisites: 1)Iterations / loops
		//suppose f(x)^2 =x^2
		//so, f(f(x)) =x^2
		//f(x) =2^2 =4
		//f(x)= 4; f(4^2)=16
		//function call by itself until it reach specific condition.
		// 2) functions
		/*Qs print numbers from 5 to 1/*
		 * 
		 */
		int n =5;
		printnumb(n);
		 
		 
	}

}



