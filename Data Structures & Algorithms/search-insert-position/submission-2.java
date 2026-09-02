class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int i=0;
        for(; i<n; i++){
            if(nums[i]== target){
                return i;
            }
            if(nums[i]>target){
                break;
            }
        }
        return i;
    }
}