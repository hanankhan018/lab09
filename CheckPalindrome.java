class CheckPalindrome {

    public boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        CheckPalindrome cp = new CheckPalindrome();
        System.out.println(cp.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
