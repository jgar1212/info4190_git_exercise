package info4190_git_exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class arraySort {
	public static void main(String[] args) {
		// Instantiate ArrayLists, new instance of Random class, Scanner
		ArrayList<Integer> intArray = new ArrayList<>();
		ArrayList<String> stringArray = new ArrayList<>();
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		// Fill int array with 10 random integers between 0 and 999
		for (int i = 0; i < 10; i++) {
			intArray.add(rand.nextInt(1000));
		}

		// Fill string array with 10 random strings
		StringBuilder sb = new StringBuilder(10);
		for (int i = 0; i < 10; i++) {
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

		// Allow for user selection of int sort order
		System.out.println();
		System.out.println("Type 1 to sort integers in ascending order");
		System.out.println("Type 2 to sort integers in descending order");
		Integer intSel = sc.nextInt();

		while (intSel != 1 && intSel != 2) {
			System.out.println();
			System.out.println("Invalid selection.");
			System.out.println("Type 1 to sort integers in ascending order");
			System.out.println("Type 2 to sort integers in descending order");
			intSel = sc.nextInt();
		}

		// print string array
		System.out.println();
		System.out.println("Random strings:");
		for (int i = 0; i < stringArray.size(); i++) {
			System.out.println(stringArray.get(i) + " ");
		}

		// Allow for user selection of string sort order
		System.out.println();
		System.out.println("Type 1 to sort strings in alphabetical order");
		System.out.println("Type 2 to sort strings in reverse alphabetical order");
		Integer strSel = sc.nextInt();

		while (strSel != 1 && strSel != 2) {
			System.out.println();
			System.out.println("Invalid selection.");
			System.out.println("Type 1 to sort strings in alphabetical order");
			System.out.println("Type 2 to sort strings in reverse alphabetical order");
			strSel = sc.nextInt();
		}

		// Sort arrays
		Collections.sort(intArray);
		Collections.sort(stringArray);
		
		if (intSel == 2) {
			Collections.reverse(intArray);
		}
		if (strSel == 2) {
			Collections.reverse(stringArray);
		}
		
		// Print integer array
		System.out.println();
		System.out.println("Integers sorted:");
		for (int i = 0; i < intArray.size(); i++) {
			System.out.println(intArray.get(i) + " ");
		}

		// Reprint string array
		System.out.println();
		System.out.println("Strings sorted:");
		for (int i = 0; i < stringArray.size(); i++) {
			System.out.println(stringArray.get(i) + " ");
		}

	}
}
