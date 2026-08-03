class Solution {
    public int maxDepth(String s) {
        int dept=0;
        int maxNo=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                dept++;
                maxNo=Math.max(maxNo,dept);
            }
            else if(ch==')'){
                dept--;
            }
        }
        return maxNo;
        
    }
}