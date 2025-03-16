class Solution {
    public int addDigits(int num) {
        if(num>9){
            num=num%9;
            if(num==0){
                return 9;
            }
        }return num;
    }
}

/*
class Solution {
    public int addDigits(int num) {
        return 1 + (num - 1) % 9;  
    }
}
*/
