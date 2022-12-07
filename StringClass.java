package DefaultFSD;

public class StringClass {

	public static void main(String[] args) {
		
		
	// sting buffer exercise
	//	string buffer is mutable class
	//Synchronization means thread safe methods.
		
		
		StringBuilder str1 = new StringBuilder("this is ");
		System.out.println(str1.capacity());
		
		
		str1.trimToSize();
		System.out.println(str1.capacity());
		
		StringBuilder str2 = new StringBuilder("Java Language");
		str1.append(str2);
		System.out.println(str1);
		 
		System.out.println(str1.capacity());
		
		StringBuffer str3=new StringBuffer("this");
		System.out.println();
	
		

	}

}
