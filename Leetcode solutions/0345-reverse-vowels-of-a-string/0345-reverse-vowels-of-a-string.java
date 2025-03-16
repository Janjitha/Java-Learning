class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int i = 0, j = arr.length - 1;

        while (i < j) {
            // Move i forward until a vowel is found
            while (i < j && vowels.indexOf(arr[i]) == -1) {
                i++;
            }
            // Move j backward until a vowel is found
            while (i < j && vowels.indexOf(arr[j]) == -1) {
                j--;
            }
            // Swap the vowels
            if (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}

/*
class Solution {
//not efficient code
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        String k = "";
        String v = "";
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                v = s.charAt(i) + v; 
            }
        }
        int index = 0; 
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                k += v.charAt(index); 
                index++;
            } else {
                k += s.charAt(i); 
            }
        }
        return k;
    }
}
 */
