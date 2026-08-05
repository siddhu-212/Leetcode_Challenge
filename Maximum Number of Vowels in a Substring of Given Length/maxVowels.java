class Solution {
    public int maxVowels(String s, int k) {
         int count = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (isVowel(ch)) {
                count++;
            }

            if (i >= k && isVowel(s.charAt(i - k))) {
                count--;
            }

            max = Math.max(max, count);
        }

        return max;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }
}