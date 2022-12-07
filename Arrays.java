package javase;
import java.util.*;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Syntax: type[]arrayName = new type[size];
		//example: int[] marks =  new int[20];
		//indexing always starts with zero in arrays
		//memory addresses stored in hexadecimal forms
		int [] marks = new int[3];
		marks[0] = 76;
		marks[1] = 87;
		marks[2] = 70;
		for (int i=0; i<=2; i++) {
			System.out.println(marks[i]);
		}
	}

}
