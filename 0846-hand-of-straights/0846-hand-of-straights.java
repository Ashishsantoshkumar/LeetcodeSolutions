class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {

        if (hand.length % groupSize != 0) {
            return false;
        }

        TreeMap<Integer, Integer> ans = new TreeMap<>();
        for (int n : hand) {
            ans.put(n, ans.getOrDefault(n, 0) + 1);
        }

        while (!ans.isEmpty()) {

            int curr = ans.firstKey();
            for (int i = 0; i < groupSize; i++) {
                int sum = curr + i;
                if (!ans.containsKey(sum))
                    return false;
                ans.put(sum, ans.get(sum) - 1);
                if (ans.get(sum) == 0) {
                    ans.remove(sum);
                }
            }

        }
        return true;
    }
}