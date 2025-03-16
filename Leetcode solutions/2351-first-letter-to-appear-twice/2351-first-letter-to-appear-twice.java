class Solution {
    public char repeatedCharacter(String s) {
        int c =0;
        char max=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<i;j++){
                if(s.charAt(i)==s.charAt(j)){
                    return s.charAt(i);
                }
            }
        }return 0;
    }
}
