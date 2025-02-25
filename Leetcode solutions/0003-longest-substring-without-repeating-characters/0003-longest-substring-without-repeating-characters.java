class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean[] a = new boolean[128];
        int start = 0, max = 0;
        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            while (a[ch]) {
                a[s.charAt(start)] = false;
                start++;
            }
            a[ch] = true;
            max = Math.max(max, end - start + 1);
        }
        return max;
    }
}

====================================================================================================

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int ans=0;
        int count[]=new int[128];
        int l=0;
        int r=0;
        for(l=0,r=0;r<n;r++)
        {
            count[s.charAt(r)]++;
            while(count[s.charAt(r)]>1)
            {
                count[s.charAt(l++)]--;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;      
    }
}
