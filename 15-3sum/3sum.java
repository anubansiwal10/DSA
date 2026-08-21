class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        int sum=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
                }
            int current=nums[i];
            int left=i+1;
            int right= nums.length-1;
            while(left<right){
                sum=current+nums[left]+nums[right];
                if(sum==0){
                    result.add(Arrays.asList(current,nums[left],nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                       left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                       right--;
                    }
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return result;
    }
}