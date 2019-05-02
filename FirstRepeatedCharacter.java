public class FirstRepeatedCharacter {

    /**
    * Method to find the first repeated character in a string
    *
    * @param str is the string input
    * @return the first repeated character
    */
    public static char findFirstRepeatedChar(String str) {

        HashMap<Character, Integer> h = new HashMap<Character, Integer>(); // Create hash map
        str = str.replaceAll(" ", ""); // Remove spaces
        char charArray = str.toCharArray(); // Convert string to a char array
  
        // Traverse charArray 
        for (int i = 0; i <= charArray.length - 1; i++) { 
            char c = str[i]; 

            // Add char to hashmap and update the amount of occurrences if already an instance
            if (h.contains(c))
                h.put(c, h.get(c) + 1); 
            else
                h.put(c, 1); 
        } 

        // Check if any character has a >1 count in the hashmap and return the first instance
        for (int i = 0; i <= charArray.length - 1; i++) {
            char c = str[i]; 

            if(h.get(c) > 1)
                return c;
        }

        return null; // Return null if no repeated characters found
    }

} 