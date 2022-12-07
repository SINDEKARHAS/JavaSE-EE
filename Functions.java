package javase;
import java.util.*;
public class Functions {
	public static void printMyName(String name) {
		System.out.println(name);
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//function is an block of an code which take some 
		//*input do operation on it and gives the desired output
		//returnTypefunctionName(type arg1, type arg2, type arg3..){// operation}
		//public and static are the keywords.  
		//function name must not equal to the java reserve keywords. 
		//arguments = inputs, arguments should be various types
		Scanner sc = new Scanner(System.in); 
		String name = sc.next();
		
		printMyName(name); //function call
	}

}

//what happens inside the memory?
// the stack created inside the memory by the name i.e; printMyName
// 