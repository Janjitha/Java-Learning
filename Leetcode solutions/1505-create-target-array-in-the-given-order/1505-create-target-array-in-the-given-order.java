class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> t = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            t.add(index[i],nums[i]);
        }
        int a[] = new int[t.size()];
        for(int i=0;i<a.length;i++){
            a[i]=t.get(i);
        }
        return a;
    }
}