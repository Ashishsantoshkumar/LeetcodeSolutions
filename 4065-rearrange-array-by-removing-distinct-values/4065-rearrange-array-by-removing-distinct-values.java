class Solution {
    public int[] rearrangeArray(int[] nums) {
        Map<Integer, Integer> ans = new TreeMap<>();
        List<Integer> list = new ArrayList<>();
        for (int n : nums) {
            ans.put(n, ans.getOrDefault(n, 0) + 1);
        }
        while (!ans.isEmpty()) {
            List<Integer> remove = new ArrayList<>();
            for (int x : ans.keySet()) {

                list.add(x);

                ans.put(x, ans.get(x) - 1);

                if (ans.get(x) == 0) {
                    remove.add(x);
                }
            }

            for (int x : remove) {
                ans.remove(x);
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;

    }
}