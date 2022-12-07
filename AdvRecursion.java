package javase;
import java.util.*;
import java.io.*;
public class AdvRecursion {
	public static void Permute(String str, String per) {
		if(str.length() == 0) {
			System.out.println(per);
			return;
		}
		
		for(int i=0;i<str.length(); i++) {
			char currChar = str.charAt(i);
			//"abc" ->"bc"
			String newStr = str.substring(0,i)+ str.substring(i+1);
			Permute(newStr, per+currChar);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//advance recursion problems
		//Q: print all permutations of string 
		//permutations is all possible combination
		//of given strings
		//time complexity is O(n!)
		String str ="xyz";
		Permute(str, "");
	}

}
