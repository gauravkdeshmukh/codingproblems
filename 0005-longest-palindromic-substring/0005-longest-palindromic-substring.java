class Solution {
    /* Solving Longest Palindrome Using Manacher's Algorithm */

    public String longestPalindrome(String s) {
    if (s == null || s.length() < 1) return "";

    // Step 1: Transform the string.
    String transformed = transformString(s);
    int n = transformed.length();
    int[] P = new int[n]; // Radius array
    int center = 0, right = 0;

    int maxLen = 0, centerIndex = 0;

    // Step 2: Iterate over the transformed string.
    for (int i = 0; i < n; i++) {
        // Find the mirror index of `i` with respect to `center`.
        int mirror = 2 * center - i;

        // Initialize P[i] using the mirror property.
        if (i < right) {
            P[i] = Math.min(right - i, P[mirror]);
        }
        // Attempt to expand the palindrome centered at `i`.
        while (i + P[i] + 1 < n && i - P[i] - 1 >= 0
                && transformed.charAt(i + P[i] + 1) == transformed.charAt(i - P[i] - 1)) {
            P[i]++;
        }

        // Update center and right if the palindrome expands beyond the current boundary.
        if (i + P[i] > right) {
            center = i;
            right = i + P[i];
        }

        // Track the longest palindrome.
        if (P[i] > maxLen) {
            maxLen = P[i];
            centerIndex = i;
        }
    }

    // Step 3: Extract the longest palindromic substring.
    int start = (centerIndex - maxLen) / 2; // Map back to original string.
    return s.substring(start, start + maxLen);
}

// Helper function to transform the string.
private String transformString(String s) {
    StringBuilder sb = new StringBuilder();
    sb.append('#');
    for (char c : s.toCharArray()) {
        sb.append(c).append('#');
    }
    return sb.toString();
}

}