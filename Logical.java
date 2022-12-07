package DefaultFSD;

public class Logical {

	public static void main(String[] args) {
		
		int marks[] = {87,76,86,98,65};
		int total =0;
		float avg;
		
		for (int i=0;i<marks.length; i++) 
		{
			total = total  + marks[i];
			
			
		//System.out.println(marks(i));
		
		}
		
		
		System.out.println("Total: " +total );
		
		avg = total/marks.length;
		
		System.out.println("Average: " +avg);
		
		if(avg>=90)
			System.out.println("Grade A !");
		
		else if(avg>=70)
			System.out.println("Grade B !");
		
		else if(avg>=55)
			System.out.println("Grade C !");
		
		else if(avg >=45)
			System.out.println("Grade D !");
		
		else if(avg >0)
			System.out.println("Failed F !");
		
		System.out.println("_____________________");
		
		if(avg>=0 && avg<50)
			System.out.println("Failed");
		
		else if(avg>=50 && avg<60)
			System.out.println("Grade D !");
		
		else if(avg>=60 && avg<70)
			System.out.println("Grade C !");
		
		else if(avg>=70 && avg<85)
			System.out.println("Grade B !");
		
		else if(avg>=85 && avg<100)
			System.out.println("Grade A !");
		
		
		// TODO Auto-generated method stub

	}

}
