package javase;

public class BubbleSort {
	public static void printarray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		//bubble sort
		//time complexity = O(0^2) #worst
		//78312
		//greatest element will compare with other elements
		//78312 =73128 =31278 =12378(Ascending)
	int arr[] = {7,8,3,1,2};
	//bubble sort
	for(int i=0; i<arr.length-1; i++ ) {
		for(int j=0; j<arr.length-i-1; j++) {
			if(arr[j]>arr[j+1]) {
				//swap
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				
			}
			
		}
		
	}
	printarray(arr);
	
	}

}
