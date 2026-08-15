class Solution {
    public String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if(ch >= 'A' && ch <= 'Z'){ 
        ch=Character.toLowerCase(ch);
        
        
            }
            result.append(ch);
        }

         return result.toString();

    }
}