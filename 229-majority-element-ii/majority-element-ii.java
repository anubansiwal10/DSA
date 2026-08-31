class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer> result= new ArrayList<>();
        for (int num : map.keySet()) {
            if (map.get(num) > n / 3) {
            result.add(num);
            
        }
    }
    return result;

    }
}
