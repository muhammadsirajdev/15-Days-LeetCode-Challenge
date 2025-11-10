class Solution {
    public int heightChecker(int[] heights) {
        // Step 1: Make a copy and sort it
        int[] expected = heights.clone();
        Arrays.sort(expected);

        // Step 2: Count how many indices differ
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }

        // Step 3: Return the result
        return count;
    }
}
