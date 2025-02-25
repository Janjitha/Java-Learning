class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = Arrays.copyOf(nums1, nums1.length + nums2.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
        Arrays.sort(merged);
        int mid = merged.length / 2;
        return merged.length % 2 == 0 ? (merged[mid - 1] + merged[mid]) / 2.0 : merged[mid];
    }
}

========================================================================================================

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int i=0,j=0,k=0;
        int res[]=new int[n+m];
        while(i<n&&j<m){
            if(nums1[i]<nums2[j]){
                res[k++]=nums1[i++];
            }else{
                res[k++]=nums2[j++];
            }   
        }while(i<n){
            res[k++]=nums1[i++];
        }while(j<m){
            res[k++]=nums2[j++];
        }
        int len=res.length;
        if(len%2==0){
             int mid1=res[(len/2)];
             int mid2=res[(len/2)-1];
             return (mid1+mid2)/2.0;
        } 
        else{
            int mid=res[(len/2)];
            return (double)mid;
        }    
    }
}
