package javase;

public class Ifsort {
	public static boolean Ifsorted(int arr[], int idx) {
		if(idx == arr.length-1) {
			return true;
		}
		if(arr[idx] < arr[idx+1]) {
			return Ifsorted(arr, idx+1);
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,2,3};
		System.out.println(Ifsorted(arr,0));
	}

}
