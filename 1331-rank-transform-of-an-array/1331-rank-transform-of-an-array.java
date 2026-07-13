class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int [] ans=Arrays.copyOf(arr,arr.length);
        Arrays.sort(ans);
        HashMap<Integer,Integer> m=new HashMap<>();
        int rank=1;
        for(int n:ans){
            if(!m.containsKey(n)){
m.put(n,rank++);
            }
           

        }
        int[] found=new int [arr.length];

        for(int i=0;i<arr.length;i++){
            found[i]=m.get(arr[i]);
        }
        return found;

        
    }
}