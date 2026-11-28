class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (sb.length() > 0) {

                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {

                sb.append(ch);
            }
        }
        for (char ch : t.toCharArray()) {
            if (ch == '#') {
                if (temp.length() > 0) {

                    temp.deleteCharAt(temp.length() - 1);
                }
            } else {

                temp.append(ch);
            }
        }

        String s1 = sb.toString();
        String s2 = temp.toString();
        if (s1.length() == 0 && s2.length() == 0)
            return true;
        return s1.equals(s2);

    }
}