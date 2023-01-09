class Solution {
    public long minimumHealth(int[] damage, int armor) {
        long health = 0, max = 0;
        for (int i : damage) {
            health += i;
            max = Math.max(max, i);
        }
        return health - Math.min(armor, max) + 1;
    }
}