package week3.day2.assignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {

		// Here is the input
		//int[] data = {3,2,11,4,6,7};

		
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */
		List<Integer> data = Arrays.asList(3,2,11,4,6,7);
		
		Collections.sort(data);
		
		System.out.println(data.get(data.size()-2));
		
	}

	
}
