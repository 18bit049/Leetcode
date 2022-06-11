class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[]=new int[2];
      // nt res[]=new int[2];
        Map<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hmap.containsKey(target-nums[i]))
            {
               
                res[0]=(hmap.get(target-nums[i]))+1;
                 res[1]=i+1;
                return res;
            }
            hmap.put(nums[i],i);
        }
       return res; 
    }
}