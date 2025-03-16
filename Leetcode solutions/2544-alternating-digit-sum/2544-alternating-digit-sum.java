class Solution {
    public int alternateDigitSum(int n) {
        int len=String.valueOf(n).length();
        int arr[] = new int[len];
        int j = len-1;
		while(n>0){
			int rem = n%10;
			arr[j--] = rem;
			n = n/10;
		}
        int even = 0;
        int odd = 0;
        int c = 0;
		for (int i = 0; i < len; i++) {
			if(c%2!=0){
				odd += arr[i];
			}else{
				even+=arr[i];
			}
            c++;
		}
        return even - odd;
        }
}

/*
class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        String s = Integer.toString(n);
        char a[]=s.toCharArray();
        for(int i =0;i<a.length;i++)
        {
            if(i%2==0)
            sum+=Character.getNumericValue(a[i]);
            else
            sum-=Character.getNumericValue(a[i]);
        }
        return sum;
    }
}
*/
