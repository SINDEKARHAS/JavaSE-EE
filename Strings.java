package javase;
import java.util.*;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.println("Your name is: "+name);
		//concatenation joining two or more sentences.
		String firstname=" tony";
		String lastname = " stark";
		String fullname = firstname + lastname;
		System.out.println(fullname);
		
		//length
		System.out.println(fullname.length());
	}

}
