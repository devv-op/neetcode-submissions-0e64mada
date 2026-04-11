class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int index=0;
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=i; j<n; j++){
                if(nums[i] == nums[j]){
                    count++;
                    index=nums[i];
                }
            }
            if(count > (n/2)){
                return index;
            }
        }
                return -1;
                
    }
}