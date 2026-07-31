class Solution {

    public int [][] rotate(int[][] mat){
          int n=mat.length;
         for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }

        for(int i=0;i<n;i++){
            int st=0,end=n-1;
            while(st<=end){
                int x=mat[i][st];
                mat[i][st]=mat[i][end];
                mat[i][end]=x;
                st++;
                end--;
            }
        }
        return mat;

    }


    public boolean isEqual(int[][] mat, int[][] target){
        int n=mat.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean findRotation(int[][] mat, int[][] target) {
        int n=mat.length;
       
       
        for(int k=0;k<4;k++){
            if(isEqual(mat,target)){
                return true;
            }
            rotate(mat);
        }
       
        return  false;
        
    }
}