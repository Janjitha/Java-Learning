class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String s : sentences){
            int count = s.split(" ").length;
            max = Math.max(count,max);
        }
        return max;   
    }
}

/*
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount = Integer.MIN_VALUE;
        for(String sentence : sentences){
            int count = 1;
            for(int i = 0; i < sentence.length(); i++) {
                if(sentence.charAt(i) == ' ') {
                    count++;
                }
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}
*/
