package javase;

public class QuickSort {
	public static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i =low-1;
		
		for(int j=low; j<high; j++) {
			if(arr[j]< pivot) {
				i++;
				//swap
				int temp = arr[i];
				arr[i] =arr[j];
				arr[j] =  temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] =  temp;
		return i;
		
		}
	
	
	
	public static void Quick(int arr[], int low, int high) {
		if(low<high) {
			int pidx = partition(arr, low, high);
			Quick(arr, low, pidx-1);
			Quick(arr, pidx+1, high);
			}
		}
	

	public static void main(String[] args) {
	
		int[]arr = {1,5,9,3,7,6,4};
		int n = arr.length;
		//TODO Auto-generated method stub
		//Quick sort:- arrange unsorted array into sorted
		//pivot & partition important keyword
		//pivot:- center around things happen
		//partition:- segregating elements
		Quick(arr, 0, n-1);
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]+ " ");
			
		}
		System.out.println();
	}

}
