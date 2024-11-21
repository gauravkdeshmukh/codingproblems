class Solution {
    public double findMedianSortedArrays(int[] inputX, int[] inputY) {
         if(inputY.length < inputX.length) {
            return findMedianSortedArrays(inputY, inputX);
        }
        int x = inputX.length, y = inputY.length; 
        int low = 0;
        int high = x;
        while(low <= high) {
            int partitionX = (low+high)/2;
            int partitionY = (x+y+1)/2 - partitionX;
            
            int maxLeftX = partitionX == 0 ? Integer.MIN_VALUE : inputX[partitionX-1];
            int maxLeftY = partitionY == 0 ? Integer.MIN_VALUE : inputY[partitionY-1];

            int minRightX = partitionX == x ? Integer.MAX_VALUE : inputX[partitionX];
            int minRightY = partitionY == y ? Integer.MAX_VALUE : inputY[partitionY];

            if(maxLeftX <= minRightY && maxLeftY <= minRightX) {
                if((x+y)%2 == 0) {
                    return (double)(Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY))/2;
                } else {
                    return (double) Math.max(maxLeftX, maxLeftY);
                }

            } else if (maxLeftX > minRightY) {
                high = partitionX - 1;
            } else {
                low = partitionX + 1;
            }
        }

        return 0.0;
    }
}