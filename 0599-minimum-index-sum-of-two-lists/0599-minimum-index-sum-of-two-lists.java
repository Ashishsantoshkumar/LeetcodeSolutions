class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        HashMap<String, Integer> ans = new HashMap<>();

        for (int i = 0; i < list2.length; i++) {
            ans.put(list2[i], i);
        }

        Set<String> result = new HashSet<>();

        int minNo = Integer.MAX_VALUE;

        for (int j = 0; j < list1.length; j++) {

            if (ans.containsKey(list1[j])) {

                int sum = j + ans.get(list1[j]);
                if (sum < minNo) {
                    minNo = sum;
                    result.clear();
                    result.add(list1[j]);
                }
                if (sum == minNo) {
                    result.add(list1[j]);
                }
            }
        }
        int m = result.size();
        String[] s = new String[m];
        int i=0;
        for (String str:result) {
            s[i++] = str;
        }
        return s;

    }
}