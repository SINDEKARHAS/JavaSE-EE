package javase;
import java.util.*;
public class Exercise1c {

	public static  boolean  isEligible(int age) {
		if(age>18) {
			
			return true;
		}
		return false;
	}
	public static void main(String args[]) {
		System.out.println("Enter the age : ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		System.out.println(isEligible(age));
		
				
		// TODO Auto-generated method stub
		
	}

}
