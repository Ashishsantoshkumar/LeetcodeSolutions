class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        
        Map<Integer,Integer>ans=new HashMap<>();
        for(int n:arr){
            ans.put(n,ans.getOrDefault(n,0)+1);
        }

        List<Integer> list=new ArrayList<>(ans.values());
        Collections.sort(list);
        int result=list.size();
        for(int freq:list){
            if(k>=freq){
                k-=freq;
                result--;
            }
            else{
                break;
            }
        }
        return result;


    }
}