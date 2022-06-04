package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MissingNumber {
	
	public static void main(String args[]) {

	/*
		 * Psuedocode
		 * 
		 * 1) Remove the duplicates using Set
		 * 2) Make sure the set is in the ascending order
		 * 3) Iterate from the starting number and verify the next number is + 1
		 * 4) If did not match, that is the number
		 * 
		 */
	
	List<Integer> numbers = Arrays.asList(4,6,7,2,3,1,9,10,8,8,6,2);

    System.out.println(numbers);

    Set<Integer> hashSet = new LinkedHashSet(numbers);
    ArrayList<Integer> removedDuplicates = new ArrayList(hashSet);
   
    Collections.sort(removedDuplicates); 

     for(int i=0; i<removedDuplicates.size()-1;i++) {
    	 if(removedDuplicates.get(i+1) != removedDuplicates.get(i)+1) {
    		 int missingNum = removedDuplicates.get(i)+1;
    		 System.out.println("Missing number:" + missingNum);
    	 }
     }
     
     
}

}
