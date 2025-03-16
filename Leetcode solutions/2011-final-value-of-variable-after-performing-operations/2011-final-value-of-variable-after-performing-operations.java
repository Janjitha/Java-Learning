class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res =0;
        for(String i:operations){
            if(i.charAt(1)=='+'){
                res++;
            }
            else{
                res--;
            }
        }return res;
    }
}

/*
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int sum=0;
        for(int i=0;i<operations.length;i++){
             if(operations[i].equals("--X") || operations[i].equals("X--")) {
            sum-=1;
            }
            else{
                sum+=1;
            } 
        }
        return sum;    
    }
}
*/
