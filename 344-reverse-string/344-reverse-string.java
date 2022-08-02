class Solution {
    
    private char[] swap(char[] arr, int a, int b){
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }
    
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end){
            s = swap(s, start, end);
            start++;
            end--;
        }
    }
}