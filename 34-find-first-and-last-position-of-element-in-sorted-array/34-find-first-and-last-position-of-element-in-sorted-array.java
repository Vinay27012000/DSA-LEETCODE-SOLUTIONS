class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ind = bst(nums, target, 0 , nums.length - 1);
        int min = ind;
        int max = ind;
        for(int i = ind - 1 ; i >= 0 ; i --){
            if(nums[i] != target){
                break;
            }
            min--;
        }
        for(int i = ind + 1 ; i < nums.length ; i ++){
            if(nums[i] != target){
                break;
            }
            max++;
        }
        int[] ans = {min, max};
        return ans;
    }
    public  int bst(int[] nums , int tar , int low , int high){
        if(low > high)
            return -1;
        else {
            int mid = (low+high) / 2;
            
            if(tar == nums[mid]){
                return mid;
            }
            else if(tar > nums[mid]){
                return bst(nums , tar, mid+1 , high);
            }
            else
                return bst(nums, tar , low, mid-1);
        }
    }
}