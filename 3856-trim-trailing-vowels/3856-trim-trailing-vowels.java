class Solution {

    public boolean isVowel(char ch) {
        if (ch == 'e' || ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }

    public String trimTrailingVowels(String s) {
        s = s.toLowerCase();
        int n = s.length();
        int i = n - 1;
        while (i >= 0 && isVowel(s.charAt(i))) {
            i--;
        }
        return s.substring(0,i+1);

    }
}