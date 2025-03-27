class Solution {
    public void reverseString(char[] s) {
        //using 2 pointer method
        int l=0;
        int r=s.length-1;
        while(l<r){ //check until both pointers meet at the same place
            char temp = s[l]; //swap the values
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}

/*
class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
       // int j;
        for(int i=0,j=n-1;i<j;i++,j--)
        {
          char temp=s[i];
           s[i]=s[j];
           s[j]=temp;
        }
        
    }
}
*/
