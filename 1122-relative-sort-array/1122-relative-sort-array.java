class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        Map<Integer,Integer>ans=new TreeMap<>();
        for(int n:arr1){
            ans.put(n,ans.getOrDefault(n,0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>();


        for(int m:arr2){
            int freq=ans.get(m);
            while(freq>0){
                list.add(m);
                freq--;
            }
            ans.remove(m);
            
        }
        for(Map.Entry<Integer,Integer> e:ans.entrySet()){
            int key=e.getKey();
            int val=e.getValue();
            for(int i=0;i<val;i++){
                list.add(key);
            }
        }

        int [] num=new int[list.size()];
        for(int i=0;i<list.size();i++){
            num[i]=list.get(i);
        }
        return num;
    }
}