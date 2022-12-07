package javase;
import java.util.*;

public class Exercise1 {
	public static int Calculation(int a, int b, int c, int d) {
		int Avrg = (a+b+c+d)/4;
		return Avrg;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		
		int Avrg = (a+b+c+d)/4;
		System.out.println("The Avrge  value is : ");
		System.out.println(Avrg);
	}
	

}
