class Solution {
    private int[] rotations = new int[]{0, 1, -1, -1, -1, -1, 9, -1, 8, 6};
    public boolean confusingNumber(int n) {
        	int nClone = n;
	        int rotated = 0;
	
	        while (n != 0) {
		    int rotatedTail = rotations[n % 10];
		    if (rotatedTail == -1) return false;
		    rotated = rotated * 10 + rotatedTail;
		    n /= 10;
	    }
        return nClone != rotated;
    }
}