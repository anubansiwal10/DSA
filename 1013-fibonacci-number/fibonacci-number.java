class Solution {
    public int fib(int n) {
        int previous=0;
        int current=1;
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum=previous+current;
            previous=current;
            current=sum;
        }
        if(n==1){
            return 1;
        }
        return sum;
    }
}