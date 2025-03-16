class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] count = new int[26]; 
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++; 
            count[t.charAt(i) - 'a']--;  
        }for (int num : count) {
            if (num != 0) return false; 
        }return true;
    }
}

/*
METHOD 2 : 
class Solution {
    public boolean isAnagram(String s, String t) {
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}
*/

/*
METHOD 3 : 
class Solution {
    public boolean isAnagram(String s, String t) {
       // s=s.toLowerCase();
        //t=t.toLowerCase();
        if(s.length()!=t.length())
        return false;

        char s1[]=s.toCharArray();
        char t1[]=t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        s=new String(s1);
        t=new String(t1);

        if(s.equals(t)){
            return true;
        }
        return false;
    }
}
*/
