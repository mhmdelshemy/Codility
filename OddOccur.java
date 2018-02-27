class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        int unpaired = 0;
		for (int number : A) {
			unpaired ^= number;
		}
		return unpaired;
	}
    }