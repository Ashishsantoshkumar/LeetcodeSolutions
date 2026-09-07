class Solution {
    boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 2; i <=n/2; i++) {
            
            if (isPrime(i) && isPrime(n - i)) {
                List<Integer> num = new ArrayList<>();
                num.add(i);
                num.add(n - i);
                ans.add(num);
            }
            
        }
        Collections.sort(ans, (a, b) -> Integer.compare(a.get(0), b.get(0)));
        return ans;

    }
}