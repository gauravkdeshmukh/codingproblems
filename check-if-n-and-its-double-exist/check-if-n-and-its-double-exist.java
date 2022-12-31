class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> data = new HashSet<>();
        Arrays.sort(arr);

    for (int i = 0; i < arr.length; ++i) {
        int currentValue = arr[i];

        if (i > 0 && currentValue != 0 && currentValue == arr[i - 1]) {
            continue;
        }

        if (data.contains(2 * currentValue) || data.contains(currentValue)) {
            return true;
        }

        data.add(currentValue);
        data.add(2 * currentValue);
    }

    return false;
  }  
}