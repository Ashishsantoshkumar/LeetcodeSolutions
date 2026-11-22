class Solution {
    public String frequencySort(String s) {

        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        List<Map.Entry<Character,Integer>>ans=new ArrayList<>(map.entrySet());

        Collections.sort(ans,(a,b)->b.getValue()-a.getValue());

        StringBuilder sb=new StringBuilder();

        for(Map.Entry<Character,Integer>e:ans){
            int freq=e.getValue();
            while(freq>0){
                sb.append(e.getKey());
                freq--;
            }

        }

       return  sb.toString();


        
    }
}