class Solution {
    public int romanToInt(String s) {
       int result=0;
       int prev=0;
       int curr=0;
       for(int i=s.length()-1;i>=0;i--){
        char val = s.charAt(i);
        if(val=='I'){
            curr = 1;
        }
        if(val=='V'){
            curr = 5;
        }
        if(val=='X'){
            curr = 10;
        }
        if(val=='L'){
            curr = 50;
        }
        if(val=='C'){
            curr = 100;
        }
        if(val=='D'){
            curr = 500;
        }
        if(val=='M'){
            curr = 1000;
        }
        if(curr<prev){
            result-=curr;
        }
        else{
            result+=curr;
        }
        prev=curr;

       } return result;
    }
}
