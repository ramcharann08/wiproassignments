package wipro;

import java.util.HashMap;
import java.util.Map;

public class Elementoccurences {
	public static void main(String[] args) {
        // Initialize the array with 10 elements
        int[] arr = {4, 2, 4, 5, 2, 3, 4, 5, 1, 2};

        // Create a HashMap to store element counts
        Map<Integer, Integer> occurrenceMap = new HashMap<>();

        // Count occurrences of each element
        for (int element : arr) {
            occurrenceMap.put(element, occurrenceMap.getOrDefault(element, 0) + 1);
        }

        // Display the occurrences
        System.out.println("Element occurrences in the array:");
        for (Map.Entry<Integer, Integer> entry : occurrenceMap.entrySet()) {
            System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times.");
        }
    }
}

