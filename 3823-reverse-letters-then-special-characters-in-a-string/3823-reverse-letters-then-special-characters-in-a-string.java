class Solution {
    public String reverseByType(String s) {
        List<String>letter=new ArrayList<>();
        List<String>special=new ArrayList<>();
        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch)){
                letter.add(String.valueOf(ch));
            }
            else{
                special.add(String.valueOf(ch));
            }
        }
        Collections.reverse(letter);
        Collections.reverse(special);
        StringBuilder sb=new StringBuilder();
        int j=0,k=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                sb.append(letter.get(j));
                j++;
            }
            else{
                sb.append(special.get(k));
                k++;
            }
        }
        
        return sb.toString();
    }
}