class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> ans = new HashSet<>();
        for (List<String> x : paths) {
            ans.add(x.get(0));
        }

        for (List<String> y : paths) {
            if (!ans.contains(y.get(1))) {
                return y.get(1);
            }
        }
        return "-1";
    }
}