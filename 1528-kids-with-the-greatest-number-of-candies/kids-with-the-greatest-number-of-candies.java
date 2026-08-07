class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        int currentCandies=0;
        List<Boolean> ans = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            currentCandies=candies[i];
            if(currentCandies>max){
            max=currentCandies;}
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}