package week3.day2.assignments;

import java.util.HashSet;
import java.util.Set;

/*
 * Psuedocode
 * 
 * 1) Convert String to Character array
 * 2) Create a new Set -> HashSet
 * 3) Add each character to the Set and if it is already there, remove it
 * 4) Finally, print the set
 * 
 */
public class PrintOnlyUniqueCharacters {
	
	public static void main(String args[]) {
		String input = "babu";
		
		char[] inputArr= input.toCharArray();
		
		Set<Character> s = new HashSet<Character>();
		
		for(Character c: inputArr) {
			if(s.contains(c)) {
				s.remove(c);
				continue;
			}
			s.add(c);
		}
		
		System.out.println(s.toString());
		
	}

} //Ouput: [a, u]
