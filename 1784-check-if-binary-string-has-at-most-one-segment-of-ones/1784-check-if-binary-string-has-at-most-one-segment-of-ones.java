class Solution {
    public boolean checkOnesSegment(String s) {
       boolean found=false;

        for (char ch : s.toCharArray()) {
            if(ch=='0') found=true;
            else if(found && ch=='1') return false;
        }
        return true;

    }
}