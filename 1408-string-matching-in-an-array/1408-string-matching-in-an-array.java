class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> ans=new HashSet<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i!=j && words[i].contains(words[j])){
                    ans.add(words[j]);
                }
            }
        }
        return new ArrayList<>(ans);
    }
}