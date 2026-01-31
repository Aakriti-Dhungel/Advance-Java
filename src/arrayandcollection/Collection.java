package arrayandcollection;

import java.util.ArrayList;
import java.util.List;

public class Collection {

	
	// Collection provide methods, which makes manipulation easier
	//array, arraylist ,map 
	//similar to array with additional methods
	// collection of objects
	
	public void main(String args[]) {
//		List<E> 
		int[] arr = {1,2,3,4,5};
		int i = 1;
		for (int i : arr) {
			System.out.println(arr[i]);
		}
		List<Integer> i = new ArrayList<Integer>(i);
		
		
		// Array = ArrayList, LinkedList
		//Set = Hash set and 
		//Map
		
		//list is just interface , we make object with arraylist, 
		// reference type one and return type another we can make if there is inheritance
		
		// reference type parent ko , object type  child ko if we have inheritance
	}
}
