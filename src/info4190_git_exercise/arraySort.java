package info4190_git_exercise;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class arraySort {
	public static void main(String[] args) {
		// Instantiate ArrayLists and new instance of Random class
		ArrayList<Integer> intArray = new ArrayList<>();
		ArrayList<String> stringArray = new ArrayList<>();
		Random rand = new Random();
		
		// Fill int array with 10 random integers between 0 and 999
		for (int i = 0; i < 10; i++) {
			intArray.add(rand.nextInt(1000));
		}
		
		// Fill string array with 10 random strings
		StringBuilder sb = new StringBuilder(10);
	    for(int i = 0; i < 10; i++) {
        	sb.setLength(0);
	        for (int j = 0; j < 5; j++) {
	        	char tmp = (char) ('a' + rand.nextInt('z' - 'a'));
	        	sb.append(tmp);
	        }
	        stringArray.add(sb.toString());
	    }
		
		// Print int array
		System.out.println("Random integers:");
		for (int i = 0; i < intArray.size(); i++) {
			System.out.println(intArray.get(i) + " ");
		}
		
		// print string array
		System.out.println();
		System.out.println("Random strings:");
		for (int i = 0; i < stringArray.size(); i++) {
			System.out.println(stringArray.get(i) + " ");
		}	
		
		// Sort and reprint int array
		Collections.sort(intArray);
		System.out.println();
		System.out.println("Integers sorted:");
		for (int i = 0; i < intArray.size(); i++) {
			System.out.println(intArray.get(i) + " ");
		}
		
		// Sort and reprint string array
		Collections.sort(stringArray);
		System.out.println();
		System.out.println("Strings sorted:");
		for (int i = 0; i < stringArray.size(); i++) {
			System.out.println(stringArray.get(i) + " ");
		}
		
	}
}
