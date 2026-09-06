class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            if(ch1=='#'){
                if(!stack1.isEmpty()){
                stack1.pop();}
            }else{
                stack1.push(ch1);
            }
        }
        for(int i=0;i<t.length();i++){
            char ch2=t.charAt(i);
            if(ch2=='#'){
                if(!stack2.isEmpty()){
                stack2.pop();}
            }else{
                stack2.push(ch2);
            }
        }
        StringBuilder result1=new StringBuilder();
        StringBuilder result2=new StringBuilder();
        while(!stack1.isEmpty()){
            result1.append(stack1.pop());
        }
        while(!stack2.isEmpty()){
            result2.append(stack2.pop());
        }
        if(result1.toString().equals(result2.toString())){
            return true;
        }
        else{return false;}
    }
}