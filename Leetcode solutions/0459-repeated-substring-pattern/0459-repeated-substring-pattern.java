class Solution {
    public boolean repeatedSubstringPattern(String s) {
        // String d = s+s;
        // return d.substring(1,d.length()-1).contains(s);

        int n = s.length();
        for (int i = 1; i <= n/ 2; i++) {
            if (n % i == 0) {
                String p = s.substring(0, i);
                String r = "";
                for (int j = 0; j < n / i; j++) {
                    r += p;
                    if (r.equals(s)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
        // int n = s.length();
        // for (int i = 1; i <= n / 2; i++) {
        //     if (n % i == 0) {
        //         String a = s.substring(0, i);
        //         if (s.replaceAll(a, "").isEmpty()) return true;
        //     }
        // }
        // return false;

