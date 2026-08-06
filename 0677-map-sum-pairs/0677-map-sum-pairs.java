class MapSum {
    Map<String,Integer> ans;

    public MapSum() {
    ans=new LinkedHashMap<>();    
    }
    
    public void insert(String key, int val) {
        ans.put(key,val);
    }
    
    public int sum(String prefix) {
        int sum=0;
        for(Map.Entry<String,Integer>e:ans.entrySet()){
            String st=e.getKey();
            if(st.startsWith(prefix)){
                sum+=e.getValue();
            }
        }
        return sum;
        
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */