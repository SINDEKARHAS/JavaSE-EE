package javase;

public class ImmString {

	public static void main(String[] args) {
		// Strings  are immutable in java
		//once a string is saved in stack it can not be changed
		StringBuilder sb = new StringBuilder("Hemant");
		System.out.println(sb);
		
		System.out.println(sb.charAt(3));
		
		sb.setCharAt(3,'@');
		System.out.println(sb);
	}

}
