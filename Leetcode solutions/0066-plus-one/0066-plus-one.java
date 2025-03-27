class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // If not 9, increment and return
                return digits;
            }
            digits[i] = 0; // If 9, set to 0 and continue loop
        }
        // If all digits were 9, we need extra digit
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1; // Example: [9,9,9] → [1,0,0,0]
        return newNumber;
    }
}

/*
class Solution {
    public int[] plusOne(int[] digits) {
           for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
*/
