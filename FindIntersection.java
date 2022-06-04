package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {
	
	public static void main(String args[]) {

	/*
	 * Pseudo Code
	
	 * a) Declare An array for {3,2,11,4,6,7};	 
	 * b) Declare another array for {1,2,8,4,9,7};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 
	 *  f) Print the first array (shoud match item in both arrays)
	 */
	
	
	List<Integer> array1 = Arrays.asList(3,2,11,4,6,7);
	List<Integer> array2 = Arrays.asList(1,2,8,4,9,7);
	
	int flag =0;
	for(int i=0;i<array1.size(); i++) {
		for(int j=0;j<array2.size(); j++) {
			if(array1.get(i) == array2.get(j)) {
				System.out.println("Intersection:" + array1.get(i));
				flag = 1;
			}
			
	}
		if(flag == 1) {
			break;
		}
	}
	}
	
}