class Solution {
    public int heightChecker(int[] heights) {
        // Step 1: Count frequency of each height (constraint: 1 ≤ height ≤ 100)
        int[] count = new int[101];
        for (int h : heights) {
            count[h]++;
        }

        int result = 0;
        int currentHeight = 0;

        // Step 2: Go through the heights array and simulate sorted order
        for (int i = 0; i < heights.length; i++) {
            // Find the next height that still has remaining count
            while (count[currentHeight] == 0) {
                currentHeight++;
            }

            // If the current student's height is not in correct sorted position
            if (heights[i] != currentHeight) {
                result++;
            }

            // Use one instance of this height
            count[currentHeight]--;
        }

        return result;
    }
}
