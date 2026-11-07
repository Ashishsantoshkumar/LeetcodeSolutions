class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder();
        for (char ch : num.toCharArray()) {
            int n = ch - '0';
            while (sb.length() > 0 && k > 0 && sb.charAt(sb.length() - 1) > ch) {

                sb.deleteCharAt(sb.length() - 1);
                k--;

            }

            sb.append(ch);

        }
        if(k>0) sb.delete(sb.length()-k,sb.length());
        String s = sb.toString();
        if (s.length() > 0)
            s = s.replaceAll("^0+", "");

        return s.isEmpty()?"0":s;

    }
}