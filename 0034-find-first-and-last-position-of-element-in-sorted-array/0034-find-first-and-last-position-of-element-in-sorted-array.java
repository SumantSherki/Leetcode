class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f1=-1;
        int l1=-1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
            f1=i;
            break;
            }

        }

        for(int j= nums.length-1 ;j>=0 ;j--) {
            if(nums[j] == target) {
                l1=j;
                break;
            }
        }

        int[] ans = new int[2];
        ans[0]=f1;
        ans[1]=l1;

        return ans; 
    }

}