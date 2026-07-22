class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        String clean = s.trim();

        for (int i = clean.length() -1; i>=0; i--) {
            if (clean.charAt(i) == ' ') {
                return count;
            } else {
                count++;
            }
        }
        return count;
    }
}