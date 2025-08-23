class Solution {
    public boolean check(int[] nums) {
        int count=0;
        int k=nums.length;
        for (int i=0;i<k;i++){
            if(nums[i]>nums[(i+1)%k]){
                count++;
            }
        }
        if (count>1){
            return false;

        }
        else{
            return true;
        }
        
    }
}