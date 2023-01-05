class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : tasks) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int round = 0;
        for (int count : map.values()) {
            if (count == 1) {
                return -1;
            }
            round += count / 3;
            if (count % 3 != 0) {
                round++;
            }
        }

        return round;
    }
}