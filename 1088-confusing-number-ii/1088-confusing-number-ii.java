class Solution {
    public int confusingNumberII(int N) {
        Map<Integer, Integer> map = new HashMap<>();
	    map.put(0, 0); map.put(1, 1); map.put(8, 8); map.put(9, 6); map.put(6, 9);

	    int result = 0, num, invertedNum;
	    for(int i = 6;i<=N;i++) {
		    num = i;
		    invertedNum = 0;
		    while(num != 0) {
			    if(map.get(num%10) == null) {
				    invertedNum = i += i/num-1;         // Skip next (i/num-1) numbers
				    break;
			    }
			    invertedNum = invertedNum * 10 + map.get(num%10);
			    num/=10;
		    }
		    if(invertedNum != i) result ++;
	    }
	    return result;
    }
}