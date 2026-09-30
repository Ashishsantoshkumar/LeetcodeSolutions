class Solution {
    public String reformatDate(String date) {
        String[] s = date.split(" ");
        Map<String, String> map = getMonth();
        StringBuilder sb = new StringBuilder();
        sb.append(s[2]).append("-");
        sb.append(map.get(s[1])).append("-");

        String day = s[0].substring(0, s[0].length() - 2);

        if (day.length() == 1) {
            day = "0" + day;
        }

        sb.append(day);
        return sb.toString();

    }

    public Map<String, String> getMonth() {
        Map<String, String> ans = new HashMap<>();
        ans.put("Jan", "01");
        ans.put("Feb", "02");
        ans.put("Mar", "03");
        ans.put("Apr", "04");
        ans.put("May", "05");
        ans.put("Jun", "06");

        ans.put("Jul", "07");
        ans.put("Aug", "08");
        ans.put("Sep", "09");
        ans.put("Oct", "10");
        ans.put("Nov", "11");
        ans.put("Dec", "12");
        return ans;
    }
}