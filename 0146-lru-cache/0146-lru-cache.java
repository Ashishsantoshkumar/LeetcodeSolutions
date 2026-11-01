class LRUCache {
    private int capacity;
    private LinkedHashMap<Integer,Integer>ans;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        ans=new LinkedHashMap<>(capacity,0.75f,true);
        
    }
    
    public int get(int key) {
        if(!ans.containsKey(key)){
            return -1;

        }
        return ans.get(key);
        
    }
    
    public void put(int key, int value) {
        ans.put(key,value);
        if(ans.size()>capacity){
            int oldKey=0;
            for(int x:ans.keySet()){
                oldKey=x;
                break;
            }
            ans.remove(oldKey);
        }
       

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */