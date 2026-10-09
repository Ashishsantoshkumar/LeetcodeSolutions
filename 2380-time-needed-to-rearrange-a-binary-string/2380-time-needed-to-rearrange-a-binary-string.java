class Solution {
    public int secondsToRemoveOccurrences(String s) {
        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        while (true) {
            boolean change = false;
            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.charAt(i) == '0' && sb.charAt(i + 1) == '1') {
                    sb.setCharAt(i, '1');
                    sb.setCharAt(i + 1, '0');
                    i++;
                    change = true;
                }

            }
            if (!change)
                break;

            count++;
        }
        return count;
    }
}