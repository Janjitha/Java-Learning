class Solution {
    public String truncateSentence(String s, int k) {
        int count = 0, i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == ' ') {
                count++;
                if (count == k){
                    break;
                }
            }
            i++;
        } 
        return s.substring(0, i);
        //return String.join(" ", Arrays.copyOfRange(a, 0, k));
    }
}

/*
class Solution {
    public String truncateSentence(String s, int k) {
        String a[]=s.split(" ");
        String result = a[0];  
        for (int i = 1; i < k; i++) {
            result += " " + a[i];  
        }
        return result;
        //return String.join(" ", Arrays.copyOfRange(a, 0, k));
    }
}
*/

/*
class Solution {
    public String truncateSentence(String s, int k) {
        String a[]=s.split(" ");
        return String.join(" ", Arrays.copyOfRange(a, 0, k));
    }
}
*/
