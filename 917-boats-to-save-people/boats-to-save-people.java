class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left=0;
        int right=people.length-1;
        int sum=0;
        int boats=0;
        while(left<=right){
            sum=people[left]+people[right];
            if(sum>limit){
                boats++;
                right--;
            }
            else{
                boats++;
                left++;
                right--;
            }
        }
        return boats;
    }
}