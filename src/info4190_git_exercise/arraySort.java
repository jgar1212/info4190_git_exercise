package info4190_git_exercise;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class arraySort {
	public static void main(String[] args) {
		// Instantiate ArrayList and new instance of Random class
		ArrayList<Integer> intArray = new ArrayList<>();
		Random rand = new Random();
		
		// Fill array with 10 random integers between 0 and 999
		for (int i = 0; i < 10; i++) {
			intArray.add(rand.nextInt(1000));
		}
		
		// Print array
		System.out.println("Random integers:");
		for (int i = 0; i < intArray.size(); i++) {
			System.out.println(intArray.get(i) + " ");
		}
		
		// Sort and reprint array
		Collections.sort(intArray);
		System.out.println();
		System.out.println("Sorted:");
		for (int i = 0; i < intArray.size(); i++) {
			System.out.println(intArray.get(i) + " ");
		}
	}
}
