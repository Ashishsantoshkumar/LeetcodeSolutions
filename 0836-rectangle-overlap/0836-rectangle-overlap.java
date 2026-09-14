class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1=rec1[0];
        int y1=rec1[1];
        int x2=rec1[2];
        int y2=rec1[3];


        int a1=rec2[0];
        int b1=rec2[1];
        int a2=rec2[2];
        int b2=rec2[3];


        if(b1>=y2) return false;
        if(y1>=b2) return false;
        if(a1>=x2) return false;
        if(x1>=a2) return false;
return true;




    }
}