class Solution {
    public int singleNonDuplicate(int[] nums) 
    {
        int n=nums.length;
        if(nums.length==1)
        return nums[0];
        int low=0;
        int high = nums.length;
        while (low < high)
        {
            int mid = low + (high-low)/2;
            if(mid%2==1)
            mid--;
            if(mid+1<n && nums[mid]==nums[mid+1])
            low=mid+2;
            else
            high=mid;
        }    
        return nums[low];
    }
}