import java.util.HashSet;

class LongestUniqueSubstring {

    public int longestUniqueSubstring(String str) {
        int maxLength = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < str.length(); right++) {
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestUniqueSubstring lus = new LongestUniqueSubstring();
        System.out.println(lus.longestUniqueSubstring("abcabcbb")); // Output: 3
    }
}
