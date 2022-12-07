package javase;
import java.util.*;


public class Exercise1e {
public static Double getCircumference(Double radius) {
	System.out.println("The Circumference is : ");
	return 2*3.14*radius;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number : ");
		Scanner sc = new Scanner(System.in);
		
		Double radius = sc.nextDouble();
		
System.out.println(getCircumference(radius));
	}
		
	}

