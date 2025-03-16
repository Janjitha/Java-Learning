class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String k = s+s;
        if(k.contains(goal)){
            return true;
        }
        return false;
    }
}
