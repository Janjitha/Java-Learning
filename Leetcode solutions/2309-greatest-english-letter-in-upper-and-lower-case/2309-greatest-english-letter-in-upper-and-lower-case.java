class Solution {
    public String greatestLetter(String s) {
        for(int i='z';i>='a';i--){
            String low = Character.toString(i);  //97 - in lowercase
            String up = Character.toString(i - 32);  //65 - in uppercase
            if (s.contains(low) && s.contains(up)) {
                return up;
            }
       } return "";
    }
}