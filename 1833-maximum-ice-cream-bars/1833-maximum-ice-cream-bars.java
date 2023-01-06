class Solution {
    public int maxIceCream(int[] costs, int coins) {
       PriorityQueue<Integer> queue = new PriorityQueue<>();
	    for(int cost: costs) queue.offer(cost);
	    int result=0;
	    for(;!queue.isEmpty() && queue.peek() <= coins;result++){
            coins -= queue.poll();
        }
	    return result; 
    }
}