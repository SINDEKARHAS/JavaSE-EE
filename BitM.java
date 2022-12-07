package javase;

public class BitM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Bit manipulation
		int n =7;
		int pos = 3;
		int bitMask = 1<<pos;
		if((bitMask & n)==0) {
			System.out.println("bit was zero");
			
		}
		else {
			System.out.println("bit was one");
		}
		
		//set bit
		int newNumber = bitMask | n;
		System.out.println(newNumber);
		
		//clear bit
		int bitmask = 1<<pos;
		int notbitmask = ~(bitmask & n);
		System.out.println(newNumber);
		
		//update bit
		
		
	}

}
