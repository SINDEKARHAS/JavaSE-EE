package DefaultFSD;

public class Union {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5,8,9,3,5};
		int arr1[] = {5,5,8,8,8};
		
		int j=0,i=0;
		
		int result[]= new int[arr.length+arr1.length];
		
		for(i=0;i<arr.length;i++) {
			result[j] = arr[i];
			j++;
			
		}
		for(i=0; i<arr1.length;i++) {
			j++;
			
			//enhanced for loop
			//used for object/element based values
			//for collection
			/*for(variable: collection/array) 
			 * {
			 * 
			 * }
			 * */
			
			for(int v : result) {
				System.out.println(v);
				
			}
		}
	}
}
