class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> row = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            int minNo = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                minNo = Math.min(minNo, matrix[i][j]);
            }
            row.add(minNo);
        }

        List<Integer> col = new ArrayList<>();
        for (int j = 0; j < n; j++) {

            int maxNo = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                maxNo = Math.max(maxNo, matrix[i][j]);
            }
            col.add(maxNo);
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == row.get(i) && matrix[i][j] == col.get(j)) {
                    ans.add(matrix[i][j]);
                }
            }

        }
        return ans;

    }
}