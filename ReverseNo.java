package DefaultFSD;

import java.util.Scanner;

public class ReverseNo {
    
    static int rev;
    
    public static void reverse(int number) {
        if(number == 0) return;
        
        int no = number % 10;
        rev = rev * 10 + no;
        reverse(number/10);
    }
    
    public static void main(String[] args) {
    	
    	System.out.println("Enter the Number: ");
    	
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        rev = 0;
        reverse(number);
        System.out.println("The Reverse Number is: ");
        
        System.out.println(rev);
    }
}