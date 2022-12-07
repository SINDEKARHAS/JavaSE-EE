package DefaultFSD;
import java.util.Scanner;
public class Multi2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int arr[][] = {
				{2,5,8,8},
				{2,5,8,1},
				{2,5,8,3},
				{2,5,8,5},
				{2,5,8,9}

		};
		
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the Columns value for replacements: ");
		int col1 = sc.nextInt();
		
		
		System.out.println("Enter the second Columns  value for replacements: ");
		int col2 = sc.nextInt();
		
		if(col1>3 || col2>3)
			System.exit(0);
		for( int i=0;i<4;i++) {
			
			int t = arr[i][col1];
			arr[i][col2] = arr[i][col2];
			arr[i][col2]= t;
			
			
		}
		
		System.out.println("\n Enter Matrix after swapping :\n");
		for(int i=0; i<4;i++) {
			for(int j=0;j<4;j++) {
				
				System.out.print(arr[i][j] +"\t");
				
			}
			System.out.println();
			
		}
		System.out.println("Row Length: "+arr.length);
		System.out.println("Column Length: "+arr[0].length);

		System.out.println("Cells : "+arr[0].length);
		
		int t= (arr[0].length*arr.length);
		
		System.out.println("Total Cells: "+t);
		
		System.out.println("Total Bytes: " +(t*(Integer.SIZE/8)));

		
		

	}

}
