package javase;

public class FindF_L_Occr {
	public static int first = -1;
	public static int last = -1;
	public static void FindF_L_Occr(String str, int indx, char element){
		if(indx == str.length()) {
			System.out.println(first);
			System.out.println(last);
			return;
		}
		char currChar =str.charAt(indx);
		if(currChar == element) {
			if(first == -1) {
				first =indx;
			}
			else {
				last = indx;
			}
		}
		FindF_L_Occr(str, indx+1, element);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to check how many time the char repeat in an specific String
		//"abaacdaefaah" check the conditions6
		
		String str = "abaacdaefaah";
		FindF_L_Occr(str, 0, 'a');
	}
}
