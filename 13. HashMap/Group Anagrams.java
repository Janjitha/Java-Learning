import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"cat", "act", "dog", "god", "tac"};

        // Step 1: Create a HashMap to store sorted_word -> list of anagrams
        Map<String, List<String>> map = new HashMap<>();

        // Step 2: Loop through each word
        for (String word : words) {
            // Step 2.1: Sort the characters in the word
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars); // this is our key

            // Step 2.2: If the key not in map, create a new list
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            // Step 2.3: Add the word to the correct group
            map.get(sortedWord).add(word);
        }

         //     act=[cat, act, tac], 
         //     dgo=[dog, god]
         
        // Step 3: Print the grouped anagrams
        for (List<String> group : map.values()) {
            System.out.println(group);
        }
    }
}

OUTPUT :
[cat, act, tac]
[dog, god]
