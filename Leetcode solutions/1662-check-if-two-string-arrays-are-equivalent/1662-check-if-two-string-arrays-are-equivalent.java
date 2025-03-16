class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for(String s : word1 ){
            a.append(s);
        }
        for(String t : word2 ){
            b.append(t);
        }return a.toString().equals(b.toString());
    }
}

/*
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a = "";
        String b = "";
        for(int i=0;i<word1.length;i++){
            a+=word1[i];
        }
        for(int i=0;i<word2.length;i++){
            b+=word2[i];
        }System.out.print(a+" "+b);
        
        return b.equals(a);
    }
}
*/
