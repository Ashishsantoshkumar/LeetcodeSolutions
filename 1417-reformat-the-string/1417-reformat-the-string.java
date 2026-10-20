class Solution {
    public String reformat(String s) {
        List<Character> alpha = new ArrayList<>();
        List<Character> dig = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                alpha.add(ch);
            } else {
                dig.add(ch);
            }
        }
        if (Math.abs(alpha.size() - dig.size()) > 1) {
            return "";
        }
        int j = 0, k = 0;
        StringBuilder sb = new StringBuilder();
        if (alpha.size() > dig.size()) {
            for (int i = 0; i < alpha.size(); i++) {
                sb.append(alpha.get(k++));
                if (j < dig.size()) {
                    sb.append(dig.get(j++));
                }

            }
        } else {
            for (int i = 0; i < dig.size(); i++) {
                sb.append(dig.get(j++));
                if (k < alpha.size()) {
                    sb.append(alpha.get(k++));
                }
            }
        }
        return sb.toString();

    }
}