package javase;

public class Str_atend {
	public static void MoveX(String str, int index, int Count, String NewS ) {
		if(index == str.length()) {
			for(int i=0; i<Count; i++) {
				NewS +='x';
			}
			System.out.println(NewS);
			return;
		}
		
		char  currChar = str.charAt(index);
		if(currChar == 'x') {
			Count++;
			MoveX(str, index+1, Count, NewS);
		}else 
		{
			NewS  += currChar;
			MoveX(str, index+1, Count, NewS);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print all the repeated char at the end of the strign 
		//"a,x,x,d,f,r,x,x,w,x,"
		String str = "axdxdsexerx";
		MoveX(str, 0,0, "");
	}

}
