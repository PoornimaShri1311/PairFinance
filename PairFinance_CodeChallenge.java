package org.example;

import java.util.*;

public class PairFinance_CodeChallenge {
    public static List<String> findMajorityElements(String[] sarr_elements) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;

        // Count the frequency of each element
        for (String str_element : sarr_elements) {
            int i_frequency = frequencyMap.getOrDefault(str_element, 0) + 1;
            frequencyMap.put(str_element, i_frequency);
            maxFrequency = Math.max(maxFrequency, i_frequency);
        }

        // Find elements with the highest frequency
        List<String> ls_majorityElements = new LinkedList<>();
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                ls_majorityElements.add(entry.getKey());
            }
        }

        return ls_majorityElements;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the elements separated by commas: ");
        String str_input = scanner.nextLine();

        // Split input based on commas
        String[] arr_elements = str_input.split(",");

        // Finding and displaying the majority elements
        List<String> ls_majorityElements = findMajorityElements(arr_elements);

        if (ls_majorityElements.size() == 1) {
            System.out.println("The majority element is: " + ls_majorityElements.get(0));
        } else {
            System.out.println("There are multiple majority elements: " + ls_majorityElements);
        }
        scanner.close();
    }}

/*Sample inputs
1,2,2,3,2
hi,hello,hi,hi
a,b,c,c,d,d,a
1.1,2.1,1.1,2.1,2.1,1.1,3.1*/
