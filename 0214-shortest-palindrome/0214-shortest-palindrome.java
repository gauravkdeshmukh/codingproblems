class Solution {
    public String shortestPalindrome(String s) {
    if (s == null || s.length() <= 1) {
        return s;
    }

    // Step 1: Reverse the string
    String rev_s = new StringBuilder(s).reverse().toString();

    // Step 2: Concatenate original and reversed strings with a separator
    String combined = s + "#" + rev_s;

    // Step 3: Compute the prefix function (KMP partial match table)
    int[] prefixTable = computeKMPTable(combined);

    // Step 4: Find the longest palindromic prefix length
    int longestPrefixPalindromeLength = prefixTable[combined.length() - 1];

    // Step 5: Add the remaining characters in reverse to the front
    String nonPalindromeSuffix = s.substring(longestPrefixPalindromeLength);
    return new StringBuilder(nonPalindromeSuffix).reverse().toString() + s;
}

// Helper function to compute the KMP table
private int[] computeKMPTable(String str) {
    int n = str.length();
    int[] table = new int[n];
    int j = 0; // Length of the previous longest prefix-suffix

    for (int i = 1; i < n; i++) {
        while (j > 0 && str.charAt(i) != str.charAt(j)) {
            j = table[j - 1];
        }
        if (str.charAt(i) == str.charAt(j)) {
            j++;
        }
        table[i] = j;
    }
    return table;
    }
}