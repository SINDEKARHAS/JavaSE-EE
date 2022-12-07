package javase;
import java.util.*;

public class MergeSort {
	public static void Conquer(int arr[], int si, int ei, int mid) {
		int merged[] = new int[ei-si+1];
		int idx1 = si;
		int idx2 = mid+1;
		int x = 0;
		while(idx1 <= mid && idx2 <= ei) {
			if(arr[idx1] <= arr[idx2]) {
				merged[x++] = arr[idx1++];
				
			}
			else {
				merged[x++] = arr[idx2++];
			}
		}
		while(idx1 <= mid) {
			merged[x++] = arr[idx1++];
		}
		while(idx2 <= ei) {
			merged [x++] = arr[idx2++];
			
		}
		for(int i=0, j=si; i<merged.length; i++,j++) {
			arr[j] = merged[i];
		}
		
	}
	public static void Divide(int arr[], int si, int ei) {
	 if(si>=ei) {
		 return;
	 }
		
		int mid = si + (ei -si)/2;
		Divide(arr,si, mid);
		Divide(arr, mid+1, ei);
		Conquer(arr, si, ei, mid);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// follows the divide and conquer rule
		//
		//Merge Sort:- convert unsorted data into ascending/descending order
		//
		int arr[] = {1,5,9,3,7,8,2,};
		int n = arr.length;
	Divide(arr,0,n-1);
	for(int i=0; i<n; i++) {
		System.out.println(arr[i]+ " ");
	}
	System.out.println();
	}	
	}


