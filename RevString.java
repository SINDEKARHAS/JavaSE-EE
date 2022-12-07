package javase;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverse string
		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb);
		for(int i=0; i<sb.length()/2; i++ ) {
			int front = i;
			int back = sb.length()- 1-i;
			char frontChar = sb.charAt(front);
			char backChar = sb.charAt(back);
			
			sb.setCharAt(front, backChar);
			sb.setCharAt(back,frontChar);
			System.out.println(sb);
			
		}
	}

}
