class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph=paragraph.replaceAll("[^a-zA-Z ]"," ");
        paragraph=paragraph.toLowerCase();
        String[]s=paragraph.split("\\s+");
        Map<String,Integer>ans=new HashMap<>();
        for(String st:s){
            ans.put(st,ans.getOrDefault(st,0)+1);
        }

        List<Map.Entry<String,Integer>>list=new ArrayList<>(ans.entrySet());
        Collections.sort(list,(a,b)->b.getValue()-a.getValue());

        for(Map.Entry<String,Integer>e:list){
            boolean flag=true;
            for(String x:banned){
                if(e.getKey().equals(x)){
                    flag=false;
                    break;
                }
            }
            if(flag) return e.getKey();
        }
        return "";
    }
}