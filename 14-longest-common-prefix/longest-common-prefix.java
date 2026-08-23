class Solution {
    public String longestCommonPrefix(String[] str) {
        int minlength=str[0].length();
        StringBuilder prefix= new StringBuilder();
        for(int i=0;i<str.length;i++){
            if(str[i].length()<minlength){
                minlength=str[i].length();
            }
        }
        for(int j=0;j<minlength;j++){
            for(int k=1;k<str.length;k++){
                if(str[k].charAt(j) != str[0].charAt(j)){
                    return prefix.toString();
                }
            }
            prefix.append(str[0].charAt(j));
        }
        return prefix.toString();
    }
}