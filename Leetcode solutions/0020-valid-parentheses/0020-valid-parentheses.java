class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if ((s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') && st.isEmpty()) 
            {
                return false;
            }
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else {
                if (s.charAt(i) == ')' && st.peek() == '(') {
                    st.pop();
                } else if (s.charAt(i) == ']' && st.peek() == '[') {
                    st.pop();
                } else if (s.charAt(i) == '}' && st.peek() == '{') {
                    st.pop();
                }

                else {
                    return false;
                }

            }
        }
        if (st.size() == 0) {
            return true;
        }
        return false;

    }
}