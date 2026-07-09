class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] freq = new int[26];
        licensePlate = licensePlate.toLowerCase();
        for (char ch : licensePlate.toCharArray()) {

            if (Character.isLetter(ch)) {
                freq[ch - 'a']++;
            }

        }
        String res = "";
        for (String s : words) {
            if (FreqSame(s, freq)) {
                if (res.equals("") || s.length() < res.length()) {
                    res = s;
                   
                }
            }
        }
        return res;
    }

    public boolean FreqSame(String s, int[] freq) {
        int[] wordFreq = new int[26];
        for (char ch : s.toCharArray()) {
            wordFreq[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] > wordFreq[i]) {
                return false;
            }
        }
        return true;

    }

}