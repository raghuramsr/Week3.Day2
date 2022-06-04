package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
	
	/*
	 * Pseudo code 
	 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 
	 * g) Displaying the String without duplicate words	
	 */
		
	public static void main(String args[]) {
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] textArr = text.split(" ");
		
		List<String> textList = new ArrayList<String>();
		
		for(String word: textArr) {
			if(textList.contains(word)) {
				continue;
			}
			textList.add(word);
		}
		
		System.out.println(String.join(" ", textList));
	}


}