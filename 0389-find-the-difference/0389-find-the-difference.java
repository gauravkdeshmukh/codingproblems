class Solution {
    public char findTheDifference(String s, String t) {
        byte[] sb = s.getBytes();
        byte[] tb = t.getBytes();
        byte acc = 0;

        final int n = sb.length;
        for (int i = 0; i < n; ++i) {
            acc ^= sb[i] ^ tb[i];
        }
        acc ^= tb[n];
        return (char) acc;
    }
}