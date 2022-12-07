package javase;

public class Recursion2part {
	public static void towerH(int n, String sec, String help, String des) {
		if(n==1) {
		System.out.println("transfer disk " +n+ " from " +sec+ " to " +des);
return;
}
	towerH(n-1, sec, des, help);
	System.out.println("transfer disk " +n+ " from " +sec+ " to " +des);
	towerH(n-1, help,sec, des);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//recursion part 2
		//
		//time complexity: O(2n)
		//tower of Hanoi
		//transfer the disks from source to destination
		//smaller disk are always kept on top of the bigger disks
		//disks will transfer only one at a time
		int n =3;
		towerH(n, "S", "H", "D");
		
	}

}
