class Solution {
    public String digitSum(String s, int k) {



        while(s.length()>k){

        StringBuilder sb=new StringBuilder();
        int count=0;
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=s.charAt(i)-'0';
            count++;
            if(count==k){
                sb.append(sum);
                count=0;
                sum=0;
            }
            
            
        }
        if(count>0){
            sb.append(sum);
        }
        s=sb.toString();
        }

        return s;
        
        
    }
}