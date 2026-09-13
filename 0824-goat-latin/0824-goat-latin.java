class Solution {
    boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }

    public String toGoatLatin(String sentence) {
        String[] st = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        int count=1;
        for (String s : st) {
            String x = s.toLowerCase();
            char c = x.charAt(0);
            if (isVowel(c)) {
                sb.append(s);
            }
            else{
                sb.append(s.substring(1));
                sb.append(s.charAt(0));
            }
            sb.append("ma");
            for (int i = 1; i <=count; i++) {
                sb.append("a");

            }
            sb.append(" ");
            count++;
        }
        return sb.toString().trim();
    }
    
}