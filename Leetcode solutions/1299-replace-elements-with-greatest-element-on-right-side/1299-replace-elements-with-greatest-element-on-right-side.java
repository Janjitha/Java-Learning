class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(max, temp);
        }
        return arr;
    }
}

/*
class Solution {
    public int[] replaceElements(int[] arr) {
        int greatest = -1;
        int counter = arr.length - 1;
        while(counter>=0){
            int temp = arr[counter];
            arr[counter] = greatest;
            greatest = Math.max(greatest,temp);
            counter--;
        }
        return arr;      
    }
}
*/
