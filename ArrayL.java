package javase;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList: memory is non contiguous
		//elements stored in non contiguous location
		// store only objects 
		//ArrayList store in heap
		//Operations on ArrayList: 
		//ADDITION
		//GET
		//MODIFY
		//DELETE/REMOVE
		//ITERATE/OPERATIONS
		//properties of array:- array have fix size
		// array have contiguous memory
		//we store primitive and objects in array
	
		ArrayList<Integer>list = new ArrayList<Integer>();
	
		list.add(0);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		//get elements
		int elements = list.get(0);
		System.out.println(elements);
		
		//add elements in between
		list.add(1,1);
		System.out.println(list);
		
		//set element
		list.set(3,5);
		System.out.println(list);
		
		//delete elements
		list.remove(1);
		System.out.println(list);
		
		//size 
		int size = list.size();
		System.out.println(size);
		
		//loops
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		}
		//sorting
	
	
	
	
		
		

	
	
	}
	
	


