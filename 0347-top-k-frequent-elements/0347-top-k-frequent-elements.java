class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> ans = new HashMap<>();
        for (int n : nums) {
            ans.put(n, ans.getOrDefault(n, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> num = new ArrayList<>(ans.entrySet());

        Collections.sort(num,(a,b)->b.getValue()-a.getValue());
    
        int[] found = new int[k];
        for (int i = 0; i < k; i++) {
            found[i] = num.get(i).getKey();
        }
        return found;
    }
}