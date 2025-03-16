class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            int num = c - 'a' + 1;
            sum+=num / 10 ;
            sum+=num % 10;
        }
        while (--k > 0 && sum > 9) {
            int temp = 0;
            while (sum > 0) {
                temp += sum % 10;
                sum /= 10;
            }
            sum = temp;
        }
        return sum;
    }
}

/*
class Solution {
    public int getLucky(String s, int k) {   
        int[] letterSum = new int[26];
        for (int i = 0; i < 26; i++) {
            int num = i + 1;
            while (num > 0) {
                letterSum[i] += num % 10;
                num /= 10;
            }
        }
        int totalSum = 0;
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            totalSum += letterSum[idx];
        }
        for (int i = 1; i < k; i++) {
            int tempSum = totalSum;
            totalSum = 0;
            while (tempSum > 0) {
                totalSum += tempSum % 10;
                tempSum /= 10;
            }
        }
        return totalSum;
    }
}
*/

/*
class Solution {
    public int transform(int num, int k){
        if(k==0) return num;
        int sum = 0;
        while(num!=0){
            sum += num%10;
            num = num/10;
        }
        return transform(sum,k-1);
    }
    public int getLucky(String s, int k) {
        int sum = 0;
        int temp;
        for(int i = 0;i<s.length();i++){
            temp =(int) s.charAt(i)  - 96;
            sum  = sum + temp%10 + temp/10;
        } 
        return k == 1 ? sum : transform(sum,k-1);      
    }
}
*/
