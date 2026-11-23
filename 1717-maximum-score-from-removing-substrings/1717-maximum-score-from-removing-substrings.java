class Solution {
    public int maximumGain(String s, int x, int y) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;

        if (y > x) {
            for (char ch : s.toCharArray()) {
                if (sb.length() > 0 && sb.charAt(sb.length() - 1) == 'b' && ch == 'a') {
                    sum += y;
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    sb.append(ch);
                }
            }

            StringBuilder temp = new StringBuilder();

            for (char ch : sb.toString().toCharArray()) {
                if (temp.length() > 0 && temp.charAt(temp.length() - 1) == 'a' && ch == 'b') {
                    sum += x;
                    temp.deleteCharAt(temp.length() - 1);
                } else {
                    temp.append(ch);
                }
            }

        } else {
            for (char ch : s.toCharArray()) {
                if (sb.length() > 0 && sb.charAt(sb.length() - 1) == 'a' && ch == 'b') {
                    sum += x;
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    sb.append(ch);
                }
            }


            StringBuilder temp = new StringBuilder();

            for (char ch : sb.toString().toCharArray()) {
                if (temp.length() > 0 && temp.charAt(temp.length() - 1) == 'b' && ch == 'a') {
                    sum += y;
                    temp.deleteCharAt(temp.length() - 1);
                } else {
                    temp.append(ch);
                }
            }
        }

        return sum;
    }
}