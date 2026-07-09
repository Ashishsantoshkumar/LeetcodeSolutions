class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {

        int[] licenseFreq = new int[26];

        for (char ch : licensePlate.toCharArray()) {
            if (Character.isLetter(ch)) {
                licenseFreq[Character.toLowerCase(ch) - 'a']++;
            }
        }

        String ans = "";

        for (String word : words) {

            if (isComplete(word, licenseFreq)) {

                if (ans.equals("") || word.length() < ans.length()) {
                    ans = word;
                }
            }
        }

        return ans;
    }


    private boolean isComplete(String word, int[] licenseFreq) {

        int[] wordFreq = new int[26];

        for (char ch : word.toCharArray()) {
            wordFreq[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (wordFreq[i] < licenseFreq[i]) {
                return false;
            }
        }

        return true;
    }
}