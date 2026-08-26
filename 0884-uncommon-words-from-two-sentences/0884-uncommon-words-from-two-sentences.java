class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> ans=new HashMap<>();
        
        String [] parts=s1.split(" ");
        String [] m=s2.split(" ");
        for(String s:parts){
            ans.put(s,ans.getOrDefault(s,0)+1);
        }
        for(String st:m){
           ans.put(st,ans.getOrDefault(st,0)+1);
        }
        List<String> li=new ArrayList<>();
        
        for(Map.Entry<String,Integer>e:ans.entrySet()){
            if(e.getValue()==1){
                li.add(e.getKey());
            }
        }
        String [] result=new String[li.size()];
        for(int i=0;i<li.size();i++){
            result[i]=li.get(i);
        }
        return result;

    }
}