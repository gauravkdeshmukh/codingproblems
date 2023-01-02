class Solution1 {
    public int getIntegerValue(int x, int y, int b) {
        // mathematical solution
        return (x * b) + (y * (1 - b));
    }
}

class Solution2 {
    public int getIntegerValue(int x, int y, int b) {
        // bit operations solution
        return (((b << 31) >> 31) & x) | (((~b << 31) >> 31) & y);
    }
}