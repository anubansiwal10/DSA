class Solution {
    public int calPoints(String[] s) {
        Stack<Integer> stack=new Stack<>();
        int sum=0;
        for(int i=0;i<s.length;i++){
            
            if (s[i].equals("C")) {
                stack.pop();
            }
            else if (s[i].equals("D")) {
                stack.push(stack.peek()*2);
            }
            else if (s[i].equals("+")) {
                int temp=stack.pop();
                int previous=stack.peek();
                stack.push(temp);
                stack.push(temp+previous);
            }
            else {
            stack.push(Integer.parseInt(s[i]));
            }
            
        }
        while(!stack.isEmpty()){
                sum+=stack.pop();
            }
        return sum;
    }
}