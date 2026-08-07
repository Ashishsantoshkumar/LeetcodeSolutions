class FindSumPairs {
   int []ans;
   int []num;
   Map<Integer,Integer>map;

    public FindSumPairs(int[] nums1, int[] nums2) {

        ans=nums1.clone();
        num=nums2.clone();
        map=new HashMap<>();
        for(int x:num){
            map.put(x,map.getOrDefault(x,0)+1);
        }
    }

    
    public void add(int index, int val) {

        map.put(num[index],map.get(num[index])-1);
        if(map.get(num[index])==0){
            map.remove(num[index]);
        }
        num[index]+=val;

        map.put(num[index],map.getOrDefault(num[index],0)+1);

        
    }
    
    public int count(int tot) {
        int count=0;
        for(int x:ans){
            count+=map.getOrDefault(tot-x,0);          
        }
        return count;
        
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */