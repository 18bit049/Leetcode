class Solution {
    public int minOperations(int[] nums, int x) {
        int target=-x;
        for(int i=0;i<nums.length;i++)
        {
            target +=nums[i];
        }
        int res=-1;
        int left=0;
        int sum=0;
        if(target<0)
        {
            return -1;
        }
        for(int right=0;right<nums.length;right++)
        {
            sum +=nums[right];
            while(sum>target)
            {
                sum -=nums[left];
                left++;
            }
            if(sum==target)
            {
                res=Math.max(res,right-left+1);
                System.out.println(res);
            }
        }
        if(res<0)
            return -1;
        return nums.length-res;
    }
}