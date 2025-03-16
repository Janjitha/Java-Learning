class Solution {
    public int myAtoi(String s) {
        int sign = 1;
       long ans = 0;
       int ind = 0;
       //Move when there is spaces
       while(ind<s.length() && s.charAt(ind)==' '){
        ind++;
       }
       //For finding sign of the integer value
       if(ind<s.length() && (s.charAt(ind)=='-' || s.charAt(ind)=='+')){
        sign=(s.charAt(ind)=='+')?1:-1;
        ind++;
       }
       while(ind<s.length() && Character.isDigit(s.charAt(ind))){
        ans = ans*10 + (int)(s.charAt(ind)-'0');
        //For long values that it should be in the limit
        if(sign==1 && ans>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else if(sign==-1 && ((-1*ans)<Integer.MIN_VALUE)){
            return Integer.MIN_VALUE;
        }
        ind++;
       }
       return (int)ans*sign;
    }
}
