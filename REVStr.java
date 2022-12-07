package javase;
import java.util.*;
import java.io.*;
public class REVStr {
	public static void Printrever(String str, int indx) {
		if(indx == 0) {
			System.out.println(str.charAt(indx));
			return;
		}
		System.out.print(str.charAt(indx));
		Printrever(str, indx-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print string reverse
		//time complexity O(n)
		//where n represent the number of strings
		//with the help of index variable
		String str = "No one is coming for you";
		Printrever(str, str.length()-1);
	}

}
