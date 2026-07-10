class Solution {
    public String[] findOcurrences(String text, String first, String second) {

        String [] arr=text.split(" ");
        List<String> ans=new ArrayList<>();
        for(int i=0;i<arr.length-2;i++){
            if(arr[i].equals(first) && arr[i+1].equals(second)){

            ans.add(arr[i+2]);
            }
        }
        String []x=new String[ans.size()];
        for(int i=0;i<ans.size();i++){
            x[i]=ans.get(i);
        }
        return x;
        
    }
}