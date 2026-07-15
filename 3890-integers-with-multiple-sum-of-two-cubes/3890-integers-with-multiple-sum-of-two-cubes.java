class Solution {
    public List<Integer> findGoodIntegers(int n) {
        Map<Integer,Integer>ans=new HashMap<>();
        int z=(int)Math.cbrt(n);
        for(int i=1;i<=z;i++){
            int y=i*i*i;
            for(int j=i;j<=z;j++){
                int sum=y+j*j*j;
                if(sum>n) break;
                ans.put(sum,ans.getOrDefault(sum,0)+1);
            }
        }
        List<Integer> num=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:ans.entrySet()){
            if(e.getValue()>1){
                num.add(e.getKey());
            }
        }
        Collections.sort(num);
        return num;
        
    }
}